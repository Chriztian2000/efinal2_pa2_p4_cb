package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface MateriaRepo {
	
	public void insertar(Materia materia);
	public Materia seleccionar(Integer id);
	

}
