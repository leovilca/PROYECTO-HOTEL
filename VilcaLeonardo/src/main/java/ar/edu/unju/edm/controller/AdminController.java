package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class AdminController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	
	@GetMapping("/Client")
	public String InterfazAdmin() {
		return "InterfazAdmin";
	}
	
	@GetMapping("/Admin")
	public String Admin() {
		return "InterfazAdmin";
	}
	@GetMapping("/BuscarFecha")
	public String BuscarFecha() {
		return "BuscarFecha";
	}
	@GetMapping("/BuscarUsuario")
	public String BuscarUsuario() {
		return "BuscarUsuario";
	}
}
