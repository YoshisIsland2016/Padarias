package br.com.teste.yoshisisland.padaria;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.yoshimachine.padaria.dao.ContatoDao;
import br.com.yoshimachine.padaria.model.Contato;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteContatos {
	@Test
	public void testeInserirContato() throws SQLException {

		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();

		contato.setEmail("jorgedamaga@gmail.com");
		contato.setNome("jorgedamaga");
		contato.setMensagem("jorge � s� da maga");

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
		contato.setMensagem("jorge danado da maga");
		dao.getAlterar(contato);
		contato = dao.buscaEmail("jorgedamaga@gmail.com");
		dao.close();
		Assert.assertEquals(null, contato);
	}

	@Test
	public void testeRemoverContato() throws SQLException {

		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();
		
		contato.setId_contato(1);

		int qtdInicio = dao.getListar().size();
		dao.getRemover(contato.getId_contato());
		int qtdFim = dao.getListar().size();
		dao.close();
		Assert.assertEquals(qtdInicio - 1, qtdFim);

	}

}
