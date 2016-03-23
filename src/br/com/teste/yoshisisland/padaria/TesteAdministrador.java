package br.com.teste.yoshisisland.padaria;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import br.com.yoshimachine.padaria.dao.AdministradorDao;
import br.com.yoshimachine.padaria.model.Administrador;

public class TesteAdministrador {
	
	@Test
	public void testeBuscarAdministrador() throws SQLException {
	
		AdministradorDao dao = new AdministradorDao();
		Administrador administrador = new Administrador();
		
		administrador.setLogin("admin");
		administrador.setSenha(null);
		
		dao.buscarAdministrador(administrador);
		dao.close();
		
		Assert.assertEquals(null,administrador);
	}

}
