package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.dao.ClienteDAO;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		//CRUD : CREATE , READ , UPDATE ,DELETE
		
		//ADD
		Cliente cliente = new Cliente(0,"123456789","juan","taipe","av.por ahi..." ,"0987654321" , "jtaipe@correo.com");
		//clienteDAO.add(cliente);
		
		//UP
		Cliente cliente2 = new Cliente(58,"123456789","juan","taipe", "av.por ahi..." ,"0987654321","jtaipe@correo.com");
		clienteDAO.up(cliente2);
		
		//DEL
		//clienteDAO.del(1);
		System.out.println("*************** DEL***********"+clienteDAO.findOne(58));
		
		//findAll
		//List<Cliente> clientes = clienteDAO.findAll();
		clienteDAO.findALL().forEach(item -> {System.out.println(item.toString());});
		context.close();
	
 


	}

}
