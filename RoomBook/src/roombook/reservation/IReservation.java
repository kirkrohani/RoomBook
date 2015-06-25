package roombook.reservation;

import java.util.Date;



public interface IReservation 
{

	Date getCheckinDate();
	void setCheckinDate(Date checkinDate);
	Date getCheckoutDate();
	void setCheckoutDate(Date checkoutDate);
	int getNumberOfGuests();
	void setNumberOfGuests(int numberOfGuests);
	void setRoomNumber(int roomNumber);
	int getRoomNumber();
	double getPricePerNight();
	void setPricePerNight(double pricePerNight);
	int getNumberOfNights();
	void setNumberOfNights(int numberOfNights);

}
