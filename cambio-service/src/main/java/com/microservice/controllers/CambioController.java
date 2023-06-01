package com.microservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Cambio;

@RestController
@RequestMapping("/cambio-service")
public class CambioController {
	
	@Autowired
	private Environment environment;

	@GetMapping(value = "/{amount}/{from}/{to}")
	public Cambio getCambio(@PathVariable("amount") double amount, @PathVariable("from") String from,
			@PathVariable("to") String to) {
		var port = environment.getProperty("local.server.port");
		return new Cambio(1L, from, to, 1.0, 1.0, port);

	}

}
