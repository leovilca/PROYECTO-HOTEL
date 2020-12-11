package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;

@Service
public interface IHabitacionService {
	public void GuardarHabitacion(Habitacion unaHabitacion);
	public void ReservarHabitacion(Long reserva, String Usuario);
	public void ReservarHabitaciones(List<Long> habitaciones,String Usuario);
}
