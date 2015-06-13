package roombook.dao;

import javax.persistence.*;

public class DatabaseUtils 
{
	private static final EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("roombook-persistence");
	
	public static EntityManagerFactory getEMFactory()
	{
		return entityFactory;
	}

}
