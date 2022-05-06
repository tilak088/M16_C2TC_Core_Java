package com.indiabix.jdbc.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) throws SQLException {
		//1.download mysql j connector download for java
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
		String username="root";
		String password="jenny";
		String query="SELECT * FROM Employee12";
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(query);
			while(r.next())
			{
				String EmployeesData="";
				for(int i=1;i<=3;i++)
				{
					EmployeesData=EmployeesData+" "+r.getString(i);
				}
				System.out.println(EmployeesData);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid Username and password");
		}
	}
}