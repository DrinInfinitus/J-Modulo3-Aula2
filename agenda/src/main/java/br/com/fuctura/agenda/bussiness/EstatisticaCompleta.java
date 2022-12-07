package br.com.fuctura.agenda.bussiness;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EstatisticaCompleta implements Estatisticas{
	
	public EstatisticaCompleta() {
		System.out.println("EstatisticaCompleta");
	}

	@Override
	public String reverse(String input) {
		return input;
	}

}
