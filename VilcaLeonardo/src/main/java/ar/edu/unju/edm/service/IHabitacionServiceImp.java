package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.repository.IHabitacionDAO;

@Service
public class IHabitacionServiceImp implements IHabitacionService {
	@Autowired
	IHabitacionDAO iHabitacionDAO;
	Habitacion unaHabitacion;
	@Override
	public void GuardarHabitacion(Habitacion unaHabitacion) {
		iHabitacionDAO.save(unaHabitacion);
	}
	@Override
	public void ReservarHabitaciones(List<Long> habitaciones, String Usuario) {
		// TODO Auto-generated method stub
	}
	@Override
	public void ReservarHabitacion(Reserva reserva) {
		iHabitacionDAO.findById(reserva.getCodigoReserva()).get().setUser(reserva.getUsuarioReserva());
		iHabitacionDAO.findById(reserva.getCodigoReserva()).get().setDesayuno(reserva.getDesayuno()); //
		System.out.println("Reserva a guardar: "  +reserva.getUsuarioReserva()+"   "+reserva.getCodigoReserva());
	}
	@Override
	public Iterable<Habitacion> MostrarHabitaciones() {
		return iHabitacionDAO.findAll();
	}
	@Override
	public void update() {
		Habitacion xd = new Habitacion();
		iHabitacionDAO.save(xd);
		iHabitacionDAO.delete(xd);
		
	}

}
