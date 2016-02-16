<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<script>
function remover(id_produto)
{
	if (confirm("Você tem certeza que deseja remover este item?"))
	{
		location.href="removerProduto?id="+id_produto;	
	}	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Produtos</title>
</head>
<body>
	<c:import url="/view/comum/menu.jsp" />
	<p></p>
	<form action="buscarProduto" >
		<h3>Buscar Produto:</h3><br/>
		Nome:
		<input type="text" name="nome_produto"/>
		<br/>
		Categoria:
		<input type="text" name="categoriafk"/>
		<br/>
		Promocao:
		<input type="text" name="promocao"/>
		<br/>
		<input type="submit" value="Buscar"/>
	</form>
	<table>
		<tr>
		<th>Id</th>
		<th>Nome</th>
		<th>Categoria</th>
		<th>Preco</th>
		<th>Promocao</th>
		<th>Imagem</th>
		<th>Editar</th>
		<th>Remover</th>
		</tr>
		<c:forEach items="${produtos}" var="produto">
		<tr>
			<td>${produto.id_produto}</td>
			<td>${produto.nome_produto}</td>
			<td>${produto.categoriafk}</td>		
			<td>${produto.preco}</td>
			<td>
			<c:choose>
				<c:when test="${produto.promocao}">
					Sim
				</c:when>
				<c:otherwise>
					Não
				</c:otherwise>
			</c:choose>
			</td>
			<td>${produto.imagem}</td>
			<td><a href="#" onclick="remover(${produto.id_produto})">Remover</a></td>
			<td><a href="mostrarProduto?id=${produto.id_produto}">Editar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>