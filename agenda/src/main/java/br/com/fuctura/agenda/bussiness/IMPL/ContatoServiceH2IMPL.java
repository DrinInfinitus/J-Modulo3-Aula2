package br.com.fuctura.agenda.bussiness.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.agenda.Entity.ContatoEntity;
import br.com.fuctura.agenda.bussiness.IContatoService;
import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.repository.ContatoRepository;

@Service
@Qualifier("H2")
public class ContatoServiceH2IMPL implements IContatoService{
	
	@Autowired
	private ContatoRepository repository;

	@Override
	public void salvar(ContatoRequestDTO object) {
		// mapear ContatoRequestDTO -> ContatoEntity
		ContatoEntity entidade = new ContatoEntity();
		entidade.setNome(object.getNome());
		entidade.setAltura(object.getAltura());
		entidade.setIdade(object.getIdade());
		repository.save(entidade);
	}

	@Override
	public List<ContatoRequestDTO> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContatoRequestDTO obter(String nome) {
		
		var entidade = repository.findById(Long.valueOf(nome)).get();
		ContatoRequestDTO retorno = new ContatoRequestDTO();
		
		//mapear
		
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
