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
@WebServlet(name="RoomBookingEngineController", urlPatterns="/Home")
public class RoomBookingEngineController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public RoomBookingEngineController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomBookEngineController GET");
		String defaultURL = "/room-book.jsp"; 
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomBookEngineController POST");
		
		String defaultURL = "/room-book.jsp";
		Hotel hotel = new Hotel();

    		
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
		
	}
	


}
