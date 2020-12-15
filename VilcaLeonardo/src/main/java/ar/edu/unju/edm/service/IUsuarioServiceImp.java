package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuarioDAO;

@Service
public class IUsuarioServiceImp implements IUsuarioService {
	
	@Autowired
	IUsuarioDAO iUsuarioDAO;


	@Override
	public Usuario BuscarPorId(Long id) {
		return iUsuarioDAO.findById(id).get();
	}
}
