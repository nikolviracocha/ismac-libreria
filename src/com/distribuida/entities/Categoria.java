package com.distribuida.entities;

public class Categoria {
	
	private int idCategoria;
	private String categoria;
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
