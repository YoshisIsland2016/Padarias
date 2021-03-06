package br.com.yoshimachine.padaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.model.Categoria;

@Controller
public class CategoriaController {
	
	@RequestMapping("exibirSalvarCategoria")
	public String exibirSalvarCategoria()
	{		
		return "admin/categoria/exibirCategoria";
	}
	@RequestMapping("salvarCategoria")
	public String SalvarCategoria(Categoria categoria,Model model){
		
		CategoriaDao dao = new CategoriaDao();
		dao.getSalvar(categoria);
		model.addAttribute("msg","Item Salvo com Sucesso!");
		
		return "forward:listarCategoria";
	}
	@RequestMapping("listarCategoria")
	public String ListarCategoria(Model model){
		CategoriaDao dao = new CategoriaDao();
		
		model.addAttribute("categorias",dao.getListar());
		
		return "admin/categoria/listarCategoria";
	}
	@RequestMapping("removerCategoria")
	public String removerCategoria(int id){
		CategoriaDao dao = new CategoriaDao();
		dao.getRemover(id);
		
		return "forward:listarCategoria"; 
	}
	@RequestMapping("mostrarCategoria")
	public String mostrarCategoria(int id,Model model){
		CategoriaDao dao = new CategoriaDao();
		model.addAttribute("categoria",dao.buscaId(id));
		
		return "admin/categoria/mostrar";
	}
	@RequestMapping("alterarCategoria")
	public String alterarCategoria(Categoria categoria){
		CategoriaDao dao = new CategoriaDao();
		dao.getAlterar(categoria);
		
		return "forward:listarCategoria";
	}
	
}
