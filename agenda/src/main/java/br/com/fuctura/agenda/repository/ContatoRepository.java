package br.com.fuctura.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.agenda.Entity.ContatoEntity;

@Repository
//										ContatoEntity=É a classe que tem @Entity
//										Long=É o tipo primitivo do dado em ID
public interface ContatoRepository extends JpaRepository<ContatoEntity, Long>{

}
