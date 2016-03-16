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
				<center><h1>Produtos</h1></center>
				<div id="produtos">
					<div class="produto btn-success" >
						Nome:<br/>
						<img src="view/img/slides/2.jpg" />
						Pre�o: R$ 15.00
					</div>
					<div class="produto btn-success" >
						Nome:<br/>
						<img src="view/img/slides/2.jpg" />
						Preço: R$ 15.00
					</div>
					<div class="produto btn-success" >
						Nome:<br/>
						<img src="view/img/slides/2.jpg" />
						Preço: R$ 15.00
					</div>
					<div class="produto btn-success" >
						Nome:<br/>
						<img src="view/img/slides/2.jpg" />
						Preço: R$ 15.00
					</div>
					<div class="produto btn-success" >
						Nome:<br/>
						<img src="view/img/slides/2.jpg" />
						Preço: R$ 15.00
					</div>
					<div class="produto btn-success" >
						Nome:<br/>
						<img src="view/img/slides/2.jpg" />
						Preço: R$ 15.00
					</div>
				</div>
				<div id="categorias" class="btn-info">
					<h3>Categorias</h3>
					<p>
						<ul>
							<a href="#"><li>Bolos</li></a>
							<li>Tortas</li>
							<li>Pães</li>
						</ul>
					</p>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>