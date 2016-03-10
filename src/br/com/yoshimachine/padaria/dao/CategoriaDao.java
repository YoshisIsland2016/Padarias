package br.com.yoshimachine.padaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.yoshimachine.padaria.model.Categoria;
import br.com.yoshimachine.padaria.util.ConnectionFactory;

public class CategoriaDao {
	
	private Connection con;
	
	public CategoriaDao(){
		try{
			this.con = new ConnectionFactory().getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public void getSalvar(Categoria categoria){
		String sql = "INSERT INTO categorias (nome_categoria, descricao) VALUES (?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, categoria.getNome_categoria());
			stmt.setString(2, categoria.getDescricao());
			
			stmt.execute();
			stmt.close();
						
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public List<Categoria> getListar(){
		String sql = "SELECT * FROM categorias";
		List<Categoria> categorias = new ArrayList<Categoria>(); 
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Categoria categoria = new Categoria();
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNome_categoria(rs.getString("nome_categoria"));
				categoria.setDescricao(rs.getString("descricao"));
				
				categorias.add(categoria);
			}
			rs.close();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
		return categorias;
	}
	public boolean getAlterar(Categoria categoria){
		String sql = "UPDATE categorias SET nome_categoria=?,descricao=? WHERE id_categoria=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, categoria.getNome_categoria());
			stmt.setString(2, categoria.getDescricao());					
			stmt.setInt(3, categoria.getId_categoria());
			
			stmt.execute();			
			stmt.close();
			
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);			
		}		
	}
	public Categoria buscaId(int id){
		String sql = "SELECT * FROM categorias WHERE id_categoria = ?";
				
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
						
			Categoria categoria = null;
			
			if(rs.next()){
				categoria = montarObjeto(rs);
			}
			rs.close();
			stmt.close();
			
			return categoria;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public boolean getRemover(int id){
		String sql = "DELETE FROM categorias WHERE id_categoria=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.execute();
			
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public List<Categoria> getBuscar(String nome,String descricao){
		String sql = "SELECT * FROM categorias WHERE nome_categoria LIKE ? AND descricao LIKE ?";
		List<Categoria> categorias = new ArrayList<Categoria>();
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "%"+nome+"%");
			stmt.setString(2, "%"+descricao+"%");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Categoria categoria = new Categoria();
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNome_categoria(rs.getString("nome_categoria"));
				categoria.setDescricao(rs.getString("descricao"));
								
				categorias.add(categoria);
			}
			
			rs.close();
			stmt.close();
			
			
			return categorias;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	private Categoria montarObjeto(ResultSet rs) throws SQLException {

        Categoria categoria = new Categoria();
       
        categoria.setId_categoria(rs.getInt("id_categoria"));
        categoria.setNome_categoria(rs.getString("nome_categoria"));
        categoria.setDescricao(rs.getString("descricao"));
        
        return categoria;
    }
	public void close() throws SQLException{
		con.close();
	}
}
