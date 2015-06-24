package roombook.reservation;

import java.util.List;

import roombook.guest.Guest;
import roombook.room.Guestroom;
import roombook.room.IRoom;

public interface IReservationServices 
{
	
	Guestroom getRoom(int roomNumber, List<Guestroom> rooms);
	Guest createGuest(String fname, String lname, String email, String phone, String notes);
	Reservation createReservation(Guest guest, IRoom room, String in, String out, String numAdults, String numChildren);

}
