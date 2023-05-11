package pe.edu.cibertec.appFormularioParteII.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cibertec.appFormularioParteII.model.Promedio;

@Controller
public class PromedioController {

	@GetMapping("/promedio")
	public String frmPromedio(Model model) {
		List<Promedio> pro = new ArrayList<Promedio>();
		pro.add(new Promedio(12, 18, 15, 18));
		model.addAttribute("Listapromedio", pro);
		return "frmPromedio";
	}
	
}
