/**
 * 
 */
package com.vehicletracking.POJO;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ritudhwaj
 *
 */
@XmlRootElement(name = "location") 
public class LocationPOJO extends BasePOJO{
	
	private String timestamp;
	private String latitude;
	private String longitude;

	/**
	 * 
	 */
	public LocationPOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param timestamp
	 * @param latitude
	 * @param longitude
	 */
	public LocationPOJO(String timestamp, String latitude, String longitude) {
		this.timestamp = timestamp;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return timestamp+","+latitude+","+longitude;
	}

}
