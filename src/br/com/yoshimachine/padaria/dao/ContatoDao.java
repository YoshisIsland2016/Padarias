package br.com.yoshimachine.padaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.yoshimachine.padaria.model.Contato;
import br.com.yoshimachine.padaria.util.ConnectionFactory;

public class ContatoDao {
	
	private Connection con;
	
	public ContatoDao(){
		try{
			this.con = new ConnectionFactory().getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public void getSalvar(Contato contato){
		String sql = "INSERT INTO contatos (email, nome, telefone) VALUES (?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, contato.getEmail());
			stmt.setString(2, contato.getNome());
			stmt.setString(3, contato.getTelefone());
						
			stmt.execute();
			stmt.close();
			con.close();			
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public List<Contato> getListar(){
		String sql = "SELECT * FROM contatos";
		List<Contato> contatos = new ArrayList<Contato>(); 
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Contato contato = new Contato();
				contato.setId_contato(rs.getInt("id_contato"));
				contato.setEmail(rs.getString("email"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));				
				
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
		return contatos;
	}
	public boolean getAlterar(Contato contato){
		String sql = "UPDATE contatos SET email=?,nome=?,telefone=? WHERE id_contato=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, contato.getEmail());
			stmt.setString(2, contato.getNome());
			stmt.setString(3, contato.getTelefone());				
			stmt.setInt(4, contato.getId_contato());
			
			stmt.execute();			
			stmt.close();
			con.close();
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);			
		}		
	}
	public Contato buscaId(int id){
		String sql = "SELECT * FROM contatos WHERE id_contato = ?";
				
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
						
			Contato contato = null;
			
			if(rs.next()){
				contato = montarObjeto(rs);
			}
			rs.close();
			stmt.close();
			con.close();
			return contato;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public boolean getRemover(int id){
		String sql = "DELETE FROM contatos WHERE id_contato=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.execute();
			con.close();
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public List<Contato> getBuscar(String nome,String email){
		String sql = "SELECT * FROM contatos WHERE nome LIKE ? AND email = ?";
		List<Contato> contatos = new ArrayList<Contato>();
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "%"+nome+"%");			
			stmt.setString(2, "%"+email+"%");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Contato contato = new Contato();
				contato.setId_contato(rs.getInt("id_contato"));
				contato.setEmail(rs.getString("email"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));				
				
				contatos.add(contato);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			return contatos;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	private Contato montarObjeto(ResultSet rs) throws SQLException {

        Contato contato = new Contato();
       
        contato.setId_contato(rs.getInt("id_contato"));
        contato.setEmail(rs.getString("email"));
        contato.setNome(rs.getString("nome"));
        contato.setTelefone(rs.getString("telefone"));        
        
        return contato;
    }
	
}
