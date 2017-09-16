package com.loja.sprangular.spring_loja;

import java.util.ArrayList;
import java.util.List;
  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UsuarioController {
 
	List<Usuario> bikes = null;
 
	@RequestMapping("/api/allusers")
	public List<Usuario> getAllBikes() {
		this.createBikes();
		return this.bikes;
	}
 
	private void createBikes() {
		bikes = new ArrayList<Usuario>();
		bikes.add(new Usuario(1));
		bikes.add(new Usuario(2));
		bikes.add(new Usuario(3));
		bikes.add(new Usuario(4));
	}
 
}
