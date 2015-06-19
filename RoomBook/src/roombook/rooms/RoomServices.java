package roombook.rooms;

import java.util.List;

import roombook.dao.GuestroomDAO;

public class RoomServices implements IRoomServices 
{
	
	//CONSTANT for the number of rooms we will display on a general room search
	private static final int pagingSize = 9;
	private GuestroomDAO roomData = new GuestroomDAO();
	
	public List<Guestroom> getAllRooms()
	{
		return roomData.getAllRooms();
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
