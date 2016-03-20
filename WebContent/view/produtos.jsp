<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="description" content="Padaria Santa Maria" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Padaria Santa Maria</title>
<link rel="stylesheet" href="view/css/bootstrap.css">
<link rel="stylesheet" href="view/css/bootstrap-responsive.css">
<link rel="stylesheet" href="view/css/style.css">
<script src="view/js/jquery-1.11.3.min"></script>
<script src="view/js/bootstrap.min.js"></script>
<script>
function avaliacao_mensagem(msg)
{
	alert(msg);	
}
</script>
</head>
<body>
	<div id="container" class="container-fluid">
		<div class="row-fluid">
			<c:import url="menu.jsp" />			
			<div id="parte2" class="span10">
				<div style="color:red;font-weight: bold"><h4>${msg}</h4></div>
				<center>
					<h1>Produtos</h1>
				</center>
				<div id="produtos">
					<c:forEach items="${produtos}" var="produto">
						<div class="produto btn-success">
							${produto.nome_produto}:<br /> 
							<a href="verProduto?id_produto=${produto.id_produto}" ><img src="view/img/produtos/${produto.imagem}" /> </a>Preço: R$ ${produto.preco} 
						</div>
					</c:forEach>
				</div>
				<div id="categorias" class="btn-info">
					<h3>Categorias</h3>					
					<br/>
					<ul>
						<c:forEach items="${categorias}" var="categoria">
							<li><a href="verCategoria?id=${categoria.id_categoria }" >${categoria.nome_categoria}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>

</body>
</html>