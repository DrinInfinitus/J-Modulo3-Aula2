package br.com.fuctura.agenda.bussiness.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.agenda.bussiness.IContatoService;
import br.com.fuctura.agenda.dto.ContatoRequestDTO;

@Service
@Qualifier("ContatoServiceAWSimpl")
public class ContatoServiceAWSimpl implements IContatoService{

	@Override
	public void salvar(ContatoRequestDTO object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContatoRequestDTO> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContatoRequestDTO obter(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(ContatoRequestDTO object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(String nome) {
		// TODO Auto-generated method stub
		
	}

}
