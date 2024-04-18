package br.com.dao;


import br.com.domain.Matricula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MatriculaDAO implements IMatriculaDAO {

	@Override
	public Matricula cadastrar(Matricula mat) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();		
		entityManager.persist(mat);	
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		entityManagerFactory.close();
		
		return mat;
	}

	

}
