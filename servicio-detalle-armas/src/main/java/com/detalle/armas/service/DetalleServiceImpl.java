package com.detalle.armas.service;

import com.commons.models.entity.Pistola;
import com.detalle.armas.models.Detalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DetalleServiceImpl implements DetalleService {

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Detalle> findAll() {
      /*  List<Pistola> pistolas = Arrays.asList(clienteRest.getForObject("http://localhost:8081/listar",Pistola[].class));
        return pistolas.stream().map(p -> new Detalle(p,1)).collect(Collectors.toList());*/
    	return null;
    }

    @Override
    public Detalle findById(Long id, int letalidad) {
      /*  Map<String,String> pathVariables = new HashMap<>();
        pathVariables.put("id",id.toString());
        Pistola pistola = clienteRest.getForObject("http://localhost:8081/obtenerPistola/{id}",Pistola.class,pathVariables);
        return new Detalle(pistola,letalidad);*/
    	return null;
    }

	@Override
	public Pistola save(Pistola pistola) {
		
		HttpEntity<Pistola> body = new HttpEntity<Pistola>(pistola);
		
		ResponseEntity<Pistola> response = clienteRest.exchange("http://servicio-armas/crear", HttpMethod.POST, body, Pistola.class);
		Pistola pistolaResponse = response.getBody();
		return pistolaResponse;
	}

	@Override
	public Pistola update(Pistola pistola, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}