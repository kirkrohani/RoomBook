package roombook.rooms;

public enum BedType 
{
	DOUBLE("Double"), QUEEN("Queen"), KING("King"), CALIFORNIAQUEEN("California Queen"), CALIFORNIAKING("California King");
	
	private String bedTypeAsString;
	
	private BedType(String bedTypeString)
	{
		this.bedTypeAsString = bedTypeString;
	}
	
	@Override
	public String toString() 
	{
		return this.bedTypeAsString;
	}
}
