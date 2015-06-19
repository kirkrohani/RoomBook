package roombook.dao;

import roombook.rooms.*;
import javax.persistence.*;
import java.util.List;


public class GuestroomDAO 
{
	public List<Guestroom> getAllRooms()
	{
		EntityManager em = DatabaseUtils.getEMFactory().createEntityManager();
		String query = "SELECT r from Guestroom r";
		TypedQuery<Guestroom> q = em.createQuery(query, Guestroom.class);
		
		List<Guestroom> guestrooms;
		
		try
		{
			guestrooms = q.getResultList();
			if (guestrooms == null || guestrooms.isEmpty())
				guestrooms = null;
		}
		finally
		{
			em.close();
		}
		
		return guestrooms;
	}

}
