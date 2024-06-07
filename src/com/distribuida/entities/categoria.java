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
@Table(name ="categoria")
public class categoria {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private int idcategoria;
	@Column(name = "categoria")
	private String categoria;
	
	
	
	public categoria() {}


	public categoria(int idcategoria, String categoria) {
		super();
		this.idcategoria = idcategoria;
		this.categoria = categoria;
		
	}


	public int getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getcategoria() {
		return categoria;
	}


	public void setcategoria(String categoria) {
		this.categoria = categoria;
	
	}

	@Override
	public String toString() {
		return "categoria [idcategoria=" + idcategoria + ", categoria=" + categoria + "]";
	}
	
	
	

}
