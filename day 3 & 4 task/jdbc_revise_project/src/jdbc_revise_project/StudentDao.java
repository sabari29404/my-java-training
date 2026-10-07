package jdbc_revise_project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	
	static final String url = "jdbc:mysql://localhost:3306/students_records";
    static final String userName = "root";
    static final String password = "12345";
	
	public void insert(Student student) {
		
		String query ="INSERT INTO students (id, name, email) VALUES (?, ?, ?)";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement ps=con.prepareStatement(query)){
			ps.setLong(1, student.getId());	
			ps.setString(2, student.getName());
			ps.setString(3, student.getEmail());
			
			int result=ps.executeUpdate();
			System.out.println(result+" row inserted sucessfully");
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public Student findById(int id) {
		String query ="select * from students where id=?";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement ps=con.prepareStatement(query)){
			ps.setInt(1, id);
			
			try(ResultSet rs=ps.executeQuery();){
				if(rs.next()) {
					return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
					
				}
			} 
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public Student findByEmail(String email) {
		String query ="select * from students where email=?";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement ps=con.prepareStatement(query)){
			ps.setString(1, email);
			
			try(ResultSet rs=ps.executeQuery();){
				if(rs.next()) {
					return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
					
				}
			} 
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	    return null;
	}
	public void updateEmail(int id, String email) {
		String query="update students set email=? where id=?";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement ps=con.prepareStatement(query)){
			ps.setString(1, email);
			ps.setInt(2, id);
			int result=ps.executeUpdate();
			System.out.println(result+"rows updated successfully");
			 
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteById(int id) {
		String query="delete from students where id=?";
		try(Connection con=DriverManager.getConnection(url, userName, password);
				PreparedStatement ps=con.prepareStatement(query)){
			ps.setInt(1, id);
			int result=ps.executeUpdate();
			System.out.println(result+"rows deleted successfully");
			 
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Student> listAll() {
		List<Student> studentList=new ArrayList<>();
		 String query="select * from students";
		 try(Connection con=DriverManager.getConnection(url, userName, password);
					PreparedStatement ps=con.prepareStatement(query);
				 	ResultSet rs=ps.executeQuery()){
				while(rs.next()) {
					Student student=new Student(rs.getInt("id"),rs.getString("name"),rs.getString("email"));
					studentList.add(student);
				} 
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		return studentList;
	}

}
