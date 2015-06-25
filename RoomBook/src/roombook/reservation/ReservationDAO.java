package roombook.reservation;


import roombook.dao.DatabaseUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class ReservationDAO 
{
	public void insertReservation(IReservation reservation) throws Exception 
	{
		EntityManager entityManager= DatabaseUtils.getEMFactory().createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		try
		{
			entityManager.persist(reservation);
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
