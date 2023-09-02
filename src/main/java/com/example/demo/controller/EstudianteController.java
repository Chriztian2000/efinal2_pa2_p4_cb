package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private EstudianteService estudianteService;

	// http://localhost:8080/matricula/estudiantes/guardar
	@GetMapping("/guardar")
	public String guardar(Estudiante estudiante) {

		return "redirect:/";
	}

	@GetMapping("/buscar")
	public String buscar(Model model) {

		return "redirect:/";
	}
}
