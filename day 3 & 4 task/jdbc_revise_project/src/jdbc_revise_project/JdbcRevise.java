package jdbc_revise_project;

import java.sql.*;

public class JdbcRevise {

	static final String url="jdbc:mysql://localhost:3306/students_records";
	static final String userName="root";
	static final String password="12345";
	
	public static void main(String[] args) {

		selectData();
//		selectSingleData();
//		createTable();
//		insertTable();
//		updateTable();
//		deleteData();
		
	}
	
	static void selectData() {
//		String query="select * from students";
		String query="select * from roughtable";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);) {
			while(rs.next()) {
//				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email"));
				System.out.println(rs.getString("name")+" "+rs.getLong("age"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void selectSingleData() {
		String query="select * from students";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);) {
			if(rs.next()) {
				System.out.println("Id is "+rs.getInt(1));
				System.out.println("name is "+rs.getString(2));
				System.out.println("Email is "+rs.getString(3));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void createTable() {
		String query="create table roughtable(name varchar(30), age int);";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				Statement st = con.createStatement();){
				st.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void insertTable() {
		String query="insert into roughtable values('geash',17);";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				Statement st=con.createStatement();){
			int result=st.executeUpdate(query);
			System.out.println(result+" lines inserted");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	static void updateTable() {
		String query="update roughtable set age=21 where name='mj';";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				Statement st=con.createStatement();){
			int result=st.executeUpdate(query);
			System.out.println(result+" lines updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void deleteData() {
		String query="delete from roughtable where name='geash';";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				Statement st=con.createStatement();){
			int result=st.executeUpdate(query);
			System.out.println(result+" lines deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
