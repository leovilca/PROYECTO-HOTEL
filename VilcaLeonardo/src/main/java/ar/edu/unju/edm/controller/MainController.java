package ar.edu.unju.edm.controller;
/*
import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.model.Usuario;
//*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.IHabitacionService;
import ar.edu.unju.edm.service.IUsuarioService;
@Controller
public class MainController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	
	@Autowired
	IHabitacionService iHabitacionService;
	
	@GetMapping({"/","/login","/home","/login?error=true"})
	public String IniciarAplicacion(Model model) {
		/*
		// AGREGADO DE USUARIOS Y HABITACIONES DE EJEMPLO
		
		 iHabitacionService.GuardarHabitacion(new Habitacion((long)1,12345,"Doble","Bonita"));
		 iHabitacionService.GuardarHabitacion(new Habitacion((long)2,46372,"Simple","Pequeña"));
		 iHabitacionService.GuardarHabitacion(new Habitacion((long)3,86472,"Doble","Grande"));
		 iHabitacionService.GuardarHabitacion(new Habitacion((long)4,19726,"Simple","Comoda"));
		 iHabitacionService.GuardarHabitacion(new Habitacion((long)5,11123,"Doble","Segura"));
		 Usuario bas = new Usuario((long)1,"userAdmin","userAdmin","Leonardo","Vilca",44125126,"Admin");
		 iUsuarioService.EncriptarYGuardarUsuario(bas);
		 bas = new Usuario((long)2,"userClient","userClient","Fabricio","Gutierrez",43978342,"Client");
		 iUsuarioService.EncriptarYGuardarUsuario(bas);
		 //*/
		return "index";
	}
}
