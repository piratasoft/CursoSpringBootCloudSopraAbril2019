package com.curso.spring.WebMvcBoot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiController {

	@GetMapping(path="/hola",produces=MediaType.APPLICATION_JSON_VALUE)
	public  String hola(){
		return "Hola Mundo!";
	}
	
	@GetMapping(path="/hola/{nombre}",produces=MediaType.APPLICATION_JSON_VALUE)
	public  String holaConVariable(@PathVariable String nombre){
		return "Hola " + nombre + "!";
	}
	
	@PostMapping(path="/usuario",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Usuario nuevoUsuario(@RequestBody Usuario usuario){
		return usuario;
	}
}
