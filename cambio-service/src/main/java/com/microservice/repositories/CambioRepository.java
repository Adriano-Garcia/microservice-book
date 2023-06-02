package com.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);

}
