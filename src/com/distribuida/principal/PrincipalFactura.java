package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
	ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
				
		// CRUD : CREATE , READ, UPDATE, DELETE
		// Add  
	Factura factura = new Factura(0, "FAC-0090", new Date(), 66.63, 15.36, 76.35);
	factura.setCliente(clienteDAO.findOne(2));
	//facturaDAO.add(factura);
		// Up
	Factura factura2 = new Factura(92, "FAC-0092", new Date(), 622.632, 152.362, 762.352);
	factura2.setCliente(clienteDAO.findOne(3));
	//facturaDAO.up(factura2);
		
		// del
		facturaDAO.del(92);
		
		//findOne
		System.out.println("************************* DEL *****************"+facturaDAO.findOne(92));
		// findAll
		
		facturaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
			
		context.close();
	}

}
