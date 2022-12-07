package br.com.fuctura.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fuctura.agenda.bussiness.Estatisticas;
import br.com.fuctura.agenda.bussiness.EstatisticasIMP;
import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;
import br.com.fuctura.agenda.dto.ResponseDTO;

@Controller
@RequestMapping(path ="/agenda")
public class AgendaController {
	

	private final Estatisticas estatistica;
	
	@Autowired
	public AgendaController(Estatisticas estatistica) {
		this.estatistica = estatistica;
	}
	
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
	
	@GetMapping(path = "/inverter")
	public ResponseDTO inverter() {
		var msg = estatistica.reverse("Sucesso");
		var response = new ResponseDTO();
		response.setMensagem(msg);
		return response;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/inverter/completo")
	@ResponseBody
	public ResponseDTO inverterCompleto() {
		var msg = estatistica.reverse("Sucesso");
		var response = new ResponseDTO();
		response.setMensagem(msg);
		return response;
	}

}
