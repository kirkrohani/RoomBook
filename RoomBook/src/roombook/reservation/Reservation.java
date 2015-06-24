package roombook.reservation;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
public class Reservation implements IReservation
{
	
	
	private int reservationID;
	private Date checkinDate;
	private Date checkoutDate;
	private Guest guest;
	private Guestroom room;
	private int numberOfGuests;
	private double pricePerNight;
	private int numberOfNights;
	private int roomNumber;
	private int guestID;
	

	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(Guest guest, IRoom room, String in, String out, int totalNumGuests) 
	{
		DateTimeFormatter format = DateTimeFormat.forPattern("MM-dd-yyyy");
		LocalDate rawCheckInDate = format.parseLocalDate(in);
		this.checkinDate = rawCheckInDate.toDate();
		
		LocalDate rawCheckOutDate = format.parseLocalDate(out);
		this.checkoutDate = rawCheckOutDate.toDate();
		
		this.numberOfNights = Days.daysBetween(rawCheckInDate, rawCheckOutDate).getDays();
		this.numberOfGuests = totalNumGuests;
		this.pricePerNight = 599.99;
		this.roomNumber = room.getRoomNumber();
		this.guestID = guest.getGuestID();
		
	}
	
	@Id
	public int getReservationID() {
		return reservationID;
	}
	
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="Guests")
	@JoinColumn(name="guestID")
	public Guest getGuest()
	{
		return this.guest;
	}
	
	public void setGuest(Guest guest)
	{
		this.guest = guest;
	}
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinTable(name="Rooms")
	@JoinColumn(name="roomNumber")
	public Guestroom getRoom() {
		return room;
	}

	public void setRoom(Guestroom room) {
		this.room = room;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public int getNumberOfNights() {
		return numberOfNights;
	}
	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getGuestID() {
		return guestID;
	}

	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}
	

}
