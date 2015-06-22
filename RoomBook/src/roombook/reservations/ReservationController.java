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
	private ReservationServices reservationServices = new ReservationServices();
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside ReservationController GET");
		String defaultURL = "/MakeReservation.jsp";
		HttpSession session = request.getSession();
		
		
		/*
		 * Get the selected room id and then return the room object back to JSP
		 */
		int roomNumber = Integer.parseInt(request.getParameter("RoomID"));
		@SuppressWarnings("unchecked")
		List<Guestroom> list = (List<Guestroom>) session.getAttribute("rooms");
		Guestroom room = reservationServices.getRoom(roomNumber, list);
		
		session.setAttribute("selectedRoom", room);
			
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		IReservation r = reservationServices.getReservationData(request);
		System.out.println("reservation data: " + r);
		
		String defaultURL = "/ConfirmReservation.jsp";
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
		
	}


	
}
