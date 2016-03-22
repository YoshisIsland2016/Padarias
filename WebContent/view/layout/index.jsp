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
						<span class="glyphicon glyphicon-th-list"></span>Home
					</h3>
				</div>
				<div class="container" style="height: 200px;">
					<div id="myCarousel" class="carousel slide" style="height: 200px;">
						<div class="carousel-inner">
							<article class="item active">
								<img style="width:100%;height: 200px;"
									src="http://www.osgauleses.com.br/images/-banner.jpg">
								<div class="carousel-caption">
									<h3>Headline</h3>
									<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
										sed diam nonumy eirmod tempor invidunt ut labore et dolore
										magna aliquyam erat, sed diam voluptua.</p>
									<p>
										<a class="btn btn-info btn-sm">Read More</a>
									</p>
								</div>
							</article>
							<article class="item">
								<img style="width:100%;height: 200px;"
									src="http://www.osgauleses.com.br/images/-banner.jpg">
								<div class="carousel-caption">
									<h3>Headline</h3>
									<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
										sed diam nonumy eirmod tempor invidunt ut labore et dolore
										magna aliquyam erat, sed diam voluptua.</p>
									<p>
										<a class="btn btn-info btn-sm">Read More</a>
									</p>
								</div>
							</article>
							<article class="item">
								<img style="width:100%;height: 200px;"
									src="view/img/slides/3.jpg">
								<div class="carousel-caption">
									<h3>Headline</h3>
									<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
										sed diam nonumy eirmod tempor invidunt ut labore et dolore
										magna aliquyam erat, sed diam voluptua.</p>
									<p>
										<a class="btn btn-info btn-sm">Read More</a>
									</p>
								</div>
							</article>
						</div>
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
						</ol>
						<!-- Controls -->
						<div class="carousel-controls">
							<a class="carousel-control left" href="#myCarousel"
								data-slide="prev"> <span class="fa fa-angle-double-left"></span>
							</a> <a class="carousel-control right" href="#myCarousel"
								data-slide="next"> <span class="fa fa-angle-double-right"></span>
							</a>
						</div>
					</div>
				</div>
				<div style="margin-top:5%;font-size:16px;text-align: justify;">
					A  Panificadora Santa Maria, que antes era a Hiper Panifica��o Vit�ria, pertencentes dos mesmos donos, veio a ter suas atividades iniciadas a partir de janeiro de 2012 quando a antiga Hiper Panifica��o vit�ria funcionava nesse mesmo local.
A antiga padaria com o nome de Hiper Panifica��o Vit�ria foi fundada em 2002 no bairro do Curado III, em Jaboat�o, permanecendo suas atividades at� o final de 2011.  Nesse per�odo ela que era a Matriz tinha 2 filiais no mesmo bairro s� que localidades diferentes,  uma aberta em 2005 e outra em 2007.  Sendo que por causa de diversos fatores a filial mais nova inaugurada no bairro vizinho no Curado II, fundada em 2007 chega em suas atividades at� o fim do ano de 2010.   Em 2011 a antiga Padaria Hiper Panifica��o Vit�ria por diversos fatores encerra suas atividades com esse nome fantasia e inicia suas atividades novamente em 2012, sendo que s� tendo um estabelecimento sem filiais e com novo nome que se chama Padaria Santa Maria.  Essa mesma se localiza no mesmo lugar que funcionava h� mais de 10 anos com o antigo nome da padaria anterior.
Os donos s�o os mesmos e a qualidade e a higiene permanecem os mesmos, os produtos s�o os mesmos, a clientela n�o teve dificuldades em assimilar a mudan�a de nome da Padaria, sabendo que j� conhece sua fabrica��o e o m�todo como s�o produzidos e vendidos.
				</div>
				<script
					src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
				<script>
					$('#myCarousel').carousel({
						interval : 4000
					});
				</script>
			</div>
		</div>
	</div>
</body>
</html>