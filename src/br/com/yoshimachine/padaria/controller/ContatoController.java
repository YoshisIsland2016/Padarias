package br.com.yoshimachine.padaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yoshimachine.padaria.dao.ContatoDao;
import br.com.yoshimachine.padaria.model.Contato;

@Controller
public class ContatoController {
	
	@RequestMapping("exibirSalvarContato")
	public String exibirSalvarContato()
	{		
		return "contato/exibirContato";
	}
	@RequestMapping("salvarContato")
	public String SalvarProduto(Contato contato){
		
		ContatoDao dao = new ContatoDao();
		dao.getSalvar(contato);
		return "contato/salvarContatoSucesso";
	}
	@RequestMapping("listarContato")
	public String ListarProduto(Model model){
		ContatoDao dao = new ContatoDao();
		
		model.addAttribute("contatos",dao.getListar());
		
		return "contato/listarContato";
	}
	@RequestMapping("removerContato")
	public String removerProduto(int id){
		ContatoDao dao = new ContatoDao();
		dao.getRemover(id);
		
		return "redirect:listarContato"; 
	}
	@RequestMapping("mostrarContato")
	public String mostrarProduto(int id,Model model){
		ContatoDao dao = new ContatoDao();
		model.addAttribute("contato",dao.buscaId(id));
		
		return "contato/mostrar";
	}
	@RequestMapping("alterarContato")
	public String alterarProduto(Contato contato){
		ContatoDao dao = new ContatoDao();
		dao.getAlterar(contato);
		
		return "redirect:listarContato";
	}
}
