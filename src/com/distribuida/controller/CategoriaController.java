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

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.categoria;

@Controller
@RequestMapping("/categoria")                 //path principal
public class CategoriaController {
	
	
	//JSP.-Java sever page,son las paginas web de tecnologia java
	
	@Autowired
	private CategoriaDAO CategoriaDAO;
	
	
	@GetMapping("/findAll")                   // path secundario
	public String findAll(Model model) {
		
		//try {
		
	
		List<categoria> Categorias =CategoriaDAO.findAll();
		
		model.addAllAttributes(Categorias);       //EJ: clave =keyCategorias , valor =Categorias
		
		return "listar-Categorias";        // eso es el nombre del formulario ej. listar-Categorias.html o listar-Categorias.jsp
//	}catch (Exception e) {
//		//TODO: handle exception
//		e.printStackTrace();
		
//	}
		
	}
		
		
		@GetMapping("/findOne")
		public String findOne(@RequestParam("idCategoria") @Nullable Integer idCategoria 
			                 ,@RequestParam("opcion") @Nullable Integer opcion
			                 ,Model model
			     ) {
//			try {
		 
		
			  if(idCategoria !=null) {
				  categoria Categoria = CategoriaDAO.findOne(idCategoria);
				  model.addAttribute("Categoria",Categoria);
				  
			  }
			  
			  if(opcion ==1) return "add-Categorias";  //actualizacion
			  else return "del-Categorias";            //eliminacion
				
//			}catch (Exception e) {
//				//TODO: handle exception
//				e.printStackTrace();  
			  
//			}
			  
			  }
		
		@PostMapping("/add")
		public String add(@RequestParam("idCategoria") @Nullable Integer idCategoria
				         ,@RequestParam("categoria") @Nullable String categoria
				       
				         ,Model model
				         
				 ) {
			
//			try {
		
			if(idCategoria == null) {
			categoria Categoria = new categoria(0,categoria);
			CategoriaDAO.add(Categoria);
			
			}else {
				
				categoria Categoria2 = new categoria(idCategoria, categoria);
				CategoriaDAO.up(Categoria2);
			}
			
		
		return "redirect:/Categorias/findAll";     //ir a formulario web por path o url
		
//		}catch (Exception e) {
//		//TODO: handle exception
//		}
		
		
		
		
	} 
          @GetMapping("/del")
          public String del (@RequestParam ("idCategoria") @Nullable Integer idCategoria) {
        	
   //     	try {  
        	  
        	  CategoriaDAO.del(idCategoria);
        	  return "redirect:/Categorias/findAll";
//          }catch (Exception e) {
//      		//TODO: handle exception
//        }
        	  
          }
}
