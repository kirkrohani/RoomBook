package roombook.core;

import roombook.rooms.BedType;

public class BusinessLogic 
{
	
	private static final int pagingSize = 9;

	
	public BusinessLogic()
	{
		
	}

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
	
	public static int getPagingStartingIndex(int pageNumber)
	{
		if (pageNumber == 1)
			return pageNumber;
		else
			return ( ((pageNumber-1)*pagingSize)+1);
	}
	
	public static int getPagingEndingIndex(int pageNumber)
	{
		if (pageNumber == 1)
			return pagingSize;
		else
			return (pageNumber*pagingSize);
	}
	
	public static int getTotalNumberOfPages(int totalRecords)
	{
		return (totalRecords/pagingSize)+1;
	}
	

	
}
