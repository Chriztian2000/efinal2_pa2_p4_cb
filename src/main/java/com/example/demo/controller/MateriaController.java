package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.MateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private MateriaService materiaService;

	@GetMapping("/guardar")
	public String guardar(Materia materia) {		
		return "redirec:/";
	}

	
	@GetMapping("/buscar")
	public String buscar(Model model) {
		return "redirect:/";
	}
}
