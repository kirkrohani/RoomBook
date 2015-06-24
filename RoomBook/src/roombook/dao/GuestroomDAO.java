package roombook.dao;

import roombook.room.*;

import javax.persistence.*;

import java.util.List;


public class GuestroomDAO 
{
	
	//**** REFACTOR AND CHANGE NAME TO BE ROOMSDAO
	
	
	
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
	
	public List<Object[]> getAllRoomTypes()
	{
		EntityManager em = DatabaseUtils.getEMFactory().createEntityManager();
		String query = "SELECT DISTINCT(room.type), room.bedType from Guestroom room";
		
		TypedQuery<Object[]> typedQuery = em.createQuery(query, Object[].class);
		List<Object[]> results;
		
		try
		{
			results = typedQuery.getResultList();
			if (results == null || results.isEmpty())
				results = null;
			
		}
		finally
		{
			em.close();
		}
		
		return results;
	}
	

}
