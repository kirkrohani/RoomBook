package roombook.reservation;

import java.util.List;

import roombook.dao.GuestsDAO;
import roombook.guest.Guest;
import roombook.room.Guestroom;
import roombook.room.IRoom;

public class ReservationService implements IReservationService 
{
	private GuestsDAO guestsData;
	private ReservationDAO reservationData;
	
	public ReservationService() 
	{
		guestsData = new GuestsDAO();
		reservationData = new ReservationDAO();
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
	public IReservation createReservation(Guest guest, IRoom room, String in, String out, String numAdults, String numChildren,
					String earlyCheckIn,String lateCheckOut, String smoking, String pets, String parking)
	{
		//Default number of guests must be 1
		int totalGuests = 1;
		if (numAdults != null && !numAdults.isEmpty() && numChildren != null && !numChildren.isEmpty())
			totalGuests = Integer.parseInt(numAdults) + Integer.parseInt(numChildren) ;
		
	
		boolean earlyCheckInTime = false;
		if (earlyCheckIn != null && !earlyCheckIn.isEmpty())
			earlyCheckInTime = true;
		
		boolean lateCheckOutTime = false;
		if (lateCheckOut != null && !lateCheckOut.isEmpty())
			lateCheckOutTime = true;
		
	
		boolean smokingRequested = false;
		if (smoking != null && !smoking.isEmpty())
			smokingRequested = true;
		
		boolean petRoomRequested = false;
		if (pets != null && !pets.isEmpty())
			petRoomRequested = true;
		
		boolean parkingRequested = false;
		if (parking != null && !parking.isEmpty())
			parkingRequested = true;
		
		IReservation reservation = new Reservation(guest, room, in, out, totalGuests,earlyCheckInTime, lateCheckOutTime, smokingRequested, petRoomRequested, parkingRequested);
	
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
