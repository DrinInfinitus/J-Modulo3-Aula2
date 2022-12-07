package br.com.fuctura.agenda.bussiness;

import org.springframework.stereotype.Service;

@Service
public class EstatisticasIMP implements Estatisticas{
	
	
	public EstatisticasIMP() {
		System.out.println("Construiu estatistica");
	}
	
	@Override
	public String reverse(String input) {
		return new StringBuilder(input).reverse().toString();
	}

}
