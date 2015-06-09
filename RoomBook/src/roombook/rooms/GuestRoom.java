package roombook.rooms;

import java.util.Map;
import java.util.HashMap;
import roombook.core.*;

public class GuestRoom implements Room
{
	private int number;
	private int size;
	private boolean occupied;
	private RoomStatus status;
	private Map<Integer, BedType> beds;
	
	public GuestRoom()
	{
		
		this.size = 280;  //Default guest room size is 280 square feet
		this.occupied = false;  //Default rooms when created are not occupied
		this.status = RoomStatus.CLEAN;  //Default rooms when created are clean
		setBeds(2,BedType.DOUBLE); //Default room types when created are 2 bed doubles
		
	}
	
	public GuestRoom(int numberOfBeds, BedType type)
	{
		
		setBeds(numberOfBeds, type);
		
	}
	
	
	private void setBeds(int numberOfBeds, BedType type)
	{
		this.beds = new HashMap<Integer,BedType>();
		beds.put(numberOfBeds, type);
	}
	
	@Override
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
	@Override
	public int getNumber() 
	{
		return this.number;
	}
	@Override
	public boolean getOccupied() 
	{
		return this.occupied;
	}
	
	@Override
	public int getSize() 
	{
		return this.size;
	}
	
	@Override
	public RoomStatus getStatus() 
	{
		return this.status;
	}
}
