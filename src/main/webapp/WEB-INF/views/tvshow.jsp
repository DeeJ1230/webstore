<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Tvshow</h1>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
		<div class="col-md-5">
<img src="<c:url
value="${tvshow.c06}"></c:url>"
alt="image" style = "width:50%"/>
</div>
			<div class="col-md-5">
				<h3>${tvshow.c00}</h3>
				<p>${tvshow.c01}</p>
				<p>
					<strong>Kodi Show Id : </strong><span class="label label-warning">${tvshow.idShow}</span>
				</p>
				<p>
					<strong>Studio</strong> : ${tvshow.c14}
				</p>
				<p>
					<strong>Category</strong> : ${tvshow.c08}
				</p>
				<p>
					<strong>Episodes </strong> :
					${tvshow.c03}
				</p>
				<p>
					<a href="<spring:url value="/tvshows" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Back
					</a>
				</p>
				<p>
					<a href="#" class="btn btn-warning btn-large"> <span
						class="glyphicon-shopping-cart glyphicon"></span>Order Now
					</a>
				</p>
			</div>
		</div>
	</section>

</body>
</html>