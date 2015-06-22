package roombook.reservations;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import roombook.guests.Guest;
import roombook.rooms.Guestroom;

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
	public IReservation getReservationData(HttpServletRequest request)
	{
		System.out.println("Getting data from user input to make a reservation");
		String checkInDate = request.getParameter("checkinDate");
		String checkoutDate = request.getParameter("checkoutDate");
		int numOfAdults = Integer.parseInt(request.getParameter("numberOfAdults"));
		int numOfChildren = Integer.parseInt(request.getParameter("numberOfChildren"));
		int totalGuests = numOfAdults + numOfChildren;
		
		Guest guest = new Guest(request.getParameter("firstName"), 
								request.getParameter("lastName"), 
								request.getParameter("email"), 
								request.getParameter("phone"),
								request.getParameter("notes"));
		
		return new RoomReservation(guest, checkInDate, checkoutDate, totalGuests, 59.99); 
		
	}

}
