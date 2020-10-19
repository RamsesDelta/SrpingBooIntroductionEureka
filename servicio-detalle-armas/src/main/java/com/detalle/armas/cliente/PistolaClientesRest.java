package com.detalle.armas.cliente;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.commons.models.entity.Pistola;

import java.util.List;

@FeignClient(name = "servicio-armas")
public interface PistolaClientesRest {

    @GetMapping("/listar")
    public List<Pistola> listar();

    @GetMapping("/obtenerPistola/{id}")
    public Pistola detalle(@PathVariable Long id);
}
