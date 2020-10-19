package com.servicio.armas.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.commons.models.entity.Pistola;

public interface PistolaDao extends CrudRepository<Pistola, Long> {
	
}
