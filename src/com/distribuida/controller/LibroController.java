package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.libro;

@Controller
@RequestMapping("/Libros")                 //path principal
public class LibroController {
	
	
	//JSP.-Java sever page,son las paginas web de tecnologia java
	
	@Autowired
	private LibroDAO LibroDAO;
	
	@Autowired
	private AutorDAO autorDAO;
	 
	@Autowired
	private CategoriaDAO categoriaDAO;

	private int idcategoria;
	
	
	
	
	
	@GetMapping("/findAll")                   // path secundario
	public String findAll(ModelMap modelMap) {
		
		//try {
		
	
		List<libro> libros =LibroDAO.findAll();
		
		modelMap.addAllAttributes(libros);       //EJ: clave =keyLibros , valor =Libros
		
		return "listar-libros";        // eso es el nombre del formulario ej. listar-Libros.html o listar-Libros.jsp
//	}catch (Exception e) {
//		//TODO: handle exception
//		e.printStackTrace();
		
//	}
		
	}
		
		
		@GetMapping("/findOne")
		public String findOne(@RequestParam("idLibro") @Nullable Integer idLibro 
			                 ,@RequestParam("opcion") @Nullable Integer opcion
			                 ,Model model
			     ) {
//			try {
		 
		
			  Model modelMap;
			if(idLibro !=null) {
				  libro libro = LibroDAO.findOne(idLibro);
				  modelMap.addAttribute("libro",libro);
				  
			  }
			  
			  modelMap.addAttribute("autores", autorDAO.findAll());
			  modelMap.addAttribute("categorias", categoriaDAO.findAll());
			  
			  
			  if(opcion ==1) return "add-libros";  //actualizacion
			  else return "del-libros";            //eliminacion
				
//			}catch (Exception e) {
//				//TODO: handle exception
//				e.printStackTrace();  
			  
//			}
			  
			  }
		
		@PostMapping("/add")
		public String add(@RequestParam("idlibro") @Nullable Integer idLibro
				         ,@RequestParam("titutlo") @Nullable String titutlo
				     	 ,@RequestParam("editorial") @Nullable String editorial
				     	 ,@RequestParam("numpaginas") @Nullable String numpaginas
				     	 ,@RequestParam("edicion") @Nullable String edicion
				     	 ,@RequestParam("idioma") @Nullable String idioma
				     	 ,@RequestParam("fechpublicacion") @Nullable String fechpublicacion
				     	 ,@RequestParam("descripcion") @Nullable String descripcion
				     	 ,@RequestParam("tipopasta") @Nullable String tipopasta
				     	 ,@RequestParam("isbn") @Nullable String isbn
				     	 ,@RequestParam("numejemplares") @Nullable String numejemplares
				     	 ,@RequestParam("portada") @Nullable String portada
				     	 ,@RequestParam("presentacion") @Nullable String presentacion
				     	 ,@RequestParam("precio") @Nullable String precio
				     	 ,@RequestParam("id_categoria") @Nullable String categoria
				     	 ,@RequestParam("id_autor") @Nullable String autor
				     	
				         
				 ) {
	
			if(idLibro ==null) {
				libro libro = new libro(0,"titulo", "editorial",22,"edicion", "idioma",new Date()
				, "descripcion", "tipoPasta", "ISBN", "portada", "presentacion",22,22);
				
				libro.setCategoria(categoriaDAO.findOne(idcategoria));
				libro.setAutor(autorDAO.findOne(idLibro));
				
				LibroDAO.add(libro);
				
			
			}
			
		 
			return "redirect:/libros/listar-libros";
		 
		}
			@GetMapping("/dell")
			public String del(@RequestParam("idLibro") @Nullable Integer idLibro) {
				LibroDAO.del(idLibro);
				return "redirect:/libros/listar-libros";
			}
		
	
          
}
