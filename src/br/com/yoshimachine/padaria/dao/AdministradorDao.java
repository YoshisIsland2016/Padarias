package br.com.yoshimachine.padaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.yoshimachine.padaria.model.Administrador;
import br.com.yoshimachine.padaria.model.Categoria;
import br.com.yoshimachine.padaria.util.ConnectionFactory;

public class AdministradorDao {
	
	private Connection con;
	
	public AdministradorDao(){
		try{
			this.con = new ConnectionFactory().getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public Administrador buscarUsuario(Administrador usuario) {
		try {
			Administrador administradorConsultado = null;
			PreparedStatement stmt = this.con.prepareStatement("select * from administrador where login = ? and senha = ?");
			
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			
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
        administrador.setNome_categoria(rs.getString("nome_categoria"));
        categoria.setDescricao(rs.getString("descricao"));
        
        return categoria;
    }
}
