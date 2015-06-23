package roombook.dao;


import roombook.reservations.IReservation;
import roombook.reservations.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class ReservationsDAO 
{
	public void insertReservation(Reservation reservation) throws Exception 
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
