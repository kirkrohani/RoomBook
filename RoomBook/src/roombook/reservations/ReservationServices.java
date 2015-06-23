package roombook.reservations;

import java.util.List;

import roombook.dao.GuestsDAO;
import roombook.dao.ReservationsDAO;
import roombook.guests.Guest;
import roombook.rooms.Guestroom;
import roombook.rooms.IRoom;

public class ReservationServices implements IReservationServices 
{
	private GuestsDAO guestsData;
	private ReservationsDAO reservationData;
	
	public ReservationServices() 
	{
		guestsData = new GuestsDAO();
		reservationData = new ReservationsDAO();
	}

	@Override
	public Guestroom getRoom(int roomNumber, List<Guestroom> rooms) 
	{
			if (rooms != null && !rooms.isEmpty())
				for(Guestroom r : rooms)
					if (r.getRoomNumber() == roomNumber)
						return r;
		
			return new Guestroom();
	}

	@Override
	public Guest createGuest(String fname, String lname, String email, String phone, String notes)
	{		
		Guest guest = new Guest(fname, lname, email, phone, notes);
		try
		{
			guestsData.insertGuest(guest);
		}
		catch (Exception e)
		{
			System.out.println("EXCEPTION in createGuest() method: " + e.getMessage());
			return null;
		}
		
		return guest;
	}
	
	@Override
	public Reservation createReservation(String checkin, String checkout, String numAdults, String numChildren)
	{
		//Default number of guests must be 1
		int totalGuests = 1;
		if (numAdults != null && !numAdults.isEmpty() && numChildren != null && !numChildren.isEmpty())
			totalGuests = Integer.parseInt(numAdults) + Integer.parseInt(numChildren) ;
		
		
		Reservation reservation = new Reservation(checkin, checkout, totalGuests);
		
		try
		{
			reservationData.insertReservation(reservation);
		}
		catch (Exception e)
		{
			System.out.println("EXCEPTION in createReservation(): " + e.getMessage());
			return null;
		}
		
		return reservation;
	}

}
