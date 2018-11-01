/**
 * 
 */
package com.vehicletracking.processors;

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
	
	public VehicleTrackingPOJO getLocation(String vehicleID){
		VehicleTrackingPOJO loc;
		String[] locationDetails=new FileUtility().getLastLoggedLocation(vehicleID).split(",");
		loc=new VehicleTrackingPOJO(locationDetails[0],new LocationPOJO(locationDetails[1], locationDetails[2], locationDetails[3]));
		return loc;
	}
	
	public void logLocation(VehicleTrackingPOJO location){
		new FileUtility().logLocation(location.getVehicleID()+","+location.toString());
	}

}
