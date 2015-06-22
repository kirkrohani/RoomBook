package roombook.reservations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import roombook.guests.Guest;
import roombook.rooms.IRoom;

public class RoomReservation implements IReservation 
{
	private Guest primaryGuest;
	private IRoom guestRoom;
	private LocalDate checkinDate;
	private LocalDate checkoutDate;
	private int numberOfGuests;
	private double pricePerNight;
	private int numberOfNights;
	
	public RoomReservation(Guest guest, IRoom room, String in, String out, int totalNumGuests) 
	{
		this.primaryGuest = guest;
		this.guestRoom = room;
		this.checkinDate = LocalDate.parse(in, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.checkoutDate = LocalDate.parse(out, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.numberOfNights = this.checkinDate.until(this.checkoutDate).getDays();
		this.numberOfGuests = totalNumGuests;
		this.pricePerNight = room.getPrice();
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
	public IRoom getGuestRoom() {
		return guestRoom;
	}

	@Override
	public void setGuestRoom(IRoom guestRoom) {
		this.guestRoom = guestRoom;
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
		return "Reservation for " + this.primaryGuest + " w/" 
				+ this.numberOfGuests + " people " + " staying for " 
				+ this.numberOfNights + " nights " + " in room-"
				+ this.guestRoom + " CHECK IN on " + this.checkinDate
				+ " and CHECK OUT on " + this.checkoutDate;
	}
	
	
}
