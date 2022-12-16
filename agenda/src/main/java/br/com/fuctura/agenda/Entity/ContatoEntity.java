package br.com.fuctura.agenda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContatoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column (name = "nome", nullable = false)
	private String nome;
	
	@Column (name = "altura", nullable = false)
	private Double altura;
	
	@Column (name = "idade", nullable = false)
	private Long idade;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

}
