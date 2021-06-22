package br.com.projetogerenciador.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.projetogerenciador.jpautil.JPAUtil;
import br.com.projetogerenciador.utils.HibernateUtil;

public class DaoGeneric <E> {

	private EntityManager entityManager = (EntityManager) HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.persist(entidade); //JPA salva no banco de dados
		
		transaction.commit();
	}
	
}
