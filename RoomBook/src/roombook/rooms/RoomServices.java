package roombook.rooms;

import java.util.ArrayList;
import java.util.List;

import roombook.dao.GuestroomDAO;

public class RoomServices implements IRoomServices 
{
	
	//CONSTANT for the number of rooms we will display on a general room search
	private static final int pagingSize = 9;
	private GuestroomDAO roomData;
	
	public RoomServices() 
	{
		this.roomData = new GuestroomDAO();
	}
	
	
	/*
	 * Service method which calls the Guestroom DAO to execute:
	 * QUERY: "SELECT r from Guestroom r"
	 * RETURNS: All guest rooms in the hotel
	 */
	@Override
	public List<Guestroom> getAllRooms()
	{
		return roomData.getAllRooms();
	}
	
	
	/*
	 * Service method which calls the Guestroom DAO to execute:
	 * QUERY: "SELECT DISTINCT(room.type) from Guestroom room"
	 * RETURNS: All unique room types at the hotel
	 */
	@Override
	public List<String> getAllRoomTypes()
	{
		List<String> roomTypes = new ArrayList<String>();
		List<Object[]> results = roomData.getAllRoomTypes();
		if ( results != null)
			for (Object[] result : results)
				roomTypes.add(result[0] + " " + result[1]);
		
		return roomTypes;
	}
	
	
	public int getPagingStartingIndex(int pageNumber)
	{
		if (pageNumber == 1)
			return pageNumber;
		else
			return ( ((pageNumber-1)*pagingSize)+1);
	}
	
	public int getPagingEndingIndex(int pageNumber)
	{
		if (pageNumber == 1)
			return pagingSize;
		else
			return (pageNumber*pagingSize);
	}
	
	public int getTotalNumberOfPages(int totalRecords)
	{
		return (totalRecords/pagingSize)+1;
	}
	

}
