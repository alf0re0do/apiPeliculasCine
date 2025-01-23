package com.mx.apiPeliculasCine.service;

import java.util.List;

import com.mx.apiPeliculasCine.model.Cartelera;

public interface CarteleraServ {
	
	public void guardar(Cartelera cartelera);
	
	public List<Cartelera>listar();
	
	public Cartelera buscarXid(int idEmple);
	
	public void editar(Cartelera cartelera);
	
	public void eliminarXid(int idCart);
	
	 public List<Cartelera> buscarXnombre(String nombre);

}
