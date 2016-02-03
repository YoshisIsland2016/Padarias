package artigotdd.contato.teste;

import static org.junit.Assert.*;

import org.junit.Test;


public class ContatoTeste {

	@Test
	public void deveriaSomarDoisValoresPassados()throws Exception {
		
		int valorA = 5;
		int valorB = 3;
		
		Contato contato = new Contato();
		int soma = contato.soma(valorA, valorB);
		
		assertEquals(8, soma);
	}
	
	
	@Test
	public void deveriaSubtrairDoisValoresPassados()throws Exception {
		
		int valorA = 5;
		int valorB = 3;
		
		Contato contato = new Contato();
		int subtrai = contato.subtrai(valorA, valorB);
				
		assertEquals(8, subtrai);
	}

			
}

	

