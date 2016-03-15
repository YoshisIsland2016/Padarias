package br.com.yoshimachine.padaria.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.yoshimachine.padaria.dao.AdministradorDao;
import br.com.yoshimachine.padaria.model.Administrador;

@Controller
public class AdministradorController {
	
	@RequestMapping("exibirLogin")
	public String exibirLogin(){
		
		return "login";
	}
	@RequestMapping("efetuarLogin")
	public String efetuarLogin(Administrador administrador, HttpSession session,Model model)
	{
		AdministradorDao dao = new AdministradorDao();
		Administrador administradorLogado = dao.buscarAdministrador(administrador);
		
		if(administradorLogado != null)
		{
			session.setAttribute("administradorLogado", administradorLogado);
			//return "admin/index";
			return "forward:exibirIndex";
		}
		model.addAttribute("msg", "Não foi encontrado um usuário com o login e senha informados.");
		
		return "forward:exibirLogin";
	}
	@RequestMapping("exibirIndex")
	public String exibirIndex()
	{
		return "admin/index";
	}
	@RequestMapping("logout")
	public String logout(HttpSession session){
		
		session.invalidate();
		return "login";
	}
}
