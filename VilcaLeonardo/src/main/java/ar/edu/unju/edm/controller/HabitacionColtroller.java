package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.IHabitacionService;

@Controller
public class HabitacionColtroller {
	
	@Autowired
	IHabitacionService iHabitacionService;
	
	@GetMapping("/Habitacion")
	
	public String ReservaHabitacion() {
		return "ReservaHabitacion";
	}
	public String ReservaHabitaciones() {
		return "ReservaHabitaciones";
	}
}