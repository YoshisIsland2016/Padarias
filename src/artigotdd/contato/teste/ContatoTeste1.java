package artigotdd.contato.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContatoTeste1 {

	
	@Test
	public void deveriaSubtrairDoisValoresPassados()throws Exception {
		
		int valorA = 5;
		int valorB = 3;
		
		Contato contato = new Contato();
		int subtrai = contato.subtrai(valorA, valorB);
				
		assertEquals(2, subtrai);
	}

	
	
}
