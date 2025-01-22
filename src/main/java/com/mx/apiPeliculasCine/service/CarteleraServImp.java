package com.mx.apiPeliculasCine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiPeliculasCine.dao.CarteleraDao;
import com.mx.apiPeliculasCine.model.Cartelera;

/*Se agrega estereotipo----@Service con este indicamos que 
 * vamos a realizar un servicio rest --Json*/

@Service

public class CarteleraServImp implements CarteleraServ {
	
	/*Realizamos una inyeccion de dependicia
	 * @Autowired----Nos permite tener un mejor control de los objetos que se inicializan*/

	@Autowired
	CarteleraDao dao;
	@Override
	public void guardar(Cartelera cartelera) {
		
		dao.save(cartelera);
		
	}

	@Override
	public List<Cartelera> listar() {
		// TODO Auto-generated method stub
		return (List<Cartelera>) dao.findAll();
	}
	@Transactional(readOnly = true)//Se agrega cuando no vamos a realizar cambios en la base de datos
	@Override
	public Cartelera buscarXid(int idCartel) {
		
		return null;
	}

	@Override
	public void editar(Cartelera cartelera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarXid(int idCart) {
		// TODO Auto-generated method stub
		
	}

}
