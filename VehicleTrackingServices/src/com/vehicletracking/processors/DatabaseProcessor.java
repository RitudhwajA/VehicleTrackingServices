/**
 * 
 */
package com.vehicletracking.processors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ritudhwaj
 *
 */
public class DatabaseProcessor {

	/**
	 * 
	 */
	public DatabaseProcessor() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultSet readData() throws ClassNotFoundException{
		Connection conn = null;
		ResultSet rs = null;
		try {
			System.out.println("number 3");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/VehicleServices","root","root123");
			System.out.println("number 4");
			Statement stat = conn.createStatement();
			rs = stat.executeQuery("select * from VehicleDetails");
			System.out.println("number 5");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	/*public static void main(String args[]){
		logData();
	}
	*/

}
