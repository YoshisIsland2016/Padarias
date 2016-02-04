package artigotdd.produto.teste;

import static org.junit.Assert.*;

import org.junit.Test;


public class ProdutoTeste {

	@Test
	public void deveriaSomarDoisValoresPassados()throws Exception {
		
		int valorA = 4;
		int valorB = 1;
		
		Produto produto = new Produto();
		int soma = produto.soma(valorA, valorB);
		
		assertEquals(5, soma);
	}
	
	
	@Test
	public void deveriaSubtrairDoisValoresPassados()throws Exception {
		
		int valorA = 4;
		int valorB = 1;
		
		Produto produto = new Produto();
		int subtrai = produto.subtrai(valorA, valorB);
				
		assertEquals(3, subtrai);
	}

			
}

	

