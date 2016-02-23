package br.com.teste.yoshisisland.padaria;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;

import br.com.yoshimachine.padaria.dao.ContatoDao;
import br.com.yoshimachine.padaria.model.Contato;

@FixMethodOrder
public class TesteContatos {
	@Test
	public void testeInserirContato() throws SQLException {



		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();

		contato.setEmail("jorgedamaga@gmail.com");
		contato.setNome("jorgedamaga");

		int qtdInicio = dao.getListar().size();  
		dao.getSalvar(contato); 
		int qtdFim = dao.getListar().size(); 
		dao.close();
		Assert.assertEquals(qtdInicio + 1, qtdFim);
	}

	@Test
	public void testeAlterarContato() throws SQLException {



		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		contato = dao.buscaEmail("jorgedamaga@gmail.com");
		contato.setEmail("jorgedamaga2@gmail.com");
		contato.setNome("jorgedamaga2");
		dao.getAlterar(contato);
		contato = dao.buscaEmail("jorgedamaga@gmail.com");
		dao.close();
		Assert.assertEquals(null, contato);
	}

}
