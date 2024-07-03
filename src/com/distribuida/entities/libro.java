package com.distribuida.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "factura")

public class libro {
	
	//@OneToOne
		//@ManyToOne
		//@OneToMany
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int idlibro;
	@Column(name ="titulo")
	private String titulo;
	@Column(name ="editorial")
	private String editorial;
	@Column(name ="num_paginas")
	private int numpaginas;
	@Column(name ="edicion")
	private String edicion;
	@Column(name ="idioma")
	private String idioma;
	@Column(name ="fech_publicacion")
	private Date fechpublicacion;
	@Column(name ="descripcion")
	private String descripcion;
	@Column(name ="tipo_pasta")
	private String tipopasta;
	@Column(name ="isbn")
	private String isbn;
	@Column(name ="num_ejemplares")
	private int numejemplares;
	@Column(name ="portada")
	private String portada;
	@Column(name ="presentacion")
	private String presentacion;
	@Column(name ="precio")
	private double precio;
	
	
	//private
	@JoinColumn(name ="id_categoria") 
	@JoinColumn(name ="id_autor") 
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	

	private categoria categoria;
	private Autor autor;

	
	
	public libro() {}


	
	


	public libro(int idlibro, String titulo, String editorial, int numpaginas, String edicion, String idioma,
			Date fechpublicacion, String descripcion, String tipopasta, String isbn, int numejemplares, String portada,
			String presentacion, double precio, com.distribuida.entities.categoria categoria, Autor autor) {
		
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numpaginas = numpaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechpublicacion = fechpublicacion;
		this.descripcion = descripcion;
		this.tipopasta = tipopasta;
		this.isbn = isbn;
		this.numejemplares = numejemplares;
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






	public int getNumpaginas() {
		return numpaginas;
	}






	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
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






	public Date getFechpublicacion() {
		return fechpublicacion;
	}






	public void setFechpublicacion(Date fechpublicacion) {
		this.fechpublicacion = fechpublicacion;
	}






	public String getDescripcion() {
		return descripcion;
	}






	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}






	public String getTipopasta() {
		return tipopasta;
	}






	public void setTipopasta(String tipopasta) {
		this.tipopasta = tipopasta;
	}






	public String getIsbn() {
		return isbn;
	}






	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}






	public int getNumejemplares() {
		return numejemplares;
	}






	public void setNumejemplares(int numejemplares) {
		this.numejemplares = numejemplares;
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
		return "libro [idlibro=" + idlibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numpaginas="
				+ numpaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechpublicacion=" + fechpublicacion
				+ ", descripcion=" + descripcion + ", tipopasta=" + tipopasta + ", isbn=" + isbn + ", numejemplares="
				+ numejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}







}