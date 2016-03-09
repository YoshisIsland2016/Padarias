<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	Informe seu login e senha para acessar o sistema.
	</p>
	<div style="color: red;" align="center"> <h3> ${msg} </h3> </div>
		
	<form action="efetuarLogin" method="post">
		Login: <br />
		<input type="text" name="login" required="required" />
		<br /> <br />
		Senha: <br />
		<input type="password" name="senha" required="required" />
		<br /><br />
		<input type="submit" value="Entrar" />
	</form>
</body>
</html>