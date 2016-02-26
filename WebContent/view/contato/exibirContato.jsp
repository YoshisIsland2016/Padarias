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
		<input type="text" name="email" />
		</p>
		<p>
		Nome: <br />
		<input type="text" name="nome" />
		</p>
		<p>
		Mensagem: <br/>
		<textarea rows="10" cols="30" name="mensagem"></textarea>		 
		</p>
		<p> <input type="submit" value="Cadastrar"></p>
	</form>
</body>
</html>