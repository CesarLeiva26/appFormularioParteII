package pe.edu.cibertec.appFormularioParteII.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cibertec.appFormularioParteII.model.Alumno;

@Controller
public class AlumnoController {

	@GetMapping("/alumnos")
	public String frmAlumnos(Model model) {
		List<Alumno> lstAlumnos = new ArrayList<>();
		lstAlumnos.add(new Alumno("Alu001","Isaias", "Capistrano", "Masculino"));
		lstAlumnos.add(new Alumno("Alu002", "Maria", "Fernandez", "Femenino"));
		lstAlumnos.add(new Alumno("Alu003", "Emanuel", "Leiva", "Masculino"));
		model.addAttribute("listaalumnos", lstAlumnos);

		return "frmAlumnos";
	}

}
