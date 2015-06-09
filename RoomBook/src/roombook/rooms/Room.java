package roombook.rooms;

public interface Room 
{
	public void setNumber(int num);
	public int getNumber();
	public int getSize();
	public RoomStatus getStatus();
	public boolean getOccupied();

}
