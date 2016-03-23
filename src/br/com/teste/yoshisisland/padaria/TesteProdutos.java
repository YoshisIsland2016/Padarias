package br.com.teste.yoshisisland.padaria;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Categoria;
import br.com.yoshimachine.padaria.model.Produto;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteProdutos {
	@Test
	public void testeInserirProduto() {
		
		ProdutoDao dao = new ProdutoDao();
		Produto produto = new Produto();
		Categoria categoria = new Categoria();
		
		categoria.setId_categoria(1);
		categoria.setNome_categoria("bolos");
		categoria.setDescricao("tem muito acucar");
		
		produto.setId_produto(1);
		produto.setNome_produto("opa");
		produto.setCategoriafk(categoria);
		produto.setPreco(0);
		produto.setPromocao(false);
		produto.setImagem("imagem");

		int qtdInicio = dao.getListar().size();  
		dao.getSalvar(produto); 
		int qtdFim = dao.getListar().size(); 

		Assert.assertEquals(qtdInicio + 1, qtdFim);
	}
	
	@Test
	public void testeRemoverProduto(){
		
		ProdutoDao dao = new ProdutoDao();
		Produto produto = new Produto();
		
		produto.setId_produto(1);
		
		int qtdInicio = dao.getListar().size();
		dao.getRemover(produto.getId_produto());
		int qtdFim = dao.getListar().size();
		
		Assert.assertEquals(qtdInicio - 1, qtdFim);
		
	}
	
	@Test
	public void testeAlterarProduto() throws SQLException {

		ProdutoDao dao = new ProdutoDao();
		Produto produto = new Produto();
		produto = dao.buscaId(1);
		produto.setNome_produto("bolo de goiaba");;
		produto.setCategoriafk(null);
		produto.setPreco(12.3);
		produto.setPromocao(false);
		produto.setImagem(null);	
		produto.setDescricao("e de goiaba");
		dao.getAlterar(produto);
		produto = dao.buscaId(1);
		dao.close();
		
		Assert.assertEquals(null, produto);
		
	}
	
	@Test
	public void testeBuscarProduto() throws SQLException {
		
		ProdutoDao dao = new ProdutoDao ();
		Produto produto = new Produto();
		
		produto.setNome_produto("rocambole");
		produto.setCategoriafk(null);
		produto.setPromocao(true);
		
		dao.getBuscar("rocambole", null, true);
		dao.close();
		Assert.assertEquals(null,produto);
	}
}

