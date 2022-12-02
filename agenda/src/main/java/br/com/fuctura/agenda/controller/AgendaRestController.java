package br.com.fuctura.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;

@RestController()
@RequestMapping(path ="/agenda")
public class AgendaRestController {
	
	//@RequestMapping(method = RequestMethod.POST, path ="/cadastrar")
	@PostMapping(path= "//cadastrar")
	public ContatoResponseDTO cadastro(@RequestBody ContatoRequestDTO request) {
		System.out.println(request.getNome());
		
		ContatoResponseDTO response = new ContatoResponseDTO();
		
		response.setMensagem("Cadastrado com sucesso!");
		return response;
		
		
	}
	
	@GetMapping(path ="//pesquisar")
	public ContatoResponseDTO procurar() {
		
		ContatoResponseDTO response = new ContatoResponseDTO();
		
		response.setMensagem("Cadastrado com sucesso!");
		return response;
		
		
	}

}
