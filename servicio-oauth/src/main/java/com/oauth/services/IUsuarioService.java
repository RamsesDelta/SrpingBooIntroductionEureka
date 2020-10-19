package com.oauth.services;

import com.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
}
