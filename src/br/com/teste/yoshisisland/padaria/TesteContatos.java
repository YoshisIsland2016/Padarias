package br.com.teste.yoshisisland.padaria;

import org.junit.Assert;
import org.junit.Test;

import br.com.yoshimachine.padaria.dao.ContatoDao;
import br.com.yoshimachine.padaria.model.Contato;

public class TesteContatos {
	@Test
	public void testeInserirContato() {
		
		
		
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();

		contato.setId_contato(1);
		contato.setEmail("jorgedamaga@gmail.com");
		contato.setNome("jorgedamaga");

		int qtdInicio = dao.getListar().size();  
		dao.getSalvar(contato); 
		int qtdFim = dao.getListar().size(); 

		Assert.assertEquals(qtdInicio + 1, qtdFim);
	}

}
