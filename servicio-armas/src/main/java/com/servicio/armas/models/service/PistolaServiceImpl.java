package com.servicio.armas.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commons.models.entity.Pistola;
import com.servicio.armas.models.dao.PistolaDao;

import org.springframework.transaction.annotation.Transactional;


@Service
public class PistolaServiceImpl implements IPistolaService {
	
	@Autowired
	private PistolaDao pistolaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Pistola> findAll() {
		return (List<Pistola>) pistolaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Pistola findById(Long id) {
		return pistolaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Pistola save(Pistola pistola) {
		return pistolaDao.save(pistola);
	}

	@Override
	@Transactional
	public void deleteById(long id) {
		pistolaDao.deleteById(id);
	}

}
