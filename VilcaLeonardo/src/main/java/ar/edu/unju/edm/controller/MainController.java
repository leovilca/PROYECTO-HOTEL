package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.service.IHabitacionService;
@Controller
public class MainController {
	
	@Autowired
	IHabitacionService iHabitacionService;
	
	@GetMapping("/home")
	
	public String IniciarAplicacion() {
		//INICIO DE SESION
		Habitacion hab = new Habitacion(null, 12345, "simple", "chida", 250);
		iHabitacionService.GuardarHabitacion(hab);
		Habitacion habi = new Habitacion(null, 2345, "doble", "fea", 250);
		iHabitacionService.GuardarHabitacion(habi);
		return "index";
	}
}
