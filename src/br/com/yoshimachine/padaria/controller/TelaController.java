package br.com.yoshimachine.padaria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Produto;
import br.com.yoshimachine.padaria.model.Categoria;

@Controller
public class TelaController {
	
	@RequestMapping("exibirHome")
	public String exibirHome()
	{		
		return "index";
	}
	@RequestMapping("exibirProdutos")
	public String exibirProdutos(Model m1,Model m2){
		CategoriaDao dao2 = new CategoriaDao();		
		m1.addAttribute("categorias", dao2.getListar());
		
		ProdutoDao dao = new ProdutoDao();
		
		m2.addAttribute("produtos",dao.getListar());
		
		return "produtos";
	}
	@RequestMapping("verCategoria")
	public String verCategoria(int id,Model model){
		ProdutoDao dao = new ProdutoDao();
		List<Produto> listaCategoriaProduto = dao.getBuscar("", id, false);
		model.addAttribute("produtos", listaCategoriaProduto);
		
		return "produtos";
	}
	
}