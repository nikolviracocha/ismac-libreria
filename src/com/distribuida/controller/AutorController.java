package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

@Controller
@RequestMapping("/Autor")                 //path principal
public class AutorController {
	
	
	//JSP.-Java sever page,son las paginas web de tecnologia java
	
	@Autowired
	private AutorDAO autorDAO;
	
	
	@GetMapping("/findAll")                   // path secundario
	public String findAll(Model model) {
		
		//try {
		
	
		List<Autor> Autor = autorDAO.findAll();
		
		model.addAllAttributes(Autor);       //EJ: clave =keyAutors , valor =Autors
		
		return "listar-Autor";        // eso es el nombre del formulario ej. listar-Autors.html o listar-Autors.jsp
//	}catch (Exception e) {
//		//TODO: handle exception
//		e.printStackTrace();
		
//	}
		
	}
		
		
		@GetMapping("/findOne")
		public String findOne(@RequestParam("idAutor") @Nullable Integer idAutor 
			                 ,@RequestParam("opcion") @Nullable Integer opcion
			                 ,Model model
			     ) {
//			try {
		 
		
			  if(idAutor !=null) {
				  Autor Autor = autorDAO.findOne(idAutor);
				  model.addAttribute("Autor",Autor);
				  
			  }
			  
			  if(opcion ==1) return "add-Autor";  //actualizacion
			  else return "del-Autor";            //eliminacion
				
//			}catch (Exception e) {
//				//TODO: handle exception
//				e.printStackTrace();  
			  
//			}
			  
			  }
		
		@PostMapping("/add")
		public String add(@RequestParam("idAutor") @Nullable Integer idAutor
				         ,@RequestParam("nombre") @Nullable String nombre
				         ,@RequestParam("apellido") @Nullable String apellido
				         ,@RequestParam("pais") @Nullable String pais
				         ,@RequestParam("direccion") @Nullable String direccion
				         ,@RequestParam("telefono") @Nullable String telefono
				         ,@RequestParam("correo") @Nullable String correo
				         ,Model model
				         
				 ) {
			
//			try {
		
			if(idAutor == null) {
			Autor autor = new Autor(0,nombre,apellido,pais,direccion,telefono,correo);
			autorDAO.add(autor);
			
			}else {
				
				Autor autor2 = new Autor(idAutor,nombre,apellido,pais,direccion,telefono,correo);
				autorDAO.up(autor2);
			}
			
		
		return "redirect:/Autors/findAll";     //ir a formulario web por path o url
		
//		}catch (Exception e) {
//		//TODO: handle exception
//		}
		
		
		
		
	} 
          @GetMapping("/del")
          public String del (@RequestParam ("idAutor") @Nullable Integer idAutor) {
        	
   //     	try {  
        	  
        	  autorDAO.del(idAutor);
        	  return "redirect:/Autors/findAll";
//          }catch (Exception e) {
//      		//TODO: handle exception
//        }
        	  
          }
}
