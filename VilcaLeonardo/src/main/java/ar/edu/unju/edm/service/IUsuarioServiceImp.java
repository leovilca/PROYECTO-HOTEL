package ar.edu.unju.edm.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionDAO;

@Service
public class IUsuarioServiceImp implements IUsuarioService {
	
	@Autowired
	IHabitacionDAO iHabitacionDAO;
	
	@Override
	public Habitacion buscarFecha(LocalDate buscada) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Habitacion buscarUsuario(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public	Iterable<Habitacion> MostrarReservas() {
		return iHabitacionDAO.findAll();
	}
}
