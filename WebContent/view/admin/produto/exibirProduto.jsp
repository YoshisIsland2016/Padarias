<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salvar Produto</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<hr><h3>Cadastrar Produto</h3><hr>
	<form action="salvarProduto" method="post" enctype="multipart/form-data">
		<p>
			Nome: <br />
			<input type="text" name="nome_produto" />
		</p>
		<p>
			Categoria: <br />
			<select name="categoriafk" >
				<option value=""> Selecione </option>
				<c:forEach items="${listaCategoriaProduto}" var="obj">
					<option value="${obj.id_categoria}"> ${obj.nome_categoria} </option>
				</c:forEach>
			</select>
		</p>
		<p>
			Preco: <br />
			<input type="text" name="preco" />
		</p>
		Promocao: <br/>
		<select name="promocao">			
			<option> </option>
			<option value="1">Sim</option>
			<option value="0">Não</option>
		</select>
		<p>
			Imagem: <br />
			<input type="file" name="file" />
			<input type="hidden" name="imagem" />
		</p>
		<p>
			<textarea rows="10" cols="30" name="descricao"></textarea>
		</p>
		<p> 
			<input type="submit" value="Cadastrar">
		</p>
	</form>
</body>
</html>