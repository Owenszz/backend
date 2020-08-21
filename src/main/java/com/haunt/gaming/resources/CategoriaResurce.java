package com.haunt.gaming.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haunt.gaming.domain.Categoria;

@RestController 
@RequestMapping(value="/categorias")
public class CategoriaResurce {
	 	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
	
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "escritório");
		
		List <Categoria> Lista = new ArrayList<>();
		Lista.add(cat1);
		Lista.add(cat2);
		
		
		return Lista;
	}
}
