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
		<th>Email</th>
		<th>Nome</th>
		<th>Remover</th>
		<th>Visualizar</th>
		</tr>
		<c:forEach items="${contatos}" var="contato">
		<tr>
			<td>${contato.id_contato}</td>
			<td>${contato.email}</td>
			<td>${contato.nome}</td>					
			<td><a href="#" onclick="remover(${contato.id_contato},'Contato')">Remover</a></td>
			<td><a href="mostrarContato?id=${contato.id_contato}">Editar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>