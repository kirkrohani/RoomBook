package roombook.reservations;

import java.util.List;
import roombook.guests.Guest;
import roombook.rooms.Guestroom;
import roombook.rooms.IRoom;

public class ReservationServices implements IReservationServices 
{

	@Override
	public Guestroom getRoom(int roomNumber, List<Guestroom> rooms) 
	{
			if (rooms != null && !rooms.isEmpty())
				for(Guestroom r : rooms)
					if (r.getNumber() == roomNumber)
						return r;
		
			return new Guestroom();
	}

	@Override
	public Guest createGuest(String fname, String lname, String email, String phone, String notes)
	{
		return new Guest(fname, lname, email, phone, notes);
	}
	
	@Override
	public IReservation createReservation(Guest guest, IRoom room, String checkin, String checkout, String numAdults, String numChildren)
	{
		//Default number of guests must be 1
		int totalGuests = 1;
		if (numAdults != null && !numAdults.isEmpty() && numChildren != null && !numChildren.isEmpty())
			totalGuests = Integer.parseInt(numAdults) + Integer.parseInt(numChildren) ;
		
		return  new RoomReservation(guest, room, checkin, checkout, totalGuests);
	}

}
