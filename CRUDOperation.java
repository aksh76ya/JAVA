package com.jdbcexamples;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDOperation {
// Employee
	PreparedStatement pst;
	ResultSet rs;
	public void storeData(Employee e) {
	String sql="insert into employee(eid, ename, city, role, salary) values(?, ?, ?, ?, ?)";	
	
	try {
		pst= new DBConnection().getConnection().prepareStatement(sql);
		pst.setInt(1, e.getId());
		pst.setString(2, e.getName());
		pst.setString(3, e.getCity());
		pst.setString(4, e.getRole());
		pst.setFloat(5, e.getSalary());
		int res=pst.executeUpdate();
		if(res>0) {
			System.out.println("Data inserted successfully");
		}
	}
	catch(SQLException s) {
		s.printStackTrace();
	}
	}
	public void retrieve() {
		String sql="select * from employee";
		try {
			pst=new DBConnection().getConnection().prepareStatement(sql);
			
			rs=pst.executeQuery();
			System.out.println("EID \t ENAME \t CITY \t ROLE \t SALARY");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getFloat(5));
				}	
		}
		catch (SQLException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
	public void retrieve(int i) {
		String sql="select * from employee where eid=?";
		try {
			pst=new DBConnection().getConnection().prepareStatement(sql);
			pst.setInt(1, i);
			rs=pst.executeQuery();
			System.out.println("EID \t ENAME \t CITY \t ROLE \t SALARY");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getFloat(5));
				}	
		}
		catch (SQLException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
	public void updateRole(String role, int i) {
		String sql= "update employee set role=? where eid=?";
		try {
			pst=new DBConnection().getConnection().prepareStatement(sql);
			pst.setString(1, role);
			pst.setInt(2, i);
			pst.executeUpdate();
			System.out.println("Updated Successfuly/.");
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}
	public void deleteEmp(int i) {
		String sql="delete from employee where eid=?";
		try {
			pst=new DBConnection().getConnection().prepareStatement(sql);
			
			pst.setInt(1, i);
			pst.executeUpdate();
			System.out.println("Deleted Successfuly/.");
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
