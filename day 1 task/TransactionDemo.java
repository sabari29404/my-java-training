package jdbc_revise_project;

import java.sql.*;
public class TransactionDemo {
	
	static final String url =
            "jdbc:mysql://localhost:3306/students_records";

    static final String userName = "root";
    static final String password = "12345";
    
    static String query1 = "UPDATE students SET email=? WHERE id=?";

    static String query2 = "UPDATE students SET email=? WHERE id=?";


    public static void main(String[] args) {

        successfulTransaction();

        failedTransaction();
    }


   

    static void successfulTransaction() {

        

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    url, userName, password
            );

           
            con.setAutoCommit(false);


            
            try (PreparedStatement ps1 =
                         con.prepareStatement(query1)) {

                ps1.setString(1, "student1_new@example.com");
                ps1.setInt(2, 1);

                ps1.executeUpdate();
            }


           
            try (PreparedStatement ps2 =
                         con.prepareStatement(query2)) {

                ps2.setString(1, "student2_new@example.com");
                ps2.setInt(2, 2);

                ps2.executeUpdate();
            }


            // Both operations succeeded
            con.commit();

            System.out.println(
                    "Transaction committed successfully"
            );


        } catch (SQLException e) {

           
            if (con != null) {

                try {
                    con.rollback();

                    System.out.println(
                            "Transaction rolled back"
                    );

                } catch (SQLException rollbackException) {
                    rollbackException.printStackTrace();
                }
            }

            e.printStackTrace();

        } finally {

            if (con != null) {

                try {
                    con.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    

    static void failedTransaction() {


        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    url, userName, password
            );

            con.setAutoCommit(false);


            
            try (PreparedStatement ps1 =
                         con.prepareStatement(query1)) {

                ps1.setString(1, "temporary@example.com");
                ps1.setInt(2, 1);

                ps1.executeUpdate();

                System.out.println(
                        "Operation 1 completed"
                );
            }


            
            try (PreparedStatement ps2 =
                         con.prepareStatement(query2)) {

                ps2.setString(1, "another@example.com");

                
                ps2.setInt(2, 999); //wrong data

                int result = ps2.executeUpdate();

                if (result == 0) {
                    throw new SQLException(
                            "Student with ID 999 does not exist"
                    );
                }
            }


           
            con.commit();

            System.out.println(
                    "Transaction committed"
            );


        } catch (SQLException e) {

            if (con != null) {

                try {

                    con.rollback();

                    System.out.println(
                            "Transaction rolled back"
                    );

                } catch (SQLException rollbackException) {
                    rollbackException.printStackTrace();
                }
            }

            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );


        } finally {

            if (con != null) {

                try {
                    con.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
