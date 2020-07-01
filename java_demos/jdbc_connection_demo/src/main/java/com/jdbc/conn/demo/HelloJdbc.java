package com.jdbc.conn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class HelloJdbc {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver here!");
			
			String url = "jdbc:mysql://127.0.0.1:3306/bnp";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connection established");
			
			Statement statement = connection.createStatement();
			String sql = "select id,name,teamName,age,gender from player";
			
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			
			while(resultSet.next()) {
				
				System.out.print("Player id "+resultSet.getInt("id"));
				System.out.print(" name "+resultSet.getString("name"));
				System.out.print(" teamName "+resultSet.getString("teamName"));
				System.out.print(" age "+resultSet.getInt("age"));
				System.out.println(" gender "+resultSet.getString("gender"));
								
			}
			
			System.out.println("Result processed");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
