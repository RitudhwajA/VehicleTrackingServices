/**
 * 
 */
package com.vehicletracking.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ritudhwaj
 *
 */
public class FileUtility {
	private String vehicleLocationDetailsFileName="VehicleDetails.txt";
	/**
	 * 
	 */
	public FileUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public String getLastLoggedLocation(String vehicleID){
		String location = null;
		try(Scanner sc=new Scanner(new File(vehicleLocationDetailsFileName))){
			while(sc.hasNextLine()){
				String line=sc.nextLine();
				if(line.startsWith(vehicleID)){
					location=line;
				}
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return location;
	}
	
	public void logLocation(String location){
		File file=new File(vehicleLocationDetailsFileName);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(vehicleLocationDetailsFileName,true))){
			bw.write(location);
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
