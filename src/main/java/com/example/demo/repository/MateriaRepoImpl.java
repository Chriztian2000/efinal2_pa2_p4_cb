package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements MateriaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);
		
	}

	@Override
	public Materia seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Materia.class, id);
	}
}
