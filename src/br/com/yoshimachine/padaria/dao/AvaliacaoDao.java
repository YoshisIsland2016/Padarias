package br.com.yoshimachine.padaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.yoshimachine.padaria.model.Avaliacao;
import br.com.yoshimachine.padaria.model.Produto;
import br.com.yoshimachine.padaria.util.ConnectionFactory;

public class AvaliacaoDao {
	
	private Connection con;
	
	public AvaliacaoDao(){
		try{
			this.con = new ConnectionFactory().getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public void getSalvar(Avaliacao avaliacao){
		String sql = "INSERT INTO avaliacao (produtoid, nome, email, nota, permissao,mensagem) VALUES (?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, avaliacao.getProdutoid());
			stmt.setString(2,avaliacao.getNome());
			stmt.setString(3, avaliacao.getEmail());
			stmt.setInt(4, avaliacao.getNota());
			stmt.setBoolean(5, avaliacao.isPermissao());
			stmt.setString(6, avaliacao.getMensagem());	
			
			stmt.execute();
			stmt.close();
			con.close();			
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public List<Avaliacao> getListar(){
		String sql = "SELECT * FROM avaliacao";
		List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>(); 
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
						
			while(rs.next()){
				Avaliacao avaliacao = new Avaliacao();
				avaliacao = montarObjeto(rs);
				
				avaliacoes.add(avaliacao);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
		return avaliacoes;
	}
	public Avaliacao buscaId(Avaliacao avaliacao_preenchido){
		String sql = "SELECT * FROM avaliacao WHERE id = ?";
				
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, avaliacao_preenchido.getId());
			
			ResultSet rs = stmt.executeQuery();
						
			Avaliacao avaliacao = null;
			
			if(rs.next()){
				avaliacao = montarObjeto(rs);
			}
			rs.close();
			stmt.close();
			con.close();
			return avaliacao;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public boolean getAlterar(Avaliacao avaliacao){
		String sql = "UPDATE avaliacao SET permissao = ? WHERE id=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setBoolean(1, avaliacao.isPermissao());
			stmt.setInt(2, avaliacao.getId());
			
			stmt.execute();			
			stmt.close();
			con.close();
			return true;
		}catch(SQLException e){
			throw new RuntimeException(e);			
		}		
	}
	public List<Avaliacao> getBuscar(Produto produto){
		String sql = "SELECT * FROM avaliacao WHERE produtoid = ?";
		List<Avaliacao> produtos = new ArrayList<Avaliacao>();
		
		try{
			PreparedStatement stmt = null;

			stmt = con.prepareStatement(sql);
			stmt.setInt(1, produto.getId_produto());
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				produtos.add(montarObjeto(rs));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
			return produtos;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	/*
	
	
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
	
	*/
	private Avaliacao montarObjeto(ResultSet rs) throws SQLException {

        Avaliacao avaliacao = new Avaliacao();
       
        avaliacao.setId(rs.getInt("id"));
        avaliacao.setProdutoid(rs.getInt("produtoid"));  
        avaliacao.setNome(rs.getString("nome"));
        avaliacao.setEmail(rs.getString("email"));
        avaliacao.setNota(rs.getInt("nota"));
        avaliacao.setPermissao(rs.getBoolean("permissao"));
        avaliacao.setMensagem(rs.getString("mensagem"));
                
        return avaliacao;
    }
	
}
