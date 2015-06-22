package roombook.rooms;

import java.util.List;

public interface IRoomServices 
{
	public List<Guestroom> getAllRooms();
	public List<String> getAllRoomTypes();
}
