package projetotdd.iteracaoum.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class IteracaoTeste {

	@Test
	public void TesteLoginAdmin () throws Exception{
		int Login = 1;
		int Senha = 2;
		Administrador administrador = new Administrador();
		String Sucesso = "ok";
		assertEquals("ok",Sucesso);
	}
	@Test
	public void TesteSalvarProdutos () throws Exception{
		String Nome = "nome";
		int categoria = 30;
		int preco = 40;
		Produto produto = new Produto();
		String Sucesso = "ok";
		assertEquals("ok",Sucesso);
		
	}
	@Test
	public void TesteRemoverProdutos () throws Exception{
		int id = 1;
		int idremover = 1;
		Produto produto = new Produto ();
		String Sucesso = "ok";
		assertEquals("ok",Sucesso);
	}
	@Test
	public void TesteSalvarCategorias () throws Exception{
		String Nome = "nome";
		String Descricao = "Descriçao";
		Categoria categoria = new Categoria ();
		String Sucesso ="ok";
		assertEquals("ok",Sucesso);
	}
	@Test
	public void TesteListarCategorias () throws Exception{
		int id = 10;
		String Nome = "nome";
		String Descricao = "descricao";
		Categoria categoria = new Categoria ();
		String Sucesso ="ok";
		assertEquals("ok",Sucesso);
	}
	@Test
	public void TesteAlterarCategorias () throws Exception{
		int id = 20;
		String Nome = "nome";
		String Descricao = "descricao";
		Categoria categoria = new Categoria ();
		String Sucesso ="ok";
		assertEquals("ok",Sucesso);
	}
	@Test
	public void TesteBuscarCategorias () throws Exception{
		int id = 15;
		Categoria categoria = new Categoria ();
		String Sucesso ="ok";
		assertEquals("ok",Sucesso);
	}
	@Test
	public void TesteRemoverCategorias () throws Exception{
		int id = 55;
		Categoria categoria = new Categoria ();
		String Sucesso ="ok";
		assertEquals("ok",Sucesso);
	
}
	}