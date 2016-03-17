package br.com.yoshimachine.padaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.yoshimachine.padaria.model.Avaliacao;
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
	/*
	public boolean getAlterar(Produto produto){
		String sql = "UPDATE produtos SET nome_produto=?,categoriafk=?,preco=?,promocao=?,imagem=?,descricao=? WHERE id_produto=?";
		
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, produto.getNome_produto());
			stmt.setLong(2, produto.getCategoriafk().getId_categoria());
			stmt.setDouble(3, produto.getPreco());
			stmt.setBoolean(4, produto.isPromocao());
			stmt.setString(5, produto.getImagem());		
			stmt.setString(6, produto.getDescricao());
			stmt.setInt(7, produto.getId_produto());
			
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
	public List<Produto> getBuscar(String nome_produto,Integer categoriafk, Boolean promocao){
		//String sql = "SELECT * FROM produtos WHERE nome_produto LIKE ? AND categorifk = ? AND promocao = ?";
		
		try{
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = null;
			
			if(!nome_produto.equals("") && categoriafk == null && promocao == false)
			{
				String sql = "SELECT * FROM produtos WHERE nome_produto LIKE ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setString(1, "%"+nome_produto+"%");
			}
			else if(nome_produto.equals("") && categoriafk != null && promocao == false)
			{
				String sql = "SELECT * FROM produtos WHERE categoriafk = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setInt(1, categoriafk);
			}
			else if(nome_produto.equals("") && categoriafk == null && promocao != false)
			{
				String sql = "SELECT * FROM produtos WHERE promocao = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setBoolean(1, promocao);
			}
			else if(nome_produto.equals("") && categoriafk != null && promocao != false)
			{
				String sql = "SELECT * FROM produtos WHERE categoriafk = ? AND promocao = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setInt(1, categoriafk);
				stmt.setBoolean(2, promocao);
			}
			else if(!nome_produto.equals("") && categoriafk != null && promocao == false)
			{
				String sql = "SELECT * FROM produtos WHERE nome_produto LIKE ? AND categoriafk = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setString(1, "%"+nome_produto+"%");
				stmt.setInt(2, categoriafk);				
			}
			else if(!nome_produto.equals("") && categoriafk == null && promocao != false)
			{
				String sql = "SELECT * FROM produtos WHERE nome_produto LIKE ? AND promocao = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setString(1, "%"+nome_produto+"%");
				stmt.setBoolean(2,promocao);
			}
			else if(nome_produto.equals("") && categoriafk != null && promocao != false)
			{
				String sql = "SELECT * FROM produtos WHERE categoriafk = ? AND promocao = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setInt(1, categoriafk);
				stmt.setBoolean(2, promocao);
			}
			else if(!nome_produto.equals("") && categoriafk != null && promocao != false)
			{
				String sql = "SELECT * FROM produtos WHERE nome_produto LIKE ? AND categoriafk = ? AND promocao = ? ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
				stmt.setString(1, "%"+nome_produto+"%");
				stmt.setInt(2, categoriafk);
				stmt.setBoolean(3, promocao);
			}			
			else
			{
				String sql = "SELECT * FROM produtos ORDER BY categoriafk";
				
				stmt = con.prepareStatement(sql);
			}
			
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
