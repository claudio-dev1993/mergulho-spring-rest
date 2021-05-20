package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente(1L, "João", "99999-1111", "joão@algaworks.com");
		
		var cliente2 = new Cliente(2L, "Maria", "11 9777-2222",	"maria@algaworks.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
