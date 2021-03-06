package br.com.yoshimachine.padaria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yoshimachine.padaria.dao.AvaliacaoDao;
import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Produto;

@Controller
public class TelaController {
	
	@RequestMapping("exibirHome")
	public String exibirHome()
	{		
		return "layout/index";
	}	
	@RequestMapping("exibirProdutos")
	public String exibirProdutos(Model mP,Model mC){
		CategoriaDao dao2 = new CategoriaDao();		
		mC.addAttribute("categorias", dao2.getListar());
		
		ProdutoDao dao = new ProdutoDao();
		
		mP.addAttribute("produtos",dao.getListar());
		
		return "layout/produtos";
	}
	@RequestMapping("exibirSobreNos")
	public String exibirSobreNos(){
		
		return "layout/sobre_nos";
	}
	
	@RequestMapping("verCategoria")
	public String verCategoria(int id,Model mP,Model mC){
		ProdutoDao dao = new ProdutoDao();
		List<Produto> listaCategoriaProduto = dao.getBuscar("", id, false);
		mP.addAttribute("produtos", listaCategoriaProduto);
		
		CategoriaDao dao2 = new CategoriaDao();		
		mC.addAttribute("categorias", dao2.getListar());
		
		return "layout/produtos";
	}
	@RequestMapping("verProduto")
	public String verProduto(Produto produto,Model mP,Model mA)
	{
		ProdutoDao dao = new ProdutoDao();
		mP.addAttribute("produto",dao.buscaId(produto.getId_produto()));
		
		AvaliacaoDao avaliacaoDao = new AvaliacaoDao();
		
		mA.addAttribute("avaliacoes",avaliacaoDao.getBuscar(produto));
		
		return "layout/verProduto";
	}
	
}