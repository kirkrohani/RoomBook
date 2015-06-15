package roombook.rooms;


import roombook.core.*;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="Rooms")
public class Guestroom implements Room, Serializable
{
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int number;
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
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int number) {
		this.number = number;
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
	 * @see roombook.rooms.Room#setSize(int)
	 */
	@Override
	public void setSize(int size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see roombook.rooms.Room#isOccupied()
	 */
	@Override
	public boolean isOccupied() {
		return occupied;
	}

	/* (non-Javadoc)
	 * @see roombook.rooms.Room#setOccupied(boolean)
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
}
