<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<h3>Alterar Contato - ${contato.id_contato}</h3>
	<form action="alterarContato" method="post">
		<input type="hidden" name="id_contato" value="${contato.id_contato}" />
		Email:<br />		
		<input type="text" name="email" value="${contato.email}"/>
		<br />Nome:<br />
		<input type="text" name="nome" value="${contato.nome}"/>
		<br />
		Mensagem: <br/>
		<p>			
			<textarea rows="10" cols="30" name="mensagem">${contato.mensagem}</textarea>		 
		</p>
		
		<a class="btn btn-success" href="listarContato">Voltar</a>
	</form>	
</body>
</html>