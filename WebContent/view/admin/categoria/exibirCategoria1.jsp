<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<hr><h3>Cadastrar Categoria</h3><hr>
	<form action="salvarCategoria" method="post">
		<p>
		Nome: <br />
		<input type="text" required="required" name="nome_categoria" />
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