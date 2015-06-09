package roombook.core;

import java.util.ArrayList;
import java.util.List;

import roombook.rooms.*;

public class Hotel 
{
	 private List<Room> guestRooms;
	 /*
	  * REMOVE MAXROOMNUMBER WHEN YOU ADD A DATABASE
	  */
	 private int maxRoomNumber;
	 
	 public Hotel() 
	 {
		guestRooms = new ArrayList<Room>();
		maxRoomNumber = 0;
	 }

	 public List<Room> getGuestRooms()
	 {
		 return guestRooms;
	 }
	 
	 public void addRoom(Room room)
	 {
		 boolean roomAlreadyAdded = false;
		 for (Room r : guestRooms)
			 if (r.getNumber() == room.getNumber())
				 roomAlreadyAdded = true;
		 
		 if (!roomAlreadyAdded)
		 {
			 //MODIFY CODE WHEN A DB IS ADDED
			 maxRoomNumber++;
			 room.setNumber(maxRoomNumber);
			 guestRooms.add(room);
			 
		 }
			 
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
