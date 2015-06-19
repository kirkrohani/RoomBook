package roombook.rooms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;



/**
 * Servlet implementation class RoomServlet
 */
@WebServlet(name="RoomController", urlPatterns="/Rooms")
public class RoomController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private RoomServices roomServices = new RoomServices();
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomController GET");
		String defaultURL = "/ViewRooms.jsp";
		
		HttpSession session = request.getSession();
		
		String nextPage = request.getParameter("currentPage");
		
		int pageNum = 1;
		if (nextPage != null && !nextPage.isEmpty())
			pageNum = Integer.parseInt(nextPage);


		request.setAttribute("pagingStart", roomServices.getPagingStartingIndex(pageNum));
		request.setAttribute("pagingEnd", roomServices.getPagingEndingIndex(pageNum));
		session.setAttribute("currentPage", pageNum);
		
		
		/*
		 * Check if we have already gotten all rooms and place into session
		 */
		if (session.getAttribute("rooms") == null)
		{
			List<Guestroom> guestrooms = roomServices.getAllRooms();
			if (guestrooms != null && !guestrooms.isEmpty())
			{
				session.setAttribute("rooms", guestrooms);
				session.setAttribute("totalPages", roomServices.getTotalNumberOfPages(guestrooms.size()));
			}
			
		}
		
		
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomController POST Method");
		// TODO Auto-generated method stub
	}

}
