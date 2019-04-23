package com.curso.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.entities.Usuario;
import com.curso.spring.persistence.UsuarioRepository;

@RestController
public class MiController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping(path="/usuario",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Usuario nuevoUsuario(@RequestBody Usuario usuario){
		
		usuarioRepository.save(usuario);
		
		return usuario;
	}
}
