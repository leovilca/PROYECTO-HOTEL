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
		Habitacion hab = new Habitacion(null,123,"TipoEj","DescripcionEj",500,"Manolito");
		iHabitacionService.GuardarHabitacion(hab);
		return "index";
	}
}
