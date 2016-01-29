<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Contatos</title>
</head>
<body>
	<table>
		<tr>
		<th>Id</th>
		<th>Email</th>
		<th>Nome</th>
		<th>Telefone</th>		
		<th>Editar</th>
		<th>Remover</th>
		</tr>
		<c:forEach items="${contatos}" var="contato">
		<tr>
			<td>${contato.id_contato}</td>
			<td>${contato.email}</td>
			<td>${contato.nome}</td>
			<td>${contato.telefone}</td>					
			<td><a href="removerContato?id=${contato.id_contato}">Remover</a></td>
			<td><a href="mostrarContato?id=${contato.id_contato}">Editar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>