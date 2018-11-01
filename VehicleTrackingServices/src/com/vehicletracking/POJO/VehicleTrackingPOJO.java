package com.vehicletracking.POJO;

public class VehicleTrackingPOJO extends BasePOJO {
	private String vehicleID;
	private LocationPOJO location;

	public VehicleTrackingPOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vehicleID
	 * @param location
	 */
	public VehicleTrackingPOJO(String vehicleID, LocationPOJO location) {
		this.vehicleID = vehicleID;
		this.location = location;
	}

	/**
	 * @return the vehicleID
	 */
	public String getVehicleID() {
		return vehicleID;
	}

	/**
	 * @param vehicleID the vehicleID to set
	 */
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	/**
	 * @return the location
	 */
	public LocationPOJO getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(LocationPOJO location) {
		this.location = location;
	}

}
