package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void anadir (Estudiante estudiante);
	public Estudiante buscar (Integer id);

}
