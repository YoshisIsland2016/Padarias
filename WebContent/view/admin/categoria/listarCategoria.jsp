<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<script type="text/javascript" src="<c:url value="/resources/padaria.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Categorias</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<table>
		<tr>
		<th>Id</th>
		<th>Nome</th>
		<th>Descricao</th>		
		<th>Editar</th>
		<th>Remover</th>
		</tr>
		<c:forEach items="${categorias}" var="categoria">
		<tr>
			<td>${categoria.id_categoria}</td>
			<td>${categoria.nome_categoria}</td>
			<td>${categoria.descricao}</td>					
			<td><a href="#" onclick="remover(${categoria.id_categoria},'Categoria')">Remover</a></td>
			<td><a href="mostrarCategoria?id=${categoria.id_categoria}">Editar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>