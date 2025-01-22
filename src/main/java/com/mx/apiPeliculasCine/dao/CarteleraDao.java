package com.mx.apiPeliculasCine.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.apiPeliculasCine.model.Cartelera;

public interface CarteleraDao extends CrudRepository<Cartelera, Integer> {
	

}
