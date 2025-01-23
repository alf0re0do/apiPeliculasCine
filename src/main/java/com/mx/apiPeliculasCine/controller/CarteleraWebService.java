package com.mx.apiPeliculasCine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiPeliculasCine.model.Cartelera;
import com.mx.apiPeliculasCine.service.CarteleraServImp;

//WEB SERVICE: TECNOLOGIA QUE ME PERMITE COMUNICAR 2 COMPONENTES : SERVIDOR Y CLIENTE
/*@RestController-- Nos permite marcar como controlador de solicitudes
 * y se utiliza para la creacion de servicios web
 * --web service de tipo REST ---Trabaja con Json*/

/*RequestMapping--- Se utiliza para asignar solicitudes web a entornos de Spring Boot
 * o para formar nuestros recursos(url, endpoint)*/

/*
 * CrossOrigin---Es por segurudad para que nuestra aplicacion no sea bloqueado por el navegador*/

@RestController
@RequestMapping(path = "CarteleraWebService")
@CrossOrigin

public class CarteleraWebService {
	/*
	 * @Autowire---- nos permite tener un mejor control de los objetos que se
	 * inicializan
	 */
	@Autowired
	CarteleraServImp carteleraImp;

	// http://localhost:9000/CarteleraWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Cartelera cartelera) {
		carteleraImp.guardar(cartelera);
	}

	// Peticiones ---Get para listar
	// Necesito formar la URL:Utilizando el protocolo hhtp
	// como formar las URL: urlServidorLocal/pathMiClase/pathMetodo
	// http://localhost:9000/CarteleraWebService/listar
	@GetMapping(path = "listar")
	public List<Cartelera> listar() {
		return carteleraImp.listar();
	}

	// http://localhost:9000/CarteleraWebService/buscarXid
	@PostMapping(path = "buscarXid")
	public Cartelera buscarXid(@RequestBody Cartelera cartelera) {
		return carteleraImp.buscarXid(cartelera.getIdCartelera());
	}
     
	// http://localhost:9000/CarteleraWebService/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Cartelera cartelera) {

		carteleraImp.editar(cartelera);

	}
	
	// http://localhost:9000/CarteleraWebService/eliminarXid
	@PostMapping(path = "eliminarXid")
	public void eliminarXid(@RequestBody Cartelera cartelera) {
		
		carteleraImp.eliminarXid(cartelera.getIdCartelera());
	}
	
	
	@PostMapping(path = "buscarXnombre")
	public List<Cartelera> buscarXnombre(@RequestBody Cartelera cartelera){
		
		
		return carteleraImp.buscarXnombre(cartelera.getNombre());
		
		
	}
	

}
