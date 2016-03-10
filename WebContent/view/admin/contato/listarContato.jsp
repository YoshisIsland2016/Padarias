<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<script type="text/javascript" src="<c:url value="/resources/padaria.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Contatos</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<table>
		<tr>
		<th>Id</th>
		<th>Nome</th>
		<th>Email</th>
		<th>Nota</th>
		<th>Editar</th>
		<th>Visualizar</th>
		</tr>
		<c:forEach items="${avaliacaoes}" var="avaliacao">
		<tr>
			<td>${avaliacao.id_avaliacao}</td>
			<td>${avaliacao.nome}</td>
			<td>${avaliacao.email}</td>
			<td>${avaliacao.nota }</td>					
			<td><a href="#" onclick="remover(${avaliacao.id_avaliacao},'Avaliacao')">Remover</a></td>
			<td><a href="mostrarAvaliacao?id=${avaliacao.id_avaliacao}">Visualizar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>