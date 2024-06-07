package com.distribuida.entities;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public class libro {

	private int idlibro;
	private String titulo;
	private String editorial;
	private int num_paginas;
	private String edicion;
	private String idioma;
	private Date fech_publicacion;
	private String descripcion;
	private String tipo_pasta;
	private String isbn;
	private int num_ejemplares;
	private String portada;
	private String presentacion;
	private double precio;
	
	private categoria categoria;
	private Autor autor;
	

	public libro() {}


	public libro(int idlibro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fech_publicacion, String descripcion, String tipo_pasta, String isbn, int num_ejemplares,
			String portada, String presentacion, double precio) {
		super();
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_paginas = num_paginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fech_publicacion = fech_publicacion;
		this.descripcion = descripcion;
		this.tipo_pasta = tipo_pasta;
		this.isbn = isbn;
		this.num_ejemplares = num_ejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
	}


	public int getIdlibro() {
		return idlibro;
	}


	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getNum_paginas() {
		return num_paginas;
	}


	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public Date getFech_publicacion() {
		return fech_publicacion;
	}


	public void setFech_publicacion(Date fech_publicacion) {
		this.fech_publicacion = fech_publicacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo_pasta() {
		return tipo_pasta;
	}


	public void setTipo_pasta(String tipo_pasta) {
		this.tipo_pasta = tipo_pasta;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getNum_ejemplares() {
		return num_ejemplares;
	}


	public void setNum_ejemplares(int num_ejemplares) {
		this.num_ejemplares = num_ejemplares;
	}


	public String getPortada() {
		return portada;
	}


	public void setPortada(String portada) {
		this.portada = portada;
	}


	public String getPresentacion() {
		return presentacion;
	}


	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "libro [idlibro=" + idlibro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fech_publicacion=" + fech_publicacion
				+ ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", isbn=" + isbn + ", num_ejemplares="
				+ num_ejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}
	
	
	
	
	
	
	
}
