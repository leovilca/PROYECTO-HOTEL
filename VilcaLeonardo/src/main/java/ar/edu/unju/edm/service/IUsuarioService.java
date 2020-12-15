package ar.edu.unju.edm.service;

//import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;

@Service
public interface IUsuarioService {
	public Usuario BuscarPorId(Long id);
	public void update();
	//public Optional<Usuario> BuscarPorUsuario(String username);
}
