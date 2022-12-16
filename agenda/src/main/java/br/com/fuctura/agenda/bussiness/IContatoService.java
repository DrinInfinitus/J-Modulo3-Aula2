package br.com.fuctura.agenda.bussiness;

import java.util.List;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;

public interface IContatoService {

	public void salvar(ContatoRequestDTO object);
	
	public List<ContatoRequestDTO> obterTodos();
	
	public ContatoRequestDTO obter (String nome);
	
	void atualizar (ContatoRequestDTO object);
	
	void excluir (String nome);

}
