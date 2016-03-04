<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/view/comum/menu.jsp" />
	<hr><h3>Cadastrar Contatos</h3><hr>
	<form action="salvarContato" method="post">
		<p>
		Email: <br />
		<input type="text" name="nome" />
		</p>
		<p>
		Nome: <br />
		<input type="text" name="email" />
		</p>
		
		<p>
		<select name="nota">
			<option value="0"></option>
			<option value="1"></option>
			<option value="2"></option>
			<option value="3"></option>
			<option value="4"></option>
			<option value="5"></option>			
		</select>
		</p>
		<input type="hidden" name="permissao" value="0" />
		
		<p> <input type="submit" value="Cadastrar"></p>
	</form>
</body>
</html>