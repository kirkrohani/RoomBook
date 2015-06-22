package roombook.reservations;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import roombook.rooms.Guestroom;

public interface IReservationServices 
{
	
	Guestroom getRoom(int roomNumber, List<Guestroom> rooms);
	IReservation getReservationData(HttpServletRequest request);

}
