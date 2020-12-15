package ar.edu.unju.edm.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.service.IHabitacionService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class AdminController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	@Autowired
	IHabitacionService iHabitacionService;
	
	@GetMapping("/Client")
	public String InterfazClient() {
		return "InterfazClient";
	}
	
	@GetMapping("/Admin")
	public String Admin(Model model) {
		return "InterfazAdmin";
	}
	
	
	
	
	@GetMapping("/BuscarFecha")
	public String BuscarFecha(Model model) {
		model.addAttribute("fecha", new String());
		return "BuscarFecha";
	}
	@PostMapping("/BuscarFecha")
	public String IrABuscarFecha(@ModelAttribute("fecha") String fecha, Model model) {
		System.out.println("Fecha buscada PRIMERA: "+fecha);
		return MostrarFecha(fecha,model);
	}
	@GetMapping("/FechaBuscada")
	public String MostrarFecha(String fecha, Model model) {
		model.addAttribute("reservas",iHabitacionService.BuscarPorFecha(fecha));
		System.out.println("Fecha buscada SEGUNDA: "+fecha);
		return "UsuarioBuscado";
	}
	
	
	
	
	@GetMapping("/BuscarUsuario")
	public String BuscarUsuario(Model model) {
		model.addAttribute("user", new String());
		return "BuscarUsuario";
	}
	@PostMapping("/BuscarUsuario")
	public String IrABuscarUsuario(@ModelAttribute("user") String usuario, Model model) {
		System.out.println("Usuario buscado PRIMERO: "+usuario);
		return MostrarUsuario(usuario,model);
	}
	@GetMapping("/UsuarioBuscado")
	public String MostrarUsuario(String user, Model model) {
		user = "LeitoBD";
		model.addAttribute("reservas",iHabitacionService.BuscarPorUsuario(user));
		System.out.println("Usuario buscado SEGUNDO: "+user);
		return "UsuarioBuscado";
	}
}
