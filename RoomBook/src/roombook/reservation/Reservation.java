package roombook.reservation;

import java.sql.Time;
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
import roombook.room.IRoom;

@Entity
@Table(name="Reservations")
public class Reservation implements IReservation
{
	
	
	private int reservationID;
	private Date checkinDate;
	private Date checkoutDate;
	private Guest guest;
	private int numberOfGuests;
	private int roomNumber;
	private double pricePerNight;
	private int numberOfNights;
	private int guestID;
	private Time earlyCheckInTime;
	private boolean lateCheckOutTime;
	private boolean smokingRequested;
	private boolean petRoomRequested;
	private boolean parkingRequested;
	

	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(Guest guest, IRoom room, String in, String out, int totalNumGuests, boolean earlyCheckIn,
						boolean lateCheckOut, boolean smoking, boolean pets, boolean parking) 
	{
		
		DateTimeFormatter format = DateTimeFormat.forPattern("MM-dd-yyyy");
		LocalDate rawCheckInDate = format.parseLocalDate(in);
		this.checkinDate = rawCheckInDate.toDate();
		
		LocalDate rawCheckOutDate = format.parseLocalDate(out);
		this.checkoutDate = rawCheckOutDate.toDate();
		
		this.numberOfNights = Days.daysBetween(rawCheckInDate, rawCheckOutDate).getDays();
		this.numberOfGuests = totalNumGuests;
		this.roomNumber = room.getRoomNumber();
		this.pricePerNight = room.getPrice();
		this.guestID = guest.getGuestID();
		this.earlyCheckInTime = earlyCheckIn;
		this.lateCheckOutTime = lateCheckOut;
		this.smokingRequested = smoking;
		this.petRoomRequested = pets;
		this.parkingRequested = parking;
		
	}
	
	@Id
	public int getReservationID() {
		return reservationID;
	}
	
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	
	@Temporal(TemporalType.DATE)
	@Override
	public Date getCheckinDate() {
		return checkinDate;
	}
	
	@Override
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	
	@Temporal(TemporalType.DATE)
	@Override
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	
	@Override
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
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
	

	@Override
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	
	@Override
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	
	@Override
	public int getRoomNumber() 
	{
		return roomNumber;
	}

	@Override
	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = roomNumber;
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
		this.numberOfNights = numberOfNights;
	}

	public int getGuestID() {
		return guestID;
	}

	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}

	public boolean getEarlyCheckInTime() {
		return earlyCheckInTime;
	}

	public void setEarlyCheckInTime(boolean earlyCheckIn) {
		this.earlyCheckInTime = earlyCheckIn;
	}

	public boolean getLateCheckOutTime() {
		return lateCheckOutTime;
	}

	public void setLateCheckOutTime(boolean lateCheckOut) {
		this.lateCheckOutTime = lateCheckOut;
	}

	public boolean isSmokingRequested() {
		return smokingRequested;
	}

	public void setSmokingRequested(boolean smoking) {
		this.smokingRequested = smoking;
	}

	public boolean isPetRoomRequested() {
		return petRoomRequested;
	}

	public void setPetRoomRequested(boolean pets) {
		this.petRoomRequested = pets;
	}

	public boolean isParkingRequested() {
		return parkingRequested;
	}

	public void setParkingRequested(boolean parking) {
		this.parkingRequested = parking;
	}
	
	@Override
	public String toString() 
	{
		return 	" reservationID: " + reservationID
				+ " \n checkinDate: " + checkinDate
				+ " \n checkoutDate: " + checkoutDate
				+ " \n guest: " + guestID
				+ " \n room: " + this.roomNumber
				+ " \n numberOfGuests: " + numberOfGuests
				+ " \n pricePerNight: " + pricePerNight
				+ " \n numberOfNights: " + numberOfNights
				+ " \n earlyCheckInTime: " + earlyCheckInTime
				+ " \n lateCheckOutTime: " + lateCheckOutTime
				+ " \n smokingRequested: " + smokingRequested
				+ " \n petRoomRequested: " + petRoomRequested
				+ " \n parkingRequested: " + parkingRequested;
	}

	
}
