package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepo estudianteRepo;
		

	@Override
	public void anadir(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
		
	}	

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionar(id);
	}

}
