package roombook.room;


import roombook.core.*;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="Rooms")
public class Guestroom implements IRoom, Serializable
{

	// *** NEED TO NOT MAKE roomNumber auto-generated!
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int roomNumber;
	
	private int numberOfBeds;
	private String description;
	private int size;
	private boolean occupied;
	private double price;
	private String type;
	
	@Enumerated(EnumType.STRING)
	private BedType bedType;
	
	@Enumerated(EnumType.STRING)
	private RoomStatus roomStatus;
	
	public Guestroom()
	{
	}


	@Override
	public int getRoomNumber() 
	{
		return roomNumber;
	}

	@Override
	public void setRoomNumber(int number) {
		this.roomNumber = number;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public int getSize() {
		return size;
	}

	/* (non-Javadoc)
	 * @see roombook.room.IRoom#setSize(int)
	 */
	@Override
	public void setSize(int size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see roombook.room.IRoom#isOccupied()
	 */
	@Override
	public boolean isOccupied() {
		return occupied;
	}

	/* (non-Javadoc)
	 * @see roombook.room.IRoom#setOccupied(boolean)
	 */
	@Override
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}



	@Override
	public double getPrice() {
		return price;
	}


	@Override
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String getType() {
		return type;
	}


	@Override
	public void setType(String type) {
		this.type = type;
	}
	
	public BedType getBedType()
	{
		return this.bedType;
	}
	
	public void setBedType(BedType bt)
	{
		this.bedType = bt;
	}
	
	public RoomStatus getRoomStatus()
	{
		return this.roomStatus;
	}

	public void setRoomStatus(RoomStatus rs)
	{
		this.roomStatus = rs;
	}
	
	@Override
	public String toString() 
	{
		return "ROOM DATA: " + this.roomNumber + " is a " + this.bedType 
				+ this.type + " with " + this.numberOfBeds + " beds";
	}
}
