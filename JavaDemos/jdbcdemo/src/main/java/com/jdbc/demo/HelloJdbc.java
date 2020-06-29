package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			//step1; Loading the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded succesfully!");
			
			//step2; Creating a connection;
			String url = "jdbc:mysql://localhost:3306/bnp";
			String username = "root";
			String password = "@Jarvis7698";
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful!");
			
			//step3; Statement;
			Statement statement = conn.createStatement();
			String sql = "SELECT id,name,age,gender,teamName FROM bnp.player;";
			
			//step4; Execute query;
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query Executed!");
			
			//step5; process and print;
			System.out.println("\nPlayer Details");
			System.out.println(new String(new char[15]).replace('\0', '-'));
			while(resultSet.next()) {
				System.out.println("\n  ID: "+resultSet.getInt("id"));
				System.out.println("  Name: "+resultSet.getString("name"));
				System.out.println("  Age: "+resultSet.getInt("age"));
				System.out.println("  Team: "+resultSet.getString("teamName"));
				System.out.println("  Gender: "+resultSet.getString("gender"));
			}
			System.out.println("\nResults processed!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load driver! "+e.getMessage());
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				//step6; Closing the connection;
				conn.close();
				System.out.println("Connection Closed!");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
