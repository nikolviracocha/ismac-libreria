package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;


public class PrincipalAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl2", AutorDAO.class);
		
		//CRUD : CREATE , READ , UPDATE ,DELETE
		
		//ADD
		Autor autor = new Autor(0,"123456789","juan","taipe","av.por ahi..." ,"0987654321" , "jtaipe@correo.com");
		//autorDAO.add(autor);
		
		//UP
		Autor autor2 = new Autor(61,"1234567892","juan2","taipe2", "av.por ahi...2" ,"09876543212","jtaipe@correo.com2");
		//autorDAO.up(autor2);
		
		//DEL
		autorDAO.del(61);
		//System.out.println("*************** DEL***********"+autorDAO.findOne(1));
		try{System.out.println("*************** DEL***********"+autorDAO.findOne(61));} catch (Exception e) { e.printStackTrace();};
		//findAll
		//List<Cliente> clientes = clienteDAO.findAll();
		autorDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		context.close();

	}

}
