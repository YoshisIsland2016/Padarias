package br.com.yoshimachine.padaria.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.dao.ProdutoDao;
import br.com.yoshimachine.padaria.model.Produto;
import br.com.yoshimachine.padaria.model.Categoria;
import br.com.yoshimachine.padaria.util.Util;

@Controller
public class ProdutoController {
	
	@RequestMapping("exibirSalvarProduto")
	public String exibirSalvarProduto(Model model)
	{		
		CategoriaDao dao = new CategoriaDao();
		List<Categoria> listaCategoriaProduto = dao.getListar();
		model.addAttribute("listaCategoriaProduto", listaCategoriaProduto);
		
		return "admin/produto/exibirProduto";
	}
	
	@RequestMapping("salvarProduto")
	public String SalvarProduto(Produto produto,@RequestParam("file") MultipartFile imagem,Model model){
		
		if (Util.fazerUploadImagem(imagem)) {			
			produto.setImagem(imagem.getOriginalFilename());
		}
		
		ProdutoDao dao = new ProdutoDao();
		dao.getSalvar(produto);		
		model.addAttribute("msg","Produto Salvo com sucesso!");
		
		return "forward:listarProduto";
	}
	
	@RequestMapping("listarProduto")
	public String ListarProduto(Model model){
		CategoriaDao dao2 = new CategoriaDao();
		List<Categoria> listaCategoriaProduto = dao2.getListar();
		model.addAttribute("listaCategoriaProduto", listaCategoriaProduto);
		
		ProdutoDao dao = new ProdutoDao();
		
		model.addAttribute("produtos",dao.getListar());
		
		return "admin/produto/listarProduto";
	}
	
	@RequestMapping("removerProduto")
	public String removerProduto(int id){		
		ProdutoDao dao = new ProdutoDao();
		dao.getRemover(id);
		
		return "redirect:listarProduto"; 
	}
	
	@RequestMapping("mostrarProduto")
	public String mostrarProduto(int id,Model model){
		CategoriaDao dao2 = new CategoriaDao();
		List<Categoria> listaCategoriaProduto = dao2.getListar();
		model.addAttribute("listaCategoriaProduto", listaCategoriaProduto);
		
		ProdutoDao dao = new ProdutoDao();
		model.addAttribute("produto",dao.buscaId(id));
		
		return "admin/produto/mostrar";
	}
	
	@RequestMapping("alterarProduto")
	public String alterarProduto(Produto produto){
		ProdutoDao dao = new ProdutoDao();
		dao.getAlterar(produto);
		
		return "redirect:listarProduto";
	}
	
	@RequestMapping("buscarProduto")
	public @ResponseBody String buscarProduto(@RequestParam String nome_produto,@RequestParam Integer categoriafk,@RequestParam Boolean promocao,
			HttpServletResponse response){
		
		ProdutoDao dao = new ProdutoDao();
				
		List<Produto> listaProduto = dao.getBuscar(nome_produto,categoriafk,promocao);
		
		StringBuilder st = new StringBuilder();
		
		st.append("<thead>");
		st.append("<tr>");
		st.append("<th>Id</th>");
		st.append("<th>Nome</th>");
		st.append("<th>Categoria</th>");
		st.append("<th>Preço</th>");
		st.append("<th>Promoção</th>");
		st.append("<th>Imagem</th>");
		st.append("<th>Remover</th>");
		st.append("<th>Alterar</th>");
		st.append("</tr>");
		st.append("</thead>");
		st.append("<tbody>");
		for(Produto produto : listaProduto){
			st.append("<tr>");
			st.append("<td>"+produto.getId_produto()+"</td>");
			st.append("<td>"+produto.getNome_produto()+"</td>");
			st.append("<td>"+produto.getCategoriafk().getNome_categoria());
			st.append("<td>R$ "+produto.getPreco()+"</td>");
			
			if(produto.isPromocao())
				st.append("<td>SIM</td>");
			else
				st.append("<td>NAO</td>");
			
			st.append("<td><img style='width:10vw;height:12vh;' src='view/img/"+produto.getImagem()+"' /></td>");			
			//String opcao = "Produto";			
			//st.append("<td><a href='#' onclick='remover(1,'Produto')'>Remover</a></td>");
			st.append("<td><a href='removerProduto?id="+produto.getId_produto()+"'>Remover</a></td>");
			st.append("<td><a href='mostrarProduto?id=" + produto.getId_produto() + "'>Editar</a></td>");
			st.append("</tr");
			st.append("<br/>");
		}
		st.append("</tbody>");
		
		response.setStatus(200);
		return st.toString();
	}	
	
	@RequestMapping("/australoptecos")
	public String exibirPagina(){
		
		return "admin/index";
	}
}