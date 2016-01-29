<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Produtos</title>
</head>
<body>
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
			<td>${produto.promocao}</td>
			<td>${produto.imagem}</td>
			<td><a href="removerProduto?id=${produto.id_produto}">Remover</a></td>
			<td><a href="mostrarProduto?id=${produto.id_produto}">Editar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>