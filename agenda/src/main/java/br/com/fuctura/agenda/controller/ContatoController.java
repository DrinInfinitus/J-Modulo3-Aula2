package br.com.fuctura.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.agenda.bussiness.IContatoService;
import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	
	private final IContatoService service; // Sem a linha 18,19 e 20 vai dar erro no serviço de inicialização do campo
	@Autowired
	public ContatoController(@Qualifier ("ContatoServiceIMPL") IContatoService service) {
		this.service = service;
	}
	
	/*
	 * C - CREATE
	 * R - READ
	 * U - UPDATE
	 * D - DELETE
	 */
	
	@RequestMapping(path = "/cadastrar", method = RequestMethod.POST)
	//@PostMapping("/cadastrar")
	@ResponseBody //Pra mandar uma resposta pra lá
	public ResponseEntity<ContatoResponseDTO> cadastrar(@RequestBody ContatoRequestDTO object) {
		service.salvar(object);
		System.out.println("I'M THE FUCKING GOD OF WAR");
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
