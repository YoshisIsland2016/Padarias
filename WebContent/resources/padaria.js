function remover(id, opcao)
{
	//Opcao:
	
	//Produto ou Categoria ou Contato
	if (confirm("tem certeza que deseja remover este item?"))
	{
		location.href="remover"+opcao+"?id="+id;	
	}	
}