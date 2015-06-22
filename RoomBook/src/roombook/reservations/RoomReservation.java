package roombook.reservations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import roombook.guests.Guest;

public class RoomReservation implements IReservation 
{
	private Guest primaryGuest;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	private int numberOfGuests;
	private double pricePerNight;
	private int numberOfNights;
	
	public RoomReservation(Guest guest, String in, String out, int guests, double price) 
	{
		this.primaryGuest = guest;
		this.checkinDate = LocalDate.parse(in, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.checkoutDate = LocalDate.parse(out, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.numberOfGuests = guests;
		this.pricePerNight = price;
	}

	@Override
	public Guest getGuest() {
		return primaryGuest;
	}

	@Override
	public void setGuest(Guest guest) {
		this.primaryGuest = guest;
	}

	@Override
	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	@Override
	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}

	@Override
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	@Override
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	@Override
	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	@Override
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	@Override
	public double getPricePerNight() {
		return pricePerNight;
	}

	@Override
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	@Override
	public int getNumberOfNights() {
		return numberOfNights;
	}

	@Override
	public void setNumberOfNights(int numberOfNights) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "Reseration for " + this.primaryGuest + " from " 
				+ this.numberOfGuests + " guests " + " for " 
				+ this.numberOfNights + " nights " + " checking in on " + this.checkinDate
				+ " and checking out on " + this.checkoutDate;
	}
	
	
}
