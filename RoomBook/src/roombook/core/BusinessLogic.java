package roombook.core;

import roombook.rooms.BedType;

public class BusinessLogic 
{
	

	public static int getNumberOfBeds(BedType bt)
	{
		switch (bt)
		{
			case DOUBLE: return 2;
			default:	return 1;
		}
	}
	
	public static BedType getBedType(String bt)
	{
		switch (bt)
		{
		case "Double":	return BedType.DOUBLE;
		case "King":	return BedType.KING;
		case "Queen":	return BedType.QUEEN;
		default:		return BedType.DOUBLE;
		}
	}
	


	
}
