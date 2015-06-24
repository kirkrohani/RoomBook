package roombook.reservations;

import java.util.List;

import roombook.guests.Guest;
import roombook.rooms.Guestroom;
import roombook.rooms.IRoom;

public interface IReservationServices 
{
	
	Guestroom getRoom(int roomNumber, List<Guestroom> rooms);
	Guest createGuest(String fname, String lname, String email, String phone, String notes);
	Reservation createReservation(Guest guest, IRoom room, String in, String out, String numAdults, String numChildren);

}
