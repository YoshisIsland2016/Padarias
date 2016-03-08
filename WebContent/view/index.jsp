<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Padaria Santa Maria" />
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<title>Padaria Santa Maria</title>
	<link rel="stylesheet" href="<c:url value="css/bootstrap.css" />">
	<link rel="stylesheet" href="<c:url value="css/bootstrap-responsive.css" />">
	<link rel="stylesheet" href="<c:url value="css/style.css" />">		
	<script src="<c:url value="js/jquery-1.11.3.min" />"></script>
	<script src="<c:url value="js/bootstrap.min.js" />"></script>
</head>
<body>
	<!-- Container de DIVS-->
	<div class="container-fluid">
		<!-- Linha Fluid para DIVS internas-->
		<div class="row-fluid">
			<!-- DIV para Menu -->
			<div id="topo" class="span12">
				<div>
					<a href="">Inicio</a>
					<a href="">Produtos</a>
					<a href="">Quem somos</a>
					<a href="">Fale Conosco</a>
					<a href="view/login.jsp">Administracao</a>	
				</div>
			</div>
			<!-- FIM DA DIV para Menu -->
			<!-- DIV para PROMOCOES DOS PRODUTOS e Slideshow-->
			<div class="row-fluid">				
				<!-- DIV de PROMOCOES -->
				<div class="span2">
					<div class="promocao">
						<img src="img/slides/2.jpg" alt="">
						PROMOCAO DA DIA
					</div>
					<div class="promocao">
						<img src="img/slides/3.jpg" alt="">
						PROMOCAO DA DIA
					</div>
					<div class="promocao">
						<img src="img/slides/4.jpg" alt="">
						PROMOCAO DA DIA
					</div>
					<div class="promocao">
						<img src="img/slides/4.jpg" alt="">
						PROMOCAO DA DIA
					</div>
					<div class="promocao">
						<img src="img/slides/4.jpg" alt="">
						PROMOCAO DA DIA
					</div>
				</div>
				<!-- FIM DA DIV de PROMOCOES -->	
				<div class="span10">
					<!-- DIV para SLIDESHOW -->
					<div class="container-fluid">
						<section class="row-fluid carousel slide span12" id="carrossel">
							<div id="slideshow" class="carousel-inner">
								<figure class="active item">
									<img src="img/slides/1.jpg" alt="img1">
									<figurecaption class="carousel-caption imagem justificar">
										<h4>Torta de Frango</h4>
										<p>Torta de Frango suculenta recheada com frango ao molho e catupiry.</p>
									</figurecaption>
								</figure>
								<figure class="item">
									<img src="img/slides/2.jpg" alt="img2">
									<figurecaption class="carousel-caption imagem justificar">
										<h4>Bolo de Rolo</h4>
										<p>Bolo de Rolo recheado com goiabada e coberta de açúcar cristal.</p>
									</figurecaption>
								</figure>
								<figure class="item">
									<img src="img/slides/3.jpg" alt="img3">
									<figurecaption class="carousel-caption imagem justificar">
										<h4>Pizza de Calabresa</h4>
										<p>Pizza recheada com molho bolognesa e com calabresa fresca e cebola .</p>
									</figurecaption>
								</figure>
								<figure class="item">
									<img src="img/slides/4.jpg" alt="img4">
									<figurecaption class="carousel-caption imagem justificar">
										<h4>Torta de morango</h4>
										<p>Torta recheada com morango, biscoitos e com duas camadas de recheio .</p>
									</figurecaption>
								</figure>
							</div>
							<a href="#carrossel" class="carousel-control left" data-slide="prev">&lsaquo;</a>
							<a href="#carrossel" class="carousel-control right offset1" data-slide="next">&rsaquo;</a>
						</section>
					</div>
					<!-- FIM DA DIV para SLIDESHOW -->
					<div id="corpo" class="span11">
						<h2>Bem vindo a Padaria Santa Maria</h2>
						Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo eum assumenda nostrum accusamus molestiae labore, asperiores laudantium itaque officiis dignissimos sint corporis sapiente et ex, in impedit pariatur, aliquam recusandae?Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo eum assumenda nostrum accusamus molestiae labore, asperiores laudantium itaque officiis dignissimos sint corporis sapiente et ex, in impedit pariatur, aliquam recusandae?Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo eum assumenda nostrum accusamus molestiae labore, asperiores laudantium itaque officiis dignissimos sint corporis sapiente et ex, in impedit pariatur, aliquam recusandae?
					</div>
				</div>				
			</div>
			<!-- FIM DA DIV para PROMOCOES DOS PRODUTOS e Slideshow-->
		</div>
	</div>
</body>
</html>