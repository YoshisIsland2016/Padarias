<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<hr><h3>Cadastrar Categoria</h3><hr>
	<form action="salvarCategoria" method="post">
		<p>
		Nome: <br />
		<input type="text" name="nome_categoria" />
		</p>
		<p>
		Descricao: <br />
		<input type="text" name="descricao" />
		</p>
		<p>		
		<p> <input type="submit" value="Cadastrar"> </p>
	</form>
</body>
</html>