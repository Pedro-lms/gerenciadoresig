package br.com.projetogerenciador.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.projetogerenciador.entities.Task;
import br.com.projetogerenciador.utils.HibernateUtil;

public class TaskDAO implements TaskCRUD<Task> {

	@Override
	public void salvar(Task obj) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction operacaoSQL = session.beginTransaction();
		session.save(obj);
		operacaoSQL.commit();
	}

	@Override
	public Task getById(long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Task) session.load(Task.class, id);
	}

	
	/*
	 * Data table
	 * Aqui o JPA (Abstraído pelo HibernateUTIL) faz a persistência de dados
	 */
	@Override
	public List<Task> listar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction operacaoSQL = session.beginTransaction();
		List<Task> objetos = session.createQuery("from Task").list();
		operacaoSQL.commit();
		return objetos;
	}

	@Override
	public void deletar(Task obj) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction operacaoSQL = session.beginTransaction();
		session.delete(obj);
		operacaoSQL.commit();
	}

	@Override
	public void alterar(Task obj) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction operacaoSQL = session.beginTransaction();
		session.update(obj);
		operacaoSQL.commit();
	}

}
