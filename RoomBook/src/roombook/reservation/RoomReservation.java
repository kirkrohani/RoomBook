package roombook.reservation;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import roombook.guest.Guest;
import roombook.room.Guestroom;
import roombook.room.IRoom;


@Entity
@Table(name="Reservations")
public class RoomReservation implements IReservation 
{
	@Id
	private int reservationID;
	
	@OneToOne
	@JoinColumn(name="guestID")
	private Guest primaryGuest;
	
	@OneToOne
	@JoinColumn(name="roomNumber")
	private Guestroom guestRoom;
	
	@Temporal(TemporalType.DATE)
	private Date checkinDate;
	
	@Temporal(TemporalType.DATE)
	private Date checkoutDate;
	
	private int numberOfGuests;
	private double pricePerNight;
	private int numberOfNights;
	
	public RoomReservation() 
	{
	}
	
	public RoomReservation(Guest guest, IRoom room, String in, String out, int totalNumGuests) 
	{
		
		this.primaryGuest = guest;
		this.guestRoom = (Guestroom) room;
		
		DateTimeFormatter format = DateTimeFormat.forPattern("MM-dd-yyyy");
		LocalDate rawCheckInDate = format.parseLocalDate(in);
		this.checkinDate = rawCheckInDate.toDate();
		
		LocalDate rawCheckOutDate = format.parseLocalDate(out);
		this.checkoutDate = rawCheckOutDate.toDate();
		
		this.numberOfNights = Days.daysBetween(rawCheckInDate, rawCheckOutDate).getDays();
		this.numberOfGuests = totalNumGuests;
		this.pricePerNight = room.getPrice();
	}

	/*
	@Override
	public Guest getPrimaryGuest() {
		return primaryGuest;
	}

	@Override
	public void setPrimaryGuest(Guest guest) {
		this.primaryGuest = guest;
	}
	
	@Override
	public IRoom getGuestRoom() {
		return guestRoom;
	}

	@Override
	public void setGuestRoom(IRoom guestRoom) {
		this.guestRoom = (Guestroom) guestRoom;
	}
*/
	@Override
	public Date getCheckinDate() {
		return checkinDate;
	}

	@Override
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	@Override
	public Date getCheckoutDate() {
		return checkoutDate;
	}

	@Override
	public void setCheckoutDate(Date checkoutDate) {
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
