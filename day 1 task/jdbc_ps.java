package jdbc_revise_project;

import java.sql.*;
public class jdbc_ps {

	static final String url="jdbc:mysql://localhost:3306/students_records";
	static final String userName="root";
	static final String password="12345";
	
	public static void main(String[] args) {
//		selectData();
//		selectSingleData();
//		insertTable();
//		updateTable();
		deleteTable();
	}
	
	static void selectData() {
		String query = "SELECT * FROM students";
		try(	Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs=pst.executeQuery();){
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void selectSingleData() {
		String query ="select * from students where id=?";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement pst=con.prepareStatement(query);
				){
			pst.setLong(1, 2);
			
			try(ResultSet rs=pst.executeQuery()){
				if(rs.next()) {
					System.out.println("Id is "+rs.getLong("id"));
					System.out.println("Name is "+rs.getString("name"));
					System.out.println("Mail is "+rs.getString("email"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void insertTable() {
		String query = "INSERT INTO students (id, name, email) VALUES (?, ?, ?)";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement pst=con.prepareStatement(query);){
			pst.setLong(1, 2);
			pst.setString(2, "marisa");
			pst.setString(3, "marisa@gmail.com");
			int result=pst.executeUpdate();
			System.out.println(result+" rows inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void updateTable() {

        String query = "UPDATE students SET email = ? WHERE id = ?";

        try (
                Connection con = DriverManager.getConnection(url, userName, password);
                PreparedStatement pst = con.prepareStatement(query)
        ) {

            pst.setString(1, "arun_new@example.com");
            pst.setLong(2, 6);

            int result = pst.executeUpdate();

            System.out.println(result + " rows updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	static void deleteTable() {
		String query="delete from roughtable where name=? ";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement pst=con.prepareStatement(query);){
			pst.setString(1, "geash");
			int result=pst.executeUpdate();
			System.out.println(result+" row deleted sucessfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
