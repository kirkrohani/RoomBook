package roombook.core;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import roombook.rooms.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HotelManager
 */
@WebServlet(name="RoomBookServlet", urlPatterns="/RoomBook")
public class RoomBookServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public RoomBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomBookServlet doGet");
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomBookServlet doPost");
		
		Hotel hotel = new Hotel();
		
		/*
		 * The section below grabs hotel initialization parameters from another JSP file.
		 * This section needs to be changed once we implement a DB
		 * BEGIN
		 */
		String numberOfRooms = request.getParameter("numberOfRooms1");
		System.out.println("# of ROOMS: " + numberOfRooms);
		String bedType = request.getParameter("roomType1");
		System.out.println("Room Type: " + bedType);
		int rooms =  numberOfRooms != null ? Integer.parseInt(numberOfRooms) : 0;
    	int numberOfBeds = BusinessLogic.getNumberOfBeds(BusinessLogic.getBedType(bedType));
		GuestRoom guestRoom;
    	
		int loopInit = hotel.getMaxRoomNumber();
    	for (int i=loopInit; i < (rooms+loopInit); i++)
    	{
    		guestRoom = new GuestRoom(numberOfBeds, BusinessLogic.getBedType(bedType));
    		hotel.addRoom(guestRoom);
    	}
		
    	//Repeat Process for additional room types
    	numberOfRooms = request.getParameter("numberOfRooms2");
    	bedType = request.getParameter("roomType2");
    	rooms =  numberOfRooms != null ? Integer.parseInt(numberOfRooms) : 0;
    	System.out.println("# of ROOMS: " + numberOfRooms);
    	loopInit = hotel.getMaxRoomNumber();
    	for (int i=loopInit; i < (rooms+loopInit); i++)
    	{
    		guestRoom = new GuestRoom(numberOfBeds, BusinessLogic.getBedType(bedType));
    		hotel.addRoom(guestRoom);
    	}
    	/*
		 * The section below grabs hotel initialization parameters from another JSP file.
		 * This section needs to be changed once we implement a DB
		 * END
		 */
    	System.out.println("HOTEL CREATED: " + hotel.getNumberOfRooms());
    	
		
		getServletContext().getRequestDispatcher("/room-book.jsp").forward(request, response);
		
	}
	


}
