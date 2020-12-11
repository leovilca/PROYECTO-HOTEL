package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.repository.IHabitacionDAO;
import ar.edu.unju.edm.service.IHabitacionService;

@Controller
public class HabitacionColtroller {
	
	@Autowired
	IHabitacionService iHabitacionService;
	IHabitacionDAO iHabitacionDAO;
	Reserva unaReserva;
/*
	@GetMapping("/Reserva")
	public String ReservaHabitacion(Model model) {
		model.addAttribute("reservas1", iHabitacionService.MostrarHabitaciones());
		model.addAttribute("reservaDelForm", unaReserva);
		return "ReservaHabitacion";
	}

	@PostMapping("/Reserva")
	public String AgregarReserva(@ModelAttribute("reservaDelForm") Reserva reserva, Model model) {
		try {
			reserva.setDesayuno(false);
			iHabitacionService.ReservarHabitacion(reserva);
		}catch(Exception e) {
			model.addAttribute("Error de Formulario", e.getMessage());
		}
		return "ReservaHabitacion";
	}
*/
	@GetMapping("/Reservas")
	public String ReservaHabitaciones() {
		return "ReservaHabitaciones";
	}
}