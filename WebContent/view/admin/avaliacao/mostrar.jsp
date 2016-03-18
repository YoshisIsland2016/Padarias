<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html><head>
    <!-- start: Meta -->
    <meta charset="utf-8">
    <title>Padaria Santa Maria - Painel</title>
    <meta name="description" content="Bootstrap Metro Dashboard">
    <meta name="author" content="Dennis Ji">
    <meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <!-- end: Meta -->
    <!-- start: Mobile Specific -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- end: Mobile Specific -->
    <!-- start: CSS -->
    <link id="bootstrap-style" href="view/admin/css/bootstrap.min.css" rel="stylesheet">
    <link href="view/admin/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="view/admin/css/style.css" rel="stylesheet">
    <link id="base-style-responsive" href="view/admin/css/style-responsive.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&amp;subset=latin,cyrillic-ext,latin-ext" rel="stylesheet" type="text/css">
    <!-- end: CSS -->
    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
      <link id="ie-style" href="css/ie.css" rel="stylesheet">
    <![endif]-->
    <!--[if IE 9]>
      <link id="ie9style" href="css/ie9.css" rel="stylesheet">
    <![endif]-->
    <!-- start: Favicon -->
    <link rel="shortcut icon" href="view/admin/img/favicon.ico">
    <!-- end: Favicon -->
  </head><body>
    <!-- start: Header -->
    <div class="navbar">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
          <a class="brand" href="index.jsp">
            <span>Padaria Santa Maria</span></a>       
          <!-- start: Header Menu -->
          <div class="nav-no-collapse header-nav">
            <ul class="nav pull-right">
              <!-- start: Notifications Dropdown -->
              <!-- end: Notifications Dropdown -->
              <!-- start: Message Dropdown -->
              <!-- end: Message Dropdown -->
              <!-- start: User Dropdown -->
              <li class="dropdown">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="halflings-icon white user"></i> ${administradorLogado.login }
								<span class="caret"></span>
							</a>
                <ul class="dropdown-menu">
                  <li class="dropdown-menu-title">
                    <span>Configurações</span>
                  </li>
                  <li>
                    <a href="#"><i class="halflings-icon user"></i> Perfil</a>
                  </li>
                  <li>
                    <a href="logout"><i class="halflings-icon off"></i> Logout</a>
                  </li>
                </ul>
              </li>
              <!-- end: User Dropdown -->
            </ul>
          </div>
          <!-- end: Header Menu -->
        </div>
      </div>
    </div>
    <!-- start: Header -->
    <div class="container-fluid-full">
      <div class="row-fluid">
        <!-- start: Main Menu -->
        	<c:import url="/view/admin/comum/menu.jsp" />
        <!-- end: Main Menu -->
        <noscript>
          <div class="alert alert-block span10">
            <h4 class="alert-heading">Aviso!</h4>
            <p>Você precisa de
              <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>enabled to use this site.</p>
          </div>
        </noscript>
        <!-- start: Content -->
        <div id="content" class="span10">
          <ul class="breadcrumb">
            <li>
              <i class="icon-home"></i>
              <a href="exibirIndex">Home</a>
            </li>
          </ul>
          <div class="row-fluid">
            <div class="clearfix">
            	<div class="box span12">
              <div class="box-header" data-original-title="">
                <h2>
                  <i class="halflings-icon edit"></i>
                  <span class="break"></span>Mensagem</h2>
              </div>
              <div class="box-content">
                <form class="form-horizontal" action="alterarAvaliacao" method="POST">
                  <input type="hidden" name="id" value="${avaliacao.id }" />
                  <fieldset>                    
                    <div class="control-group">
                      <label class="control-label" for="typeahead">Nome:</label>
                      <div class="controls">${avaliacao.nome}</div>
                    </div>
                    <div class="control-group">
                      <label class="control-label" for="date01">Email</label>
                      <div class="controls">${avaliacao.email}</div>
                    </div>
                    <div class="control-group">
                      <label class="control-label" for="date01">Nota</label>
                      <div class="controls">${avaliacao.nota}</div>
                    </div>
                    
                    <div class="control-group"></div>
                    <div class="control-group hidden-phone">
                      <label class="control-label" for="textarea2">Texto</label>
                      <div class="controls">
                        <textarea class="cleditor" id="textarea2" rows="3">${avaliacao.mensagem}</textarea>
                      </div>
                    </div>
                    <div class="control-group">
                      <label class="control-label" for="date01">Permitir:</label>                                         
                      <div class="controls">
                      <c:choose>
							<c:when test="${avaliacao.permissao}">
								<input type="checkbox" name="permissao" value="true" checked> Sim
								<input type="checkbox" name="permissao" value="false"> Não								
							</c:when>
							<c:otherwise>
								<input type="checkbox" name="permissao" value="false" checked> Não
								<input type="checkbox" name="permissao" value="true"> Sim						
							</c:otherwise>
						</c:choose>
						</div>                      
                    </div>
                    <div class="form-actions">
                      <a class="btn btn-success" href="listarAvaliacao">Voltar</a>
                      <button type="submit" class="btn btn-primary">Permitir</button>
                    </div>                    
                  </fieldset>
                </form>
              </div>
            </div>
            </div>
          </div>
          <!--/row-->
        </div>
        <!--/.fluid-container-->
        <!-- end: Content -->
      </div>
      <!--/#content.span10-->
    </div>
    <!--/fluid-row-->
    <div class="clearfix"></div>
    <footer>
      <p>
        <span style="text-align:left;float:left">© 2016
          <a href="http://jiji262.github.io/Bootstrap_Metro_Dashboard/">Yoshi Island</a>
        </span>
      </p>
    </footer>
    <!-- start: JavaScript-->
    <script src="view/admin/js/jquery-1.9.1.min.js"></script>
    <script src="view/admin/js/jquery-migrate-1.0.0.min.js"></script>
    <script src="view/admin/js/jquery-ui-1.10.0.custom.min.js"></script>
    <script src="view/admin/js/jquery.ui.touch-punch.js"></script>
    <script src="view/admin/js/modernizr.js"></script>
    <script src="view/admin/js/bootstrap.min.js"></script>
    <script src="view/admin/js/jquery.cookie.js"></script>
    <script src="view/admin/js/fullcalendar.min.js"></script>
    <script src="view/admin/js/jquery.dataTables.min.js"></script>
    <script src="view/admin/js/excanvas.js"></script>
    <script src="view/admin/js/jquery.flot.js"></script>
    <script src="view/admin/js/jquery.flot.pie.js"></script>
    <script src="view/admin/js/jquery.flot.stack.js"></script>
    <script src="view/admin/js/jquery.flot.resize.min.js"></script>
    <script src="view/admin/js/jquery.chosen.min.js"></script>
    <script src="view/admin/js/jquery.uniform.min.js"></script>
    <script src="view/admin/js/jquery.cleditor.min.js"></script>
    <script src="view/admin/js/jquery.noty.js"></script>
    <script src="view/admin/js/jquery.elfinder.min.js"></script>
    <script src="view/admin/js/jquery.raty.min.js"></script>
    <script src="view/admin/js/jquery.iphone.toggle.js"></script>
    <script src="view/admin/js/jquery.uploadify-3.1.min.js"></script>
    <script src="view/admin/js/jquery.gritter.min.js"></script>
    <script src="view/admin/js/jquery.imagesloaded.js"></script>
    <script src="view/admin/js/jquery.masonry.min.js"></script>
    <script src="view/admin/js/jquery.knob.modified.js"></script>
    <script src="view/admin/js/jquery.sparkline.min.js"></script>
    <script src="view/admin/js/counter.js"></script>
    <script src="view/admin/js/retina.js"></script>
    <script src="view/admin/js/custom.js"></script>
    <!-- end: JavaScript-->
  

</body></html>