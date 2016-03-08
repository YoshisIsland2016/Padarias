<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<script src="resources/jquery-2.1.4.js"></script>
<script type="text/javascript" src="resources/padaria.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	function evento(){
		var nome_produto = $('#nome_produto').val();
		var categoriafk = $('#categoriafk').val();
		var promocao = $('#promocao').val();
		
		if(promocao == '1')
			promocao = true;
		else
			promocao = false;
		
		$.post("buscarProduto",{'nome_produto' : nome_produto, 'categoriafk' : categoriafk, 'promocao' : promocao},
		function(dados) {
			$('#tabela').html(dados);
		});
	};
	$("#nome_produto").keyup(function(){
		evento();
	});
	$("#categoriafk").change(function(){
		evento();
	});
	$("#promocao").change(function(){
		evento();
	});
	
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Produtos</title>
</head>
<body>
	<c:import url="/view/admin/comum/menu.jsp" />
	<p></p>
	
		<h3>Buscar Produto:</h3><br/>
		Nome:
		<input type="text" id="nome_produto" name="nome_produto"/>
		<p>
		
			Categoria: 
			<select id="categoriafk" name="categoriafk" >
				<option> </option>
				<c:forEach items="${listaCategoriaProduto}" var="obj">
					<option value="${obj.id_categoria}"> ${obj.nome_categoria} </option>
				</c:forEach>
			</select>
		</p>
		Promocao:
		<select id="promocao" name="promocao">			
			<option> </option>
			<option value="1">Sim</option>
		</select>
		<br/>


	<table id="tabela" style="background-color:#1C9DDF;">
		<tr style="background-color: #E6E6E6; font-weight: bold;">
		<th>Id</th>
		<th>Nome</th>
		<th>Categoria</th>
		<th>Preco</th>
		<th>Promocao</th>
		<th>Imagem</th>		
		<th>Editar</th>
		<th>Remover</th>
		</tr>
		<c:forEach items="${produtos}" var="produto">
		<tr>
			<td>${produto.id_produto}</td>
			<td>${produto.nome_produto}</td>
			<td>${produto.categoriafk.nome_categoria}</td>	
			<td>R$ ${produto.preco}</td>
			<td>
			<c:choose>
				<c:when test="${produto.promocao}">
					Sim
				</c:when>
				<c:otherwise>
					Não
				</c:otherwise>
			</c:choose>
			</td>
			<td><img src="view/img/${produto.imagem }" /></td>
			<td><a href="#" onclick="remover(${produto.id_produto},'Produto')">Remover</a></td>
			<td><a href="mostrarProduto?id=${produto.id_produto}">Editar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>