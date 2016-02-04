package br.com.yoshimachine.padaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.yoshimachine.padaria.model.Produto;
import br.com.yoshimachine.padaria.util.ConnectionFactory;

public class ProdutoDao {
	
	private Connection con;
	
	public ProdutoDao(){
		try{
			this.con = new ConnectionFactory().getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public void getSalvar(Produto produto){
		String sql = "INSERT INTO produtos (nome_produto, categoriafk, preco, promocao, imagem) VALUES (?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, produto.getNome_produto());
			stmt.setInt(2, produto.getCategoriafk());
			stmt.setDouble(3, produto.getPreco());
			stmt.setBoolean(4, produto.isPromocao());
			stmt.setString(5, produto.getImagem());
						
			stmt.execute();
			stmt.close();
			con.close();			
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public List<Produto> getListar(){
		String sql = "SELECT * FROM produtos";
		List<Produto> produtos = new ArrayList<Produto>(); 
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Produto produto = new Produto();
				produto.setId_produto(rs.getInt("id_produto"));
				produto.setNome_produto(rs.getString("nome_produto"));
				produto.setCategoriafk(rs.getInt("categoriafk"));
				produto.setPreco(rs.getFloat("preco"));
				produto.setPromocao(rs.getBoolean("promocao"));
				produto.setImagem(rs.getString("imagem"));
				
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
		return produtos;
	}
	public boolean getAlterar(Produto produto){
		String sql = "UPDATE produtos SET nome_produto=?,categoriafk=?,preco=?,promocao=?,imagem=? WHERE id_produto=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, produto.getNome_produto());
			stmt.setInt(2, produto.getCategoriafk());
			stmt.setFloat(3, produto.getPreco());
			stmt.setBoolean(4, produto.isPromocao());
			stmt.setString(5, produto.getImagem());			
			stmt.setInt(6, produto.getId_produto());
			
			stmt.execute();			
			stmt.close();
			con.close();
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);			
		}		
	}
	public Produto buscaId(int id){
		String sql = "SELECT * FROM produtos WHERE id_produto = ?";
				
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
						
			Produto produto = null;
			
			if(rs.next()){
				produto = montarObjeto(rs);
			}
			rs.close();
			stmt.close();
			con.close();
			return produto;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public boolean getRemover(int id){
		String sql = "DELETE FROM produtos WHERE id_produto=?";
		
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
	public List<Produto> getBuscar(String nome,int categoriafk,boolean promocao){
		String sql = "SELECT * FROM produtos WHERE nome_produto LIKE ? OR categoriafk = ? OR promocao = ?";
		List<Produto> produtos = new ArrayList<Produto>();
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "%"+nome+"%");			
			stmt.setLong(2, categoriafk);
			stmt.setBoolean(3, promocao);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Produto produto = new Produto();
				produto.setId_produto(rs.getInt("id_produto"));
				produto.setNome_produto(rs.getString("nome_produto"));
				produto.setCategoriafk(rs.getInt("categoriafk"));
				produto.setPreco(rs.getFloat("preco"));
				produto.setPromocao(rs.getBoolean("promocao"));
				produto.setImagem(rs.getString("imagem"));
				
				produtos.add(produto);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			return produtos;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	private Produto montarObjeto(ResultSet rs) throws SQLException {

        Produto produto = new Produto();
       
        produto.setId_produto(rs.getInt("id_produto"));
        produto.setNome_produto(rs.getString("nome_produto"));
        produto.setCategoriafk(rs.getInt("categoriafk"));
        produto.setPreco(rs.getFloat("preco"));
        produto.setPromocao(rs.getBoolean("promocao"));
        produto.setImagem(rs.getString("imagem"));
        
        return produto;
    }
}
