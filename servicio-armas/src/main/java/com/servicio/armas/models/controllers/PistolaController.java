package com.servicio.armas.models.controllers;

import com.commons.models.entity.Pistola;
import com.servicio.armas.models.service.IPistolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PistolaController {

    @Autowired
    private IPistolaService pistolaService;

    @GetMapping("/listar")
    public List<Pistola> lista (){
        return pistolaService.findAll();
    }

    @GetMapping("/obtenerPistola/{id}")
    public Pistola detalle(@PathVariable Long id){
        return pistolaService.findById(id);
    }
    
    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Pistola crear(@RequestBody Pistola pistola) {
    	return pistolaService.save(pistola);
    }
  
    @PutMapping("/editar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pistola editar(@RequestBody Pistola pistola,@PathVariable Long id) {
    	Pistola pistolaDB = pistolaService.findById(id);
    	
    	pistolaDB.setNombre(pistola.getNombre());
    	pistolaDB.setPais(pistola.getPais());
    	pistolaDB.setCalibre(pistola.getCalibre());
    	
    	return pistolaService.save(pistolaDB);
    }
    
    @DeleteMapping("eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
    	pistolaService.deleteById(id);
    }
}
