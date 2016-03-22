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
      <div class="affix-content col-md-10 col-sm-9 col-xs-12">        
        <div class="container">
          <div class="page-header">
            <h3>
              <span class="glyphicon glyphicon-th-list"></span> ${produto.nome_produto}</h3>
          </div>          
            <div id="verProduto" class="col-md-12 col-sm-12 col-xs-12">    
              <div class="col-md-9 col-sm-12 imagemProduto">
                <img src="view/img/produtos/${produto.imagem}" />
                <br />
              </div>
              <div class="col-md-3 col-sm-12 info">
                <h2>Descrição</h2>
                <br/>
                ${produto.descricao}
                <br/>
                <h3>R$ ${produto.preco}</h3>
              </div> 
            </div>
            <div id="avaliacao" class="col-md-12 col-sm-12 col-xs-12">
              <div id="avaliar" class="col-md-7 col-sm-12">
                <h2>Deixe sua Avaliação</h2>
                <form action="salvarAvaliacao">
                  <input type="hidden" name="produtoid" value="${produto.id_produto}" />
                  <input type="hidden" name="permissao" value="false" />
                  <p>
                  Nome:
                  <input type="text" name="nome" required="required" /><br/>
                  </p>
                  <p>
                  Email:
                  <input type="text" name="email" required="required" />
                  </p>
                  <p> 
                  Nota:
                  <select name="nota" required="required">
                    <option value=""></option>
                    <option value="1">Muito Ruim</option>
                    <option value="2">Ruim</option>
                    <option value="3">Razoável</option>
                    <option value="4">Bom</option>
                    <option value="5">Muito Bom</option>
                  </select>
                  </p>
                  <p>
                  Descrição:<br/>
                  <textarea style="width: 347px; height: 159px;" name="mensagem" id="mensagem" cols="0" rows="0"></textarea>
                  </p>
                  <button type="submit" class="btn btn-success">Avaliar</button>                      
                </form>
              </div>
              <div id="comentarios" class="col-md-5 col-sm-12">
                <h2>Comentários</h2>
                <hr>
                <c:forEach items="${avaliacoes}" var="avaliacao">
					<c:if test="${avaliacao.permissao}">
		                <div class="btn-info" style="padding:1%;color:black;border:#1C49CA 2px solid;border-radius:5px;margin-bottom: 1%;">
		                  <span style="color:blue"><h4>Nome: ${avaliacao.nome}</h4></span>
		                  <hr>
		                  <div style="">
		                    ${avaliacao.mensagem}
		                  </div>
		                  <hr>
		                  <span style="color:green;font-weight: bold">Nota: ${avaliacao.nota}</span>
		                </div>
		           </c:if>
		         </c:forEach>
              </div>
            </div>
      </div>
    </div>   
  </div> 
</body>
</html>