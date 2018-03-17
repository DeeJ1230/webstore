<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>TvShows</title>
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
				<h1>Tvshows</h1>
				<p>The available tvshows in Kodi</p>
			</div>
		</div>
	</section>

	<section class="container">

		<div class="row">
			<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
				<div class="thumbnail">
					<div class="caption">
						<h3>Name</h3>
					</div>
				</div>
			</div>
			<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
				<div class="thumbnail">
					<div class="caption">
						<p>Episodes</p>
					</div>
				</div>
			</div>
			<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
				<div class="thumbnail">
					<div class="caption">
						<p>Score</p>
					</div>
				</div>
			</div>
			<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
				<div class="thumbnail">
					<div class="caption">
						<p>Air Date</p>
					</div>
				</div>
			</div>
			<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
				<div class="thumbnail">
					<div class="caption">
						<p>Category</p>
					</div>
				</div>
			</div>
			<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
				<div class="thumbnail">
					<div class="caption">
						<p>Studio</p>
					</div>
				</div>
			</div>

			<c:forEach items="${tvshows}" var="tvshow">
				<div class="row">
					<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
						<div class="thumbnail">
							<div class="caption">
								<b>${tvshow.c00}</b>
							</div>
						</div>
					</div>
					<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
						<div class="thumbnail">
							<div class="caption">
								<p>${tvshow.c03}</p>
							</div>
						</div>
					</div>
					<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
						<div class="thumbnail">
							<div class="caption">
								<p>${tvshow.c04}</p>
							</div>
						</div>
					</div>
					<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
						<div class="thumbnail">
							<div class="caption">
								<p>${tvshow.c05}</p>
							</div>
						</div>
					</div>
					<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
						<div class="thumbnail">
							<div class="caption">
								<p>${tvshow.c08}</p>
							</div>
						</div>
					</div>
					<div class="col-md-2 col-md-2" style="padding-bottom: 15 px">
						<div class="thumbnail">
							<div class="caption">
								<p>${tvshow.c14}
									<a
										href="<spring:url value="/tvshows/${tvshow.idShow}" />"
										class="btn btn-primary"> <span
										class="glyphicon-hand-left glyphicon"></span> Details
									</a>
								</p>
							</div>
						</div>
					</div>


				</div>
			</c:forEach>
	</section>
</body>
</html>