package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;


public class Principallibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
	CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
	AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
				
		// CRUD : CREATE , READ, UPDATE, DELETE
		// Add  
	Libro libro = new Libro();
	libro.setCategoria(categoriaDAO.findOne(2));
	//libroDAO.add(libro);
		// Up
	Libro libro2 = new Libro();
	libro2.setAutor(autorDAO.findOne(3));
	//libroDAO.up(libro2);
		
		// del
		//libroDAO.del(92);
		
		//findOne
		System.out.println("************************* DEL *****************"+libroDAO.findOne(92));
		// findAll
		
		libroDAO.findAll().forEach(item -> {System.out.println(item.toString());});
			
		context.close();
	}

}
