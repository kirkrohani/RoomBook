package roombook.core;

import java.util.ArrayList;
import java.util.List;

import roombook.rooms.*;

public class Hotel 
{
	 private List<IRoom> guestRooms;
	 /*
	  * REMOVE MAXROOMNUMBER WHEN YOU ADD A DATABASE
	  */
	 private int maxRoomNumber;
	 public static double DEFAULT_BASE_PRICE = 49.99;
	 
	 public Hotel() 
	 {
		guestRooms = new ArrayList<IRoom>();
		maxRoomNumber = 0;
	 }

	 public List<IRoom> getGuestRooms()
	 {
		 return guestRooms;
	 }
	 

	 
	 public int getNumberOfRooms()
	 {
		 return guestRooms.size();
	 }
	 
	 public int getMaxRoomNumber()
	 {
		 return this.maxRoomNumber;
	 }
}
