package roombook.dao;

import roombook.guest.Guest;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class GuestsDAO 
{
	public void insertGuest(Guest guest) throws Exception 
	{
		EntityManager entityManager= DatabaseUtils.getEMFactory().createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		try
		{
			entityManager.persist(guest);
			transaction.commit();
		}
		catch (Exception e)
		{
			transaction.rollback();
			throw e;
		}
		finally
		{
			entityManager.close();
		}
		
	}

	

}
