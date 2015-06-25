package roombook.reservation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

import roombook.guest.Guest;
import roombook.room.*;

/**
 * Servlet implementation class ReservationController
 */
@WebServlet(name="/ReservationController", urlPatterns="/Reservation")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReservationService reservationServices = new ReservationService();
       


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
		
		// Get user data from reservation
		System.out.println("Getting data from user input to make a reservation");
		String checkInDate = request.getParameter("checkinDate");
		String checkoutDate = request.getParameter("checkoutDate");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String notes = request.getParameter("notes");
		String numOfAdults = request.getParameter("numberOfAdults");
		String numOfChildren = request.getParameter("numberOfChildren");
		String earlyCheckIn = request.getParameter("earlyCheckIn");
		String lateCheckOut = request.getParameter("lateCheckOut");
		String smoking = request.getParameter("smoking");
		String pets = request.getParameter("pets");
		String parking = request.getParameter("parking");
		
		
		
		//Create the guest profile
		Guest guest = reservationServices.createGuest(firstName, lastName, email, phone, notes);
		if (guest != null)
		{
			IRoom room = (IRoom) request.getSession().getAttribute("selectedRoom");
			
			IReservation r = reservationServices.createReservation(guest, room, checkInDate, 
																	checkoutDate, numOfAdults,
																	numOfChildren, earlyCheckIn, 
																	lateCheckOut, smoking, pets,
																	parking); 
			
		}
		
		
		String defaultURL = "/ConfirmReservation.jsp";
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
		
	}


	
}
