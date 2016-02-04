package br.com.yoshimachine.padaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Produto;

@Controller
public class ProdutoController {
	@RequestMapping("salvarProduto")
	public String SalvarProduto(Produto produto){
		
		ProdutoDao dao = new ProdutoDao();
		dao.getSalvar(produto);
		return "produto/salvarProdutoSucesso";
	}
	@RequestMapping("listarProduto")
	public String ListarProduto(Model model){
		ProdutoDao dao = new ProdutoDao();
		
		model.addAttribute("produtos",dao.getListar());
		
		return "produto/listarProduto";
	}
	@RequestMapping("removerProduto")
	public String removerProduto(int id){
		ProdutoDao dao = new ProdutoDao();
		dao.getRemover(id);
		
		return "redirect:listarProduto"; 
	}
	@RequestMapping("mostrarProduto")
	public String mostrarProduto(int id,Model model){
		ProdutoDao dao = new ProdutoDao();
		model.addAttribute("produto",dao.buscaId(id));
		
		return "produto/mostrar";
	}
	@RequestMapping("alterarProduto")
	public String alterarProduto(Produto produto){
		ProdutoDao dao = new ProdutoDao();
		dao.getAlterar(produto);
		
		return "redirect:listarProduto";
	}
	@RequestMapping("buscarProduto")
	public String buscarProduto(Produto produto,Model model){
		ProdutoDao dao = new ProdutoDao();
				
		model.addAttribute("produtos",dao.getBuscar(produto.getNome_produto(), produto.getCategoriafk(), produto.isPromocao()));
		
		return "produto/listarProduto";
	}
}
