package br.com.projetogerenciador.test;

import org.junit.Test;

import br.com.projetogerenciador.dao.DaoGeneric;
import br.com.projetogerenciador.entities.Task;

public class TesteHibernate {

	@Test
	public <E> void testeHibernateUtil() {
		DaoGeneric<Task> daoGeneric =  new DaoGeneric<Task>();
		
		Task task = new Task();
		
		task.setTitulo("Entregar a prova");
		task.setDescricao("Entregar a prova e ser aprovado na ESIG");
		task.setPrioridade("Alta");
		task.setResponsavel("Pedro");
		
	}
}
