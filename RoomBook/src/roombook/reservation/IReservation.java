package roombook.reservation;

import java.util.Date;

import roombook.guest.Guest;
import roombook.room.IRoom;

public interface IReservation 
{

	Date getCheckinDate();
	void setCheckinDate(Date checkinDate);
	Date getCheckoutDate();
	void setCheckoutDate(Date checkoutDate);
	int getNumberOfGuests();
	void setNumberOfGuests(int numberOfGuests);
	double getPricePerNight();
	void setPricePerNight(double pricePerNight);
	int getNumberOfNights();
	void setNumberOfNights(int numberOfNights);
	/*
	Guest getPrimaryGuest();
	void setPrimaryGuest(Guest guest);
	
	IRoom getGuestRoom();
	void setGuestRoom(IRoom guestRoom);
	*/
}
