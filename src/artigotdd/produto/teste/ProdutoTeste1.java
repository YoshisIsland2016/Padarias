package artigotdd.produto.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

	public class ProdutoTeste1 {

	
	@Test
	public void deveriaSubtrairDoisValoresPassados()throws Exception {
		
		int valorA = 4;
		int valorB = 1;
		
		Produto produto = new Produto();
		int subtrai = produto.subtrai(valorA, valorB);
				
		assertEquals(3, subtrai);
	}

	
	
}