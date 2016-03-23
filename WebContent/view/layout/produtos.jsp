<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="description" content="Padaria Santa Maria">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Padaria Santa Maria</title>
  <link rel="stylesheet" href="view/layout/css/bootstrap.css">
  <link rel="stylesheet" href="view/layout/css/bootstrap-responsive.css">
  <link rel="stylesheet" href="view/layout/css/style.css">  
  <script src="view/layout/js/jquery-1.10.2.min.js"></script>
  <script src="view/layout/js/bootstrap.min.js"></script>
  <script src="view/layout/js/bootstrap.js"></script>
</head>
<body>
    <div class="row affix-row">
      <c:import url="menu.jsp" />
      <div class="affix-content col-md-10 col-sm-9">
        <div class="container">
          <div class="page-header">
            <h3>
              <span class="glyphicon glyphicon-th-list"></span>Produtos</h3>
          </div>
            <div id="produtos">
              <c:forEach items="${produtos}" var="produto">
	              <div class="produto btn-success" >
	                ${produto.nome_produto}:<br/>
	                <a href="verProduto?id_produto=${produto.id_produto}" /><img src="view/img/produtos/${produto.imagem}" /> </a><br/>
	                <span style="font-size:1.5vw">Preço: R$ ${produto.preco}</span>
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