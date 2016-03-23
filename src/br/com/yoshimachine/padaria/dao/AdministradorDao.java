package br.com.yoshimachine.padaria.dao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.yoshimachine.padaria.model.Administrador;
import br.com.yoshimachine.padaria.util.ConnectionFactory;
import br.com.yoshimachine.padaria.util.Util;

public class AdministradorDao {
	
	private Connection con;
	
	public AdministradorDao(){
		try{
			this.con = new ConnectionFactory().getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public Administrador buscarAdministrador(Administrador usuario) {
		try {
			Administrador administradorConsultado = null;
			PreparedStatement stmt = this.con.prepareStatement("select * from administrador where login = ? and senha = ?");
			
			
			stmt.setString(1, usuario.getLogin());
			
			String senhaCriptografada = null;
			
			try {
				senhaCriptografada = Util.sha1(usuario.getSenha());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			stmt.setString(2, senhaCriptografada);
			
			ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			administradorConsultado = montarObjeto(rs);
		}
		
		rs.close();
		stmt.close();
		return administradorConsultado;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private Administrador montarObjeto(ResultSet rs) throws SQLException {

        Administrador administrador = new Administrador();
       
        administrador.setId_administrador(rs.getInt("id_administrador"));
        administrador.setLogin(rs.getString("login"));
        administrador.setSenha(rs.getString("senha"));
        
        return administrador;
    }
	public void close() throws SQLException {
		con.close();
	}
}
