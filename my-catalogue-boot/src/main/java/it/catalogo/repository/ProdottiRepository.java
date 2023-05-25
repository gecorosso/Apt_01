package it.catalogo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.catalogo.model.Prodotto;


public interface ProdottiRepository extends CrudRepository<Prodotto, Integer> {
	//Tutti i metodi metodi di inserimento modifica e cancellazione 
	//sono disponibili.
	 
	

}
