package br.com.fuctura.agenda.bussiness.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.agenda.bussiness.IContatoService;
import br.com.fuctura.agenda.dto.ContatoRequestDTO;


@Service
@Qualifier("ContatoServiceIMPL")
public class ContatoServiceIMPL implements IContatoService{

	private List<ContatoRequestDTO> contatos;
	
	
	
	public ContatoServiceIMPL() {
		this.contatos = new ArrayList<ContatoRequestDTO>();
	}



	@Override
	public void salvar(ContatoRequestDTO object) {
		this.contatos.add(object);
		System.out.println("STARTING TO BECOME A REAL GOD OF WAR");
	}

}
