package roombook.guests;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Guests")
public class Guest implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int guestID;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String notes;
	
	public Guest() 
	{
	}
	
	
	
	public int getGuestID() {
		return guestID;
	}

	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}

	public Guest(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = "";
		this.phone = "";
		this.notes = "There are no special requests.";
	}
	
	public Guest(String firstName, String lastName, String email, String phone, String notes)
	{
		this.firstName = firstName;
		this.lastName =lastName;
		this.email = email;
		this.phone = phone;
		this.notes = notes;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return this.firstName + " " + this.lastName + " ";
	}
}
