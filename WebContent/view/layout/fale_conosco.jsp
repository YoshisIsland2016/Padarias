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
<body >
    <div class="row affix-row">
      <c:import url="menu.jsp" />
      <div class="affix-content col-md-10 col-sm-9">
        <div class="container">
          <div class="page-header">
            <h3>
              <span class="glyphicon glyphicon-th-list"></span>Fale Conosco</h3>
          </div>
          
       		<div class="container">
	<div class="row">
      <div class="col-md-6 col-md-offset-1">
        <div class="well well-sm">
          <form class="form-horizontal" action="" method="post">
          <fieldset>
            <legend class="text-center">Contate-nos</legend>
    
            <!-- Name input-->
            <div class="form-group">
              <label class="col-md-3 control-label" for="name">Nome:</label>
              <div class="col-md-9">
                <input id="name" name="nome" type="text" placeholder="Seu nome" class="form-control">
              </div>
            </div>
    
            <!-- Email input-->
            <div class="form-group">
              <label class="col-md-3 control-label" for="email">E-mail</label>
              <div class="col-md-9">
                <input id="email" name="email" type="text" placeholder="Seu E-mail" class="form-control">
              </div>
            </div>
    
            <!-- Message body -->
            <div class="form-group">
              <label class="col-md-3 control-label" for="message">Mensagem</label>
              <div class="col-md-9">
                <textarea class="form-control" id="message" name="mensagem" placeholder="Por Favor digite a mensagem aqui..." rows="5"></textarea>
              </div>
            </div>
    
            <!-- Form actions -->
            <div class="form-group">
              <div class="col-md-12 text-right">
                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
              </div>
            </div>
          </fieldset>
          </form>
        </div>
      </div>
	</div>
</div>
        </div>
      </div>
    </div>
</body>
</html>