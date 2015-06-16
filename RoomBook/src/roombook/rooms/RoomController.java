package roombook.rooms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

import roombook.core.BusinessLogic;
import roombook.dao.GuestroomDAO;


/**
 * Servlet implementation class RoomServlet
 */
@WebServlet(name="RoomController", urlPatterns="/Rooms")
public class RoomController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomController() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomController GET");
		String defaultURL = "/ViewRooms.jsp";
		
		HttpSession session = request.getSession();
		String pageController = request.getParameter("page");
		
		int pageNum = 1;
		if (pageController != null)
		{
			switch(pageController)
			{
			case "Next" :
				pageNum = (int) session.getAttribute("currentPage") + 1;
				break;
			case "Prev" :
				pageNum = (int) session.getAttribute("currentPage") - 1;
				break;
			default :
				pageNum = Integer.parseInt(pageController);
			}	
				
		}

		request.setAttribute("pagingStart", BusinessLogic.getPagingStartingIndex(pageNum));
		request.setAttribute("pagingEnd", BusinessLogic.getPagingEndingIndex(pageNum));
		session.setAttribute("currentPage", pageNum);
		
		
		/*
		 * Check if we have already gotten all rooms and place into session
		 */
		if (request.getSession().getAttribute("rooms") == null)
		{
			List<Guestroom> guestrooms = GuestroomDAO.getAllRooms();
			session.setAttribute("rooms", guestrooms);
			session.setAttribute("totalPages", BusinessLogic.getTotalNumberOfPages(guestrooms.size()));
		}
		
		
		getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside RoomController POST Method");
		// TODO Auto-generated method stub
	}

}
