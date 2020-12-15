package ar.edu.unju.edm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.model.Reserva;

@Service
public interface IHabitacionService {
	public void GuardarHabitacion(Habitacion unaHabitacion);
	public void ReservarHabitacion(Reserva reserva);
	public void ReservarHabitaciones(List<Long> habitaciones,String Usuario);
	public Iterable<Habitacion> MostrarHabitaciones();
	public void update();
	public Iterable<Habitacion> BuscarPorUsuario(String user);
	public Iterable<Habitacion> BuscarPorFecha(LocalDate fecha);
}