package roombook.rooms;

public interface Room
{

	public abstract int getNumber();

	public abstract void setNumber(int number);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract int getSize();

	public abstract void setSize(int size);

	public abstract boolean isOccupied();

	public abstract void setOccupied(boolean occupied);

	public abstract double getPrice();

	public abstract void setPrice(double price);

	public abstract String getType();

	public abstract void setType(String type);

}