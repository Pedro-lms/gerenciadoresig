package br.com.projetogerenciador.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory;
	
	static {
		if(factory == null) {
			
			factory = Persistence.createEntityManagerFactory("projetogerenciador");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
