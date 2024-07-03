package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.libro;

public interface LibroDAO {
	
	//CRUD Basico
	
	public List<libro> findAll();
	
	public libro findOne(int id);
	
	public void add(libro Libro);
	
	public void up(libro Libro);
	
	public void del(int id);
	
	//CRUD Avanzado
	
	
	
	
	
	
	

}
