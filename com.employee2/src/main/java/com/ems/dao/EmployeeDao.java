package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ems.model.Employee;
import com.ems.util.ConnectionAccess;

public class EmployeeDao {
	Connection c=ConnectionAccess.getConnection();
	//crud opertaion logic
	public boolean insertEmployee(Employee e) {
		if(e==null) return false;
		try {
			PreparedStatement ps=c.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getJob());
			ps.executeUpdate();
			return true;
		} catch(SQLException e1) {
			return false;
		}
		finally {
			ConnectionAccess.closeConnection(c);
			
		}
	}
	public void readEmployees() {
		try {
			ResultSet re=c.createStatement().executeQuery("select * from employee");
			while(re.next()) {
				System.out.println("employee id is "+re.getInt(1));
				System.out.println("employee name is "+re.getString(1));
				System.out.println("employee job is "+re.getString(1));
				System.out.println("-----------------------------------------------");
				
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}
