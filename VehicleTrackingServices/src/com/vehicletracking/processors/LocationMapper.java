/**
 * 
 */
package com.vehicletracking.processors;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.vehicletracking.POJO.VehicleTrackingPOJO;

/**
 * @author Ritudhwaj
 *
 */
public class LocationMapper {
	VehicleTrackingPOJO vehicleTracking;

	/**
	 * 
	 */
	public LocationMapper() {
		vehicleTracking=new VehicleTrackingPOJO();
	}

	protected VehicleTrackingPOJO getMappedObject() throws SQLException, ClassNotFoundException{
		ResultSet rs=new DatabaseProcessor().readData();
		while(rs.next()){
			vehicleTracking.setVehicleID(rs.getString("vehicle_id"));
			vehicleTracking.setStart_time(rs.getDate("start_time"));
			//ArrayList<String> locations=new 
		}
		return vehicleTracking;
	}
	
	protected VehicleTrackingPOJO getMappedObject(String vehicle_id) throws SQLException, ClassNotFoundException{
		ResultSet rs=new DatabaseProcessor().readData();
		while(rs.next()){
			if(rs.getString("vehicle_id").equals(vehicle_id)){
				vehicleTracking.setVehicleID(rs.getString("vehicle_id"));
				vehicleTracking.setStart_time(rs.getDate("start_date"));
			}
			
			//ArrayList<String> locations=new 
		}
		return vehicleTracking;
	}
}
