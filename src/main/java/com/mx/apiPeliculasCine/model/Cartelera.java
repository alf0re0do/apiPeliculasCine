package com.mx.apiPeliculasCine.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*

CREATE TABLE PELICULAS(
ID_PELICULA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100) NOT NULL,
GENERO  NVARCHAR2(100) NOT NULL,
PRECIO NUMBER NOT NULL
);*/

//Mapear la tabla
//Estereotipos o anotaciones--- se estan ocupando las dependencias 
@Entity
@Table(name = "PELICULAS")
@Data
public class Cartelera {
	
	@Id
	@Column(name = "ID_PELICULA", columnDefinition="NUMBER", nullable = false)
	private Integer idCartelera;
	
	@Column(name = "NOMBRE", columnDefinition= "NVARCHAR2(100)",nullable = false)
	private String nombre;
	
	@Column(name = "GENERO", columnDefinition = "NVARCHAR2(100)", nullable = false)
	private String genero;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = true)
	private Integer precio;
	
	//Los tipos de datos primitivos de preferencia hay que parsearlos
	//Un tipo de datos primitivo que no esta parseado no recibe valores nulos
	
	
	
	

}
