/**
 * 
 */
package com.vehicletracking.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.vehicletracking.POJO.LocationPOJO;
import com.vehicletracking.POJO.VehicleTrackingPOJO;
import com.vehicletracking.processors.LocationProcessor;

/**
 * @author Ritudhwaj
 *
 */
@Path("/vehicletracking")
public class vehicleTrackingService {

	/**
	 * 
	 */
	public vehicleTrackingService() {
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/getLocation/{vehicleID}")
	@Produces(MediaType.APPLICATION_XML)
	public VehicleTrackingPOJO getLocation(@PathParam("vehicleID") String vehicleID) throws SQLException, ClassNotFoundException {
		return new LocationProcessor().getLocation(vehicleID);
	}

	@POST
	@Path("/logLocation/{vehicleID}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void logLocation(@PathParam("vehicleID") String vehicleID, @FormParam("timestamp") String timestamp,
			@FormParam("latitude") String latitude, @FormParam("longitude") String longitude,
			@Context HttpServletResponse servletResponse) throws IOException {
		List<LocationPOJO> locations =new ArrayList<>();
		locations.add(new LocationPOJO(timestamp, latitude, longitude));
		VehicleTrackingPOJO vTrack = new VehicleTrackingPOJO(vehicleID,new java.sql.Date(System.currentTimeMillis()) ,locations);
		new LocationProcessor().logLocation(vTrack);
	}

}
