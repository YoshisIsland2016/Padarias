<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../../../menu.jsp" />
	<h3>Alterar Produto - ${produto.id_produto}</h3>
	<form action="alterarProduto" method="post">
		<input type="hidden" name="id_produto" value="${produto.id_produto}" />
		Nome:<br />		
		<input type="text" name="nome_produto" value="${produto.nome_produto}"/>
		<br />Categoria:<br />
		<input type="text" name="categoriafk" value="${produto.categoriafk}"/>
		<br />Preco:<br />
		<input type="text" name="preco" value="${produto.preco}"/>
		<br />Promocao:<br />
		<input type="text" name="promocao" value="${produto.promocao }" />
		<br />Imagem:<br />
		<input type="text" name="imagem" value="${produto.imagem}"/>
		<br /><br />
		<input type="submit" value="Alterar"/>
	</form>
</body>
</html>