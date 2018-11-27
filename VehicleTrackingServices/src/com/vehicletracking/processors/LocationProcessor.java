/**
 * 
 */
package com.vehicletracking.processors;

import java.sql.SQLException;

import com.vehicletracking.POJO.LocationPOJO;
import com.vehicletracking.POJO.VehicleTrackingPOJO;
import com.vehicletracking.utility.FileUtility;

/**
 * @author Ritudhwaj
 *
 */
public class LocationProcessor {
	/**
	 * 
	 */
	public LocationProcessor() {
	}
	
	public VehicleTrackingPOJO getLocation(String vehicleID) throws SQLException, ClassNotFoundException{
		return new LocationMapper().getMappedObject(vehicleID);
	}	
	
	public void logLocation(VehicleTrackingPOJO location){
		new FileUtility().logLocation(location.getVehicleID()+","+location.toString());
	}

}
