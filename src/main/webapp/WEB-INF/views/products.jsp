<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Series</h1>
				<p>All the available series</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-md-12 col-md-12" style="padding-bottom: 15 px">
<!-- 				<div class="col-sm-6 col-md-3" style="padding-bottom: 15 px"> -->
					<div class="thumbnail">
						<img src="<c:url 
value="/resource/images/${product.productId}.jpg"></c:url>"
alt="image" style = "width:5%"/>
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.manufacturer}</p>
							<p>${product.description}</p>
							<p>${product.unitPrice}USD</p>
							<p>Available ${product.unitsInStock} units in stock</p>
							<p>
								<a
									href="<spring:url value="/products/product?id=${product.productId}" />"
									class="btn btn-primary"> <span
									class="glyphicon-hand-left glyphicon"></span> Details
								</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>