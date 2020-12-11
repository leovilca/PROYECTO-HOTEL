package ar.edu.unju.edm.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;

@Service
public interface IUsuarioService {
	public Habitacion buscarFecha(LocalDate buscada);
	public Habitacion buscarUsuario(String name);
	public Iterable<Habitacion> MostrarReservas();
}
