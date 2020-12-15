package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.IUsuarioService;
@Controller
public class MainController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	
	@GetMapping("/home")
	public String IniciarAplicacion() {
		return "index";
	}
}
