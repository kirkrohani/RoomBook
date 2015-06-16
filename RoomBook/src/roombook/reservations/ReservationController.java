package roombook.reservations;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

import roombook.rooms.*;

/**
 * Servlet implementation class ReservationController
 */
@WebServlet(name="/ReservationController", urlPatterns="/Reservation")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside ReservationController GET");
		String defaultURL = "/MakeReservation.jsp";
		HttpSession session = request.getSession();
		
		
		/*
		 * Get the selected room id and then return the room object back to JSP
		 */
		int roomNumber = Integer.parseInt(request.getParameter("RoomID"));
		List<Guestroom> hotelrooms =  (List<Guestroom>) session.getAttribute("rooms");
		Guestroom room = getRoom(roomNumber, hotelrooms);
		
		session.setAttribute("selectedRoom", room);
			
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside ReservationController POST");
		String date1 = request.getParameter("checkinDate");
		System.out.println("DATE1: " + date1);
		String date2 = request.getParameter("checkoutDate");
		System.out.println("DATE1: " + date2);
		
		String defaultURL = "/ConfirmReservation.jsp";
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
		
	}

	private Guestroom getRoom(int roomNumber, List<Guestroom> rooms)
	{
		if (rooms != null && !rooms.isEmpty())
			for(Guestroom r : rooms)
				if (r.getNumber() == roomNumber)
					return r;

		return new Guestroom();
	}
	
}
