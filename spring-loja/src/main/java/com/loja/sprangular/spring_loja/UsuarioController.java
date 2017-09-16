package com.loja.sprangular.spring_loja;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@RequestMapping(value = "/login")
	@ResponseBody
	public String property(@ModelAttribute("usuario") Usuario usuario) {
		System.out.println(usuario.getUserName());
		System.out.println(usuario.getPassword());
		return "Hello";
	}

}
