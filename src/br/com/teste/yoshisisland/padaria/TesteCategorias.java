package br.com.teste.yoshisisland.padaria;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.model.Categoria;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteCategorias {
	
	@Test
	public void testeInserirCategoria() {

		CategoriaDao dao = new CategoriaDao();
		Categoria categoria = new Categoria();
		
		categoria.setNome_categoria("doces");
		categoria.setDescricao("A doce porque tem açucar demais");
		
		int qtdInicio = dao.getListar().size();
		dao.getSalvar(categoria);
		int qtdFim = dao.getListar().size();
		
		System.out.println(qtdInicio);
		System.out.println(qtdFim);
		
		Assert.assertEquals(qtdInicio + 1, qtdFim);
	}

	@Test
	public void testeRemoverCategoria() {

		CategoriaDao dao = new CategoriaDao();
		Categoria categoria = new Categoria();

		categoria.setId_categoria(1);
		int qtdInicio = dao.getListar().size();
		dao.getRemover(categoria.getId_categoria());
		int qtdFim = dao.getListar().size(); 

		Assert.assertEquals(qtdInicio - 1, qtdFim);
		
	}
	@Test
	public void testeAlterarCategoria() throws SQLException {

		CategoriaDao dao = new CategoriaDao();
		Categoria categoria = new Categoria();
		categoria = dao.buscaId(1);
		categoria.setDescricao("decricao");
		categoria.setId_categoria(2);
		categoria.setNome_categoria("doces");
		dao.getAlterar(categoria);
		categoria = dao.buscaId(1);
		dao.close();
		Assert.assertEquals(null, categoria);
	}


}
