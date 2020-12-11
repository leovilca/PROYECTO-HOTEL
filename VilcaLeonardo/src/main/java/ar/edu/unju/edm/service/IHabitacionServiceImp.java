package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionDAO;

@Service
public class IHabitacionServiceImp implements IHabitacionService {
	@Autowired
	IHabitacionDAO iHabitacionDAO;
	@Override
	public void GuardarHabitacion(Habitacion unaHabitacion) {
		iHabitacionDAO.save(unaHabitacion);
		
	}
	@Override
	public void ReservarHabitacion(Long reserva, String Usuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ReservarHabitaciones(List<Long> habitaciones, String Usuario) {
		// TODO Auto-generated method stub
		
	}

}
