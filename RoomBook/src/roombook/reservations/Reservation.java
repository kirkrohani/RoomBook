package roombook.reservations;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import roombook.guests.Guest;
import roombook.rooms.IRoom;

@Entity
@Table(name="Reservations")
public class Reservation 
{
	
	@Id
	private int reservationID;
	
	@Temporal(TemporalType.DATE)
	private Date checkinDate;
	
	@Temporal(TemporalType.DATE)
	private Date checkoutDate;
	
	@OneToOne
	@JoinColumn(name="guestID")
	private Guest guest;
	
	private int numberOfGuests;
	private double pricePerNight;
	private int numberOfNights;
	

	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(String in, String out, int totalNumGuests) 
	{
		DateTimeFormatter format = DateTimeFormat.forPattern("MM-dd-yyyy");
		LocalDate rawCheckInDate = format.parseLocalDate(in);
		this.checkinDate = rawCheckInDate.toDate();
		
		LocalDate rawCheckOutDate = format.parseLocalDate(out);
		this.checkoutDate = rawCheckOutDate.toDate();
		
		this.numberOfNights = Days.daysBetween(rawCheckInDate, rawCheckOutDate).getDays();
		this.numberOfGuests = totalNumGuests;
		this.pricePerNight = 59.99;
	}
	
	public int getReservationID() {
		return reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
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
	
	

}
