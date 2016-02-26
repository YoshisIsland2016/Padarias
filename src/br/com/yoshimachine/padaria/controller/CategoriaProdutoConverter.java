package br.com.yoshimachine.padaria.controller;

import org.springframework.core.convert.converter.Converter;

import br.com.yoshimachine.padaria.dao.CategoriaDao;
import br.com.yoshimachine.padaria.model.Categoria;

public class CategoriaProdutoConverter implements Converter<String,Categoria> {
	public Categoria convert(String id) {
		CategoriaDao dao = new CategoriaDao();
		
		return dao.buscaId(Integer.valueOf(id));
	}
}