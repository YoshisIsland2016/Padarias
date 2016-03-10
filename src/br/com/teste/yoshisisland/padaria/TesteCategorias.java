package br.com.teste.yoshisisland.padaria;




import org.junit.Assert;
import org.junit.Test;

import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.model.Categoria;



public class TesteCategorias {
	@Test
	public void testeInserirCategoria() {
		
		
		
		CategoriaDao dao = new CategoriaDao();
		Categoria categoria = new Categoria();

		categoria.setId_categoria(1);
		categoria.setNome_categoria("doces");
		categoria.setDescricao("é doce porque tem açucar demais");
		

		int qtdInicio = dao.getListar().size();  
		dao.getSalvar(categoria); 
		int qtdFim = dao.getListar().size(); 

		Assert.assertEquals(qtdInicio + 1, qtdFim);
	}
	
	@Test
	public void testeRemoverCategoria(){
		
	CategoriaDao dao = new CategoriaDao();
	Categoria categoria = new Categoria();
	
	categoria.setId_categoria(1);
	int qtdInicio = dao.getListar().size();
	dao.getSalvar(categoria);
	int qtdFim = dao.getListar().size();
	dao.close();
	Assert.assertEquals(qtdInicio - 1, qtdFim);
	
	}
	

	
}


