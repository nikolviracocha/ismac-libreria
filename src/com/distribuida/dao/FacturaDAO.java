package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Factura;

public interface FacturaDAO {
	
	//CRUD Basico
	
	public List<Factura> findAll();
	
	public Factura findOne(int id);
	
	public void add(Factura Factura);
	
	public void up(Factura Factura);
	
	public void del(int id);
	
	//CRUD Avanzado
	
	
	
	
	
	
	

}
