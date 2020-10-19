package com.servicio.armas.models.service;

import java.util.List;

import com.commons.models.entity.Pistola;

public interface IPistolaService {

	public List<Pistola> findAll();
	public Pistola findById(Long id);
	
	public Pistola save(Pistola pistola);
	
	public void deleteById(long id);
}
