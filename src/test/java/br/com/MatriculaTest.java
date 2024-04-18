/**
 * 
 */
package br.com;


import br.com.dao.IMatriculaDAO;
import br.com.dao.MatriculaDAO;
import br.com.domain.Matricula;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {
	
	private IMatriculaDAO matriculaDAO;
	
	public MatriculaTest() {
		matriculaDAO = new MatriculaDAO();
	}
	
	@Test
	public void cadastrar() {
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		matriculaDAO.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
		
	}
}
