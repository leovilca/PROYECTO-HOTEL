package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.IUsuarioService;
@Controller
public class MainController {
	
	@Autowired
	IUsuarioService iUsuarioService;
	
	@GetMapping({"/","/login","/home","/login?error=true"})
	public String IniciarAplicacion(Model model) {
		/*
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		String pw = iUsuarioService.BuscarPorId((long)3).getContraseña();
		iUsuarioService.BuscarPorId((long)3).setContraseña(bCryptPasswordEncoder.encode(pw));
		System.out.println("CONTRASEÑA  "+pw+" ENCODEADA:  "+bCryptPasswordEncoder.encode(pw));
		iUsuarioService.update();
		*/
		return "index";
	}
}
