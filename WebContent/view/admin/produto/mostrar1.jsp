<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<h3>Alterar Produto - ${produto.id_produto}</h3>
	<form action="alterarProduto" method="post">
		<input type="hidden" name="id_produto" value="${produto.id_produto}" />
		<p>
			Nome: <br />
			<input type="text" name="nome_produto" value="${produto.nome_produto}" />
		</p>
		<p>
			Categoria: <br />
			<select name="categoriafk" >
				<option value=""> Selecione </option>
				<c:forEach items="${listaCategoriaProduto}" var="obj">
					<option value="${obj.id_categoria}" <c:if test="${obj.id_categoria eq produto.categoriafk.id_categoria}">selected="selected"</c:if>> ${obj.nome_categoria} </option>
				</c:forEach> 
			</select>
		</p>
		<p>
			Preco: <br />
			<input type="text" name="preco" value="${produto.preco}"/>
		</p>
		Promocao: <br/>
		<select name="promocao">			
			<c:choose>
				<c:when test="${produto.promocao}">
					<option value="1">Sim</option>
					<option value="0">Não</option>
				</c:when>
				<c:otherwise>
					<option value="0">Não</option>
					<option value="1">Sim</option>
				</c:otherwise>
			</c:choose>
		</select>
		<p>
			Imagem: <br />
			<img src="/view/produto/img/${produto.imagem}" />
		</p>
		<input type="hidden" name="imagem" value="${produto.imagem}"/>
		<p>
			<textarea rows="10" cols="30" name="descricao">${produto.descricao }</textarea>
		</p>
		<p> 
			<input type="submit" value="Alterar">
		</p>		
	</form>
</body>
</html>