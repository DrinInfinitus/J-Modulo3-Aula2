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



	@Override
	public List<ContatoRequestDTO> obterTodos() {
		return contatos;
	}



	@Override
	public ContatoRequestDTO obter(String nome) {
		// TODO Auto-generated method stub
//		for (ContatoRequestDTO c : this.contatos) {
//			if(c.getNome().equals(nome)) {
//				return c;
//			}
//		}
//		
		for(int i = 0; i< this.contatos.size(); i++) {
			if (contatos.get(i).getNome().equals(nome)) {
			return contatos.get(i);
			}
	}
////		//java 8 streams
//		var cc = this.contatos.stream().filter(c -> c.getNome().equals(nome)).findFirst();
//		return cc.isPresent() ? cc.get() : null;
//	
//	}
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
