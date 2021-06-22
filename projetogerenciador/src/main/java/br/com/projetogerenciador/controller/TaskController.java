package br.com.projetogerenciador.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.projetogerenciador.dao.TaskCRUD;
import br.com.projetogerenciador.dao.TaskDAO;
import br.com.projetogerenciador.entities.Task;


/*
 * Aqui é feito todo controle do CRUD. Neste momento o JPA atua como seu nome e faz a conexão
 */
@ManagedBean(name = "taskController")
@RequestScoped
public class TaskController {

	private Task task;
	private DataModel<Task> taskList;
	private TaskCRUD<Task> dao;
	
	public TaskController() {
		this.dao = new TaskDAO();
	}

	public TaskController(TaskCRUD<Task> dao) {
		this.dao = dao;
	}
	
	/*
	 * Cria uma nova tarefa nmmo banco de dados
	 * O C do CRUD
	 * @return index.html
	 */
	
	public String GravarNovo() {
		dao.salvar(task);
		return "index";
	}
	
	 /*
     * Carrega o formulário para adicionar uma nova tarefa
     * contendo todos os campos populados para serem
     * alterados pelo usuário
     * O R do CRUD
     * @return manterTarefa.html
     */
	
	public String Alterar() {
		task = (taskList.getRowData());
		return "manterTarefa";
	}
	
	/*
	 * Salva os dados das tarefas com as novas alterções
	 * E retorna para página principal atualizando o banco de dados 
	 * O U do CRUD
	 * @return index.html
	 */
	
	public String Editar() {
		dao.alterar(task);
		return "index";
	}
	
	public Task getTask() {
		return task;
	}
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public DataModel<Task> getTaskList() {
		List<Task> list = new TaskDAO().listar();
		taskList = new ListDataModel<Task>(list);
		return taskList;
	}
	
	public void setTaskList(DataModel<Task> taskList) {
		this.taskList = taskList;
	}
		
	 /*
     * Exclui do banco de dados a tarefa selecionada no CRUD
     * o "D" de Crud
     * carregando novamente os dados do banco de dados
     * @return index.html
     */
	
	public String Excluir() {
		Task temporaryObj = (taskList.getRowData());
		dao.deletar(temporaryObj);
		return "index";
	}
}
