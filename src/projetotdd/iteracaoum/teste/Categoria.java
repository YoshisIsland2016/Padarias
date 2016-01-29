package projetotdd.iteracaoum.teste;

public class Categoria {
	
	public String Salvar(String Nome , String Descricao){
		
		return "Categoria Salva";
	}
	public String Listar(String Nome, String Descricao){
		
		return "10, Nome, Descricao";
	}
	public String Alterar (String Nome , String Descricao){
		
		return "20 , Nome ,Descricao";
	}
	public int Buscar (int id){
		return id;
	}
	public int Remover (int id){
		return id;
	}

}
