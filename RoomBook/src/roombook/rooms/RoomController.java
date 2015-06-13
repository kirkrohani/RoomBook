package roombook.rooms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

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
		String defaultURL = "/rooms.jsp";
		
		
		List<Guestroom> guestrooms = GuestroomDAO.getAllRooms();
		System.out.println("How many rooms do we have? " + guestrooms.size());
		
		for (Room r : guestrooms)
			System.out.println("Room #" + r.getNumber() + " " + r.getDescription());
		
		HttpSession session = request.getSession();
		session.setAttribute("rooms", guestrooms);
		this.getServletContext().getRequestDispatcher(defaultURL).forward(request, response);
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
