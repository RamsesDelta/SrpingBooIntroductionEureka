package com.detalle.armas.service;

import com.commons.models.entity.Pistola;
import com.detalle.armas.models.Detalle;


import java.util.List;

public interface DetalleService {

    public List<Detalle> findAll();

    public Detalle findById(Long id, int letalidad);
    
    public Pistola save(Pistola pistola);
    
    public Pistola update(Pistola pistola, Long id);
    
    public void delete(Long id);
}
