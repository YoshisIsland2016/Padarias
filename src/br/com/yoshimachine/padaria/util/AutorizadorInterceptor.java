package br.com.yoshimachine.padaria.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller)
			throws Exception {

		String uri = request.getRequestURI();
		if (uri.contains("bootstrap") || uri.contains("css") || uri.contains("img") || uri.contains("js")
				|| uri.endsWith("padaria/") || uri.endsWith("efetuarLogin") || uri.contains("exibirLogin") || uri.contains("exibirHome") || uri.contains("exibirProdutos")) {
			return true;
		}

		if (request.getSession().getAttribute("administradorLogado") != null) {
			return true;
		}
		response.sendRedirect("exibirLogin");
		return false;
	}
	
}
