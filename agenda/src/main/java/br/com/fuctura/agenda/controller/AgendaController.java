package br.com.fuctura.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;

@Controller
@RequestMapping(path ="/agenda")
public class AgendaController {
	
	@RequestMapping(method = RequestMethod.POST, path ="/cadastrar")
	@ResponseBody
	public ContatoResponseDTO cadastro(@RequestBody ContatoRequestDTO request) {
		System.out.println(request.getNome());
		
		ContatoResponseDTO response = new ContatoResponseDTO();
		
		response.setMensagem("Cadastrado com sucesso!");
		return response;
		
		
	}
	//@RequestMapping(method = RequestMethod.GET, path ="/agenda/pesquisar")
	@RequestMapping(method = RequestMethod.GET, path ="/pesquisar")
	@ResponseBody
	public ContatoResponseDTO procurar() {
		
		ContatoResponseDTO response = new ContatoResponseDTO();
		
		response.setMensagem("Cadastrado com sucesso!");
		return response;
		
		
	}

}
