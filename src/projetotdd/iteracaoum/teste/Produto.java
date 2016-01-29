package projetotdd.iteracaoum.teste;

public class Produto {
	
	public int cadastro (int nome , int categoria , int preco){
		return nome + categoria + preco;
	}
	public int remover (int id ,int idremov){
		return id - idremov;
	}
}
