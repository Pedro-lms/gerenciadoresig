package br.com.projetogerenciador.dao;

import java.util.List;

/*
 *@autor Pedro
 *Nesta interface é configurada as ferramentas para Criar, Ler, Atualizar e Excluir, o CRUD.
 *O mais essencial da prova, no qual utiliza-se Genérico T. 
 */
public interface TaskCRUD<T> {
	
	
    public void salvar(T obj);

    public T getById(long id);

    public List<T> listar();

    public void deletar(T obj);

    public void alterar(T obj);

}
