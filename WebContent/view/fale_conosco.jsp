<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
			<div align ="center" id="parte2" class="span10">
				<h2>Fale Conosco</h2>
				<br />
				<div class="faleconosco">
					<form class="form-horizontal" action="salvarContato" method="POST">						
						<div style="margin-left: 25%" class="control-group">
							<label for="inputNome" class="control-label"></label>
							<div class="input-append">								
								<input class="entradas" type="text" placeholder="Nome" id="inputSuccess" name="nome" />							
								<span class="add-on">N</span>
							</div>
						</div>
						<div style="margin-left: 25%" class="control-group">
							<label for="inputEmail" class="control-label"></label>
							<div class="input-append">								
								<input class="entradas" type="email" required placeholder="Email" name="email" />
								<span class="add-on">@</span>
							</div>
						</div>
						<div style="margin-left: 25%" class="control-group">
							<label for="" class="control-label"></label>
							<div>
								<textarea name="mensagem" id="mensagem" cols="30" rows="10" placeholder="Digite sua mensagem aqui"></textarea>
							</div>
						</div>
						<div style="margin-left: 25%" class="control-group">
							<label for="" class="control-label"></label>
							<div>
								<input type="submit" class="btn btn-success" value="Enviar" />
								<input type="reset" class="btn btn-danger" value="Limpar">
							</div>
						</div>
					</form>
					<div style="color:red;font-weight: bold"><h3>${msg}</h3></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>