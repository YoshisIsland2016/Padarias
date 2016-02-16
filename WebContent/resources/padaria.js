function remover(id_produto){
	
	if(confirm("Deseja remover o produto?"))
	{
		location.href="removerProduto?id="+id_produto;		
	}
	
}