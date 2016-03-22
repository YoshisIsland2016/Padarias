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
<link rel="stylesheet" href="view/css/carousel.css">
<script src="view/js/jquery-1.11.3.min"></script>
<script src="view/js/bootstrap.min.js"></script>
</head>
<body>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script>
		$(function() {
			var nav = $('#menuHeader');
			$(window).scroll(function() {
				if ($(this).scrollTop() > 150) {
					nav.addClass("menu-fixo");
				} else {
					nav.removeClass("menu-fixo");
				}
			});
		});
	</script>
	<div id="container" class="container-fluid">
		<div class="row-fluid">
			<c:import url="menu.jsp" />
			<div id="parte2" class="span10 newsletter">
				<div class="container">
					<div id="myCarousel" class="carousel slide">

						<div class="carousel-inner">
							<article class="item active">
								<img src="http://placehold.it/1200x440/cccccc/ffffff">
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
								<img src="http://placehold.it/1200x440/999999/cccccc">
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
								<img src="http://placehold.it/1200x440/dddddd/333333">
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