package br.com;
import org.junit.Test;

import br.com.dao.IProdutoDAO;
import br.com.dao.ProdutoDAO;
import br.com.domain.Produto;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A1");
		prod.setNome("Celular");
		prod.setCodigoDeBaras(123456348L);
		produtoDAO.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
	}
}
