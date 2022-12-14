package br.com.fuctura.agenda.bussiness.IMPL;

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

}
