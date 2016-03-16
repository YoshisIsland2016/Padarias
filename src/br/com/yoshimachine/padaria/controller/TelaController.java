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
public class TelaController {
	
	@RequestMapping("exibirHome")
	public String exibirHome()
	{		
		return "index";
	}
	@RequestMapping("exibirProdutos")
	public String exibirProdutos(){
		return "produtos";
	}
	
}