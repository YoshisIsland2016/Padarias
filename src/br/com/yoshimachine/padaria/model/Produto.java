package br.com.yoshimachine.padaria.model;

public class Produto {
	
	private int id_produto;
	private String nome_produto;
	private int categoriafk;
	private double preco;
	private boolean promocao;
	private String imagem;
	
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public int getCategoriafk() {
		return categoriafk;
	}
	public void setCategoriafk(int categoriafk) {
		this.categoriafk = categoriafk;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
