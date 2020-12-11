package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class AdminController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	
	@GetMapping("/Admin")
	
	public String BuscarFecha() {
		return "BuscarFecha";
	}
	public String BuscarUsuario() {
		return "BuscarUsuario";
	}
	public String MostrarReservas() {
		return "MostrarReservas";
	}
}
