package com.vehicletracking.POJO;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VehicleTrackingPOJO extends BasePOJO {
	private String vehicleID;
	private Date start_time;
	private List<LocationPOJO> locations;
	private CustomErrorPOJO error;

	public VehicleTrackingPOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vehicleID
	 * @param locations
	 */
	public VehicleTrackingPOJO(String vehicleID, Date start_time,List<LocationPOJO> locations) {
		this.vehicleID = vehicleID;
		this.start_time=start_time;
		this.locations = locations;
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
	 * @return the start_time
	 */
	public Date getStart_time() {
		return start_time;
	}

	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	/**
	 * @return the locations
	 */
	public List<LocationPOJO> getLocations() {
		return locations;
	}

	/**
	 * @param locations the locations to set
	 */
	public void setLocations(List<LocationPOJO> locations) {
		this.locations = locations;
	}

	/**
	 * @return the error
	 */
	public CustomErrorPOJO getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(CustomErrorPOJO error) {
		this.error = error;
	}

	
}
