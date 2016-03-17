<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Padaria Santa Maria" />
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<title>Padaria Santa Maria</title>
	<link rel="stylesheet" href="view/css/bootstrap.css">
	<link rel="stylesheet" href="view/css/bootstrap-responsive.css">
	<link rel="stylesheet" href="view/css/style.css" >
	<script src="view/js/jquery-1.11.3.min"></script>
	<script src="view/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="container" class="container-fluid">
		<div class="row-fluid">
			<c:import url="menu.jsp" />
			<div id="parte2" class="span10">
				<div id="verProduto" class="span12">		
					<div class="span7 imagemProduto">
						<h1>${produto.nome_produto}</h1>
						<br/>
							<img src="view/img/produtos/${produto.imagem}" />
						<br />
					</div>
					<div class="span5 info">
						<h2>Descri��o</h2>
						<br/>
						${produto.descricao}
						<br/>
						<h3>R$ ${produto.preco}</h3>
					</div>				
				</div>
				<div id="avaliacao" class="span12">
					<div id="avaliar" class="span5">
						<h2>Deixe sua Avalia��o</h2>
						<form action="salvarAvaliacao">
							<!-- Hiddens -->
							<input type="hidden" name="produtoid" value="${produto.id_produto}" />
							<input type="hidden" name="permissao" value="true" />
							<input type="hidden" name="id_produto" value="${produto.id_produto }" />
							<!-- END Hiddens -->
							<p>
							Nome:
							<input type="text" name="nome" /><br/>
							</p>
							<p>
							Email:
							<input type="text" name="email" />
							</p>
							<p>	
							Nota:
							<select name="nota">
								<option value="1">Muito Ruim</option>
								<option value="2">Ruim</option>
								<option value="3">Razo�vel</option>
								<option value="4">Bom</option>
								<option value="5">Muito Bom</option>
							</select>
							</p>
							<p>
							Descri��o:<br/>
							<textarea style="width: 347px; height: 159px;" name="mensagem" id="mensagem" cols="0" rows="0"></textarea>
							</p>
							<button type="submit" class="btn btn-success">Avaliar</button>											
						</form>
					</div>
					<div id="comentarios" class="span6">
						<h2>Coment�rios</h2>
						<hr>
						<c:forEach items="${avaliacoes}" var="avaliacao">
							<div class="btn-info" style="padding:1%;color:black;border:#1C49CA 2px solid;border-radius:5px;margin-bottom: 1%">
								<span style="color:blue"><h4>Nome: ${avaliacao.nome}</h4></span>
								<hr>
								<div style="">
									${avaliacao.mensagem}
								</div>
								<hr>
								<span style="color:green;font-weight: bold">Nota: ${avaliacao.nota}</span>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>