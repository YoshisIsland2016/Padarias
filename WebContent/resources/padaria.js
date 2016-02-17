function remover(id, opcao)
{
	if (confirm("tem certeza que deseja remover este item?"))
	{
		location.href="remover"+opcao+"?id="+id;	
	}	
}