/**
 * 
 */
package br.com;


import br.com.dao.CursoDAO;
import br.com.dao.ICursoDAO;
import br.com.domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {
	
	private ICursoDAO cursoDAO;
	
	public CursoTest() {
		cursoDAO = new CursoDAO();
	}

	@Test
	public void cadastrar( ) {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		curso = cursoDAO.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}

}

