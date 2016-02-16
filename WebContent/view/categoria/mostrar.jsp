<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/view/comum/menu.jsp" />
	<h3>Alterar tarefa - ${categoria.id_categoria}</h3>
	<form action="alterarCategoria" method="post">
		<input type="hidden" name="id_categoria" value="${categoria.id_categoria}" />
		Nome:<br />		
		<input type="text" name="nome_categoria" value="${categoria.nome_categoria}"/>
		<br />Descricao:<br />
		<input type="text" name="descricao" value="${categoria.descricao }"/><br />
		<input type="submit" value="Alterar"/>
	</form>
</body>
</html>