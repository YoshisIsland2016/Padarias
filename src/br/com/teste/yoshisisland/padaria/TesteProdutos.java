package br.com.teste.yoshisisland.padaria;
import org.junit.Assert;
import org.junit.Test;

import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Categoria;
import br.com.yoshimachine.padaria.model.Produto;

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
		dao.getSalvar(produto);
		int qtdFim = dao.getListar().size();
		
		Assert.assertEquals(qtdInicio - 1, qtdFim);
		
	}
	

}

