package br.com.yoshimachine.padaria.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Produto;
import br.com.yoshimachine.padaria.util.Util;

@Controller
public class ProdutoController {
	
	@RequestMapping("exibirSalvarProduto")
	
	public String exibirSalvarProduto()
	{		
		return "produto/exibirProduto";
	}
	
	@RequestMapping("salvarProduto")
	
	public String SalvarProduto(Produto produto,@RequestParam("file") MultipartFile imagem){
		
		if (Util.fazerUploadImagem(imagem)) {
			produto.setImagem(Calendar.getInstance().getTime() + "_" + imagem.getOriginalFilename());
		}
		
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
				
		model.addAttribute("produtos",dao.getBuscar(produto));
		
		return "produto/listarProduto";
	}
}
