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
	<h3>Alterar Contato - ${contato.id_contato}</h3>
	<form action="alterarContato" method="post">
		<input type="hidden" name="id_avaliacao" value="${avaliacao.id_avaliacao}" />
		Nome:<br />		
		<input type="text" name="email" value="${avaliacao.nome}"/>
		<br />Email:<br />
		<input type="text" name="nome" value="${avaliacao.email}"/>
		<br />Nota:<br />
		<select name="promocao">			
			<option> </option>
			<option value="1">Muito Ruim</option>
			<option value="2">Ruim</option>
			<option value="3">Bom</option>
			<option value="4">Ótimo</option>
			<option value="5">Excelente</option>
		</select>
		<br />Permitido<br />
		
		<input type="submit" value="Alterar"/>
	</form>
</body>
</html>