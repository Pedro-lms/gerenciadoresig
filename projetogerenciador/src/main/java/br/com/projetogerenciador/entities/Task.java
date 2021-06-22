package br.com.projetogerenciador.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Id;

@ManagedBean(name = "geranciador_de_tarefas", eager = true)
@SessionScoped
@Entity
public class Task implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String titulo;
	private String descricao;
	private String responsavel;
	private String prioridade;
	private Date deadLine;
	

	
	public Task() {
	}

	public Task(String titulo, String descricao, String responsavel, String prioridade, Date deadLine) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.prioridade = prioridade;
		this.deadLine = deadLine;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
}
