package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name ="Autor")
public class Categoria {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private int idCategoria;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "descripcion")
	private String descrpcion;
	
	
	public Categoria() {}


	public Categoria(int idCategoria, String categoria, String descrpcion) {
		super();
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.descrpcion = descrpcion;
	}


	public int getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getDescrpcion() {
		return descrpcion;
	}


	public void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}


	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", descrpcion=" + descrpcion
				+ "]";
	}
	
	
	

}
