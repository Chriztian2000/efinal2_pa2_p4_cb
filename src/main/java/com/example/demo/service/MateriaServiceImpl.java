package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MateriaRepo;
import com.example.demo.repository.modelo.Materia;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	private MateriaRepo materiaRepo;

	@Override
	public void guardar(Materia materia) {
		this.materiaRepo.insertar(materia);
	}

	@Override
	public Materia buscar(Integer id) {

		return this.materiaRepo.seleccionar(id);
	}

}
