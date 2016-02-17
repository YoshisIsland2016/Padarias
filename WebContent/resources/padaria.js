function remover(id, opcao)
{
	alert(opcao);
	if (confirm("tem certeza que deseja remover este item?"))
	{
		location.href="remover"+opcao+"?id="+id;	
	}	
}