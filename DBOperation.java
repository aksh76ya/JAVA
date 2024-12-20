package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperation {
Connection con;
PreparedStatement pst;
ResultSet rs;
public DBOperation() {
	// TODO Auto-generated constructor stub
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chennaidb", "root", "root");
	}
	catch(ClassNotFoundException c) {}
	catch(SQLException s) {}
	
}
	
	public void storeStudent(Student st) {
		//insert
		String sql="insert into student(roll, name, course, "
				+ "marks) values (?, ?, ?, ?)";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, st.getRoll());
			pst.setString(2, st.getName());
			pst.setString(3, st.getCourse());
			pst.setFloat(4, st.getMarks());
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println(i+" no of data inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteStudent(int roll) {
		//delete
	}
	public void updateCourse(int roll, String course) {
		//update
	}
	public void retrieveStudent() {
		//select
	}
	public void retrieveStudent(int roll) {
		//select where
	}
}
