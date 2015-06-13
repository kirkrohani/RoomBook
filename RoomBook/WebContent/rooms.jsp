<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>RoomBook - Look at these lovely rooms...</title>
    <meta name="description" content="Great theme for creative people">
    <!-- Responsive helper -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Apple devices -->
    <link rel="apple-touch-icon-precomposed" href="img/favicon/favicon-apple.png" />
    <!-- 152x152 -->
    <link rel="icon" href="img/favicon/favicon.png">
    <!-- 32x32 or 64x64 -->

    <!-- For IE -->
    <!--[if IE]><link rel="shortcut icon" href="img/favicon/favicon.ico"><![endif]-->
    <!-- 16x16 -->

    <!-- For Mobile Windows -->
    <meta name="msapplication-TileColor" content="#D83434">
    <meta name="msapplication-TileImage" content="img/favicon/favicon.png">
    <!-- 32x32 or 64x64 -->

    <!-- Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap-responsive.css">
    <link rel="stylesheet" href="css/screen.css">

    <script src="js/modernizr.js"></script>
</head>
<body>
    <div id="home" class="boxed-view">
        <header class="main-header clearfix">
            <!-- Header Shorcode Area -->
            <div class="header-bar">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-sm-8">
                            <ul class="inline-list uppercase font-small header-meta">
                                <li><i class="icon-312 font-13x"></i> NY Wall street 25.5</li>
                                <li><i class="icon-274 font-13x"></i> hotelia@gmail.com</li>
                            </ul>
                        </div>

                        <div class="col-md-6 col-sm-4">
                            <ul class="inline-list to-right header-social">
                                <li><a href="#"><i class="icon-528"></i></a>
                                </li>
                                <li><a href="#"><i class="icon-556"></i></a>
                                </li>
                                <li><a href="#"><i class="icon-537"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.header-bar -->
			<%@include file="mainmenu.jsp" %>
            <!-- /.nav-bar -->
        </header>
        <!-- /.main-nav -->

        <!-- main content -->
        <section class="box">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="text-dark-blue text-center fancy-heading">
							<h1 class="font-700">Rooms</h1>
							<hr class="text-dark-blue size-30 center-me">
							<p>what kind of rooms we have</p>
							<br>			
						</div>
					</div>
				</div> <!-- /.row -->
				<div class="row">
					<div class="col-md-12">
						<div class="orange">
							<ul class="inline-list filter-tags center-me">
								<li>
									<a href="#" class="text-white hover-text-orange">Deluxe room </a>
								</li>
								<li>
									<a href="#" class="text-white hover-text-orange">Elegant room</a>
								</li>
								<li>
									<a href="#" class="text-white hover-text-orange">Luxury room</a>
								</li>
								<li>
									<a href="#" class="text-white hover-text-orange">Guest room</a>
								</li>
								<li>
									<a href="#" class="text-white hover-text-orange">Bedroom suite</a>
								</li>
								<li>
									<a href="#" class="text-white hover-text-orange">Business suite</a>
								</li>
								<li>
									<a href="#" class="text-white hover-text-orange">Presidential suite</a>
								</li>
							</ul>
						</div>
						<br>
					</div>
				</div> <!-- /.row -->

				<ul class="clean-list rooms-items row">
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="room-details.jsp" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600"  title="RoomBook rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
					<li class="col-md-4 col-sm-6">
						<div class="text-center">
							<h3 class="text-dark-blue"><a href="?page=room-preview" class="text-dark-blue hover-text-aquablue">Standard Suite</a></h3>
							<figure>
								<a href="http://placehold.it/600x600" class="zoom-image" title="Hotelia rooms" rel="gallery-1"><img src="http://placehold.it/600x600" alt="portfolio item"></a>
								<figcaption class="aquablue text-white">
									<ul class="inline-list center-me amenities">
										<li><i class="icon-326 font-13x"></i></li>
										<li><i class="icon-391 font-13x"></i></li>
										<li><i class="icon-426 font-13x"></i></li>
										<li><i class="icon-217 font-13x"></i></li>
										<li><i class="icon-219 font-13x"></i></li>
										<li><i class="icon-237 font-13x"></i></li>
									</ul>
								</figcaption>
							</figure>
							<div class="rooms-description">
								<p>
									Warm within me, that it might be the mirror of my soul, 
									as my soul is the mirror <br> of the infinite God!
								</p>
								<div class="rooms-footer clearfix">
									<span class="to-left align-button">Price: <b class="text-aquablue font-13x font-300">$120</b></span>
									<a href="?page=room-preview" class="button-sm to-right grey text-black hover-orange soft-corners">Book now</a>
								</div>
							</div>
						</div>
					</li>
				</ul> <!-- /.row -->

				<div class="row">
					<div class="col-md-12">
						<ul class="inline-list center-me pagination-links">
							<li><a href="index.html">Prev</a></li>
							<li><a href="index.html">1</a></li>
							<li><a href="index.html">2</a></li>
							<li><a href="index.html">3</a></li>
							<li><a href="index.html">4</a></li>
							<li><a href="index.html">5</a></li>
							<li><span>...</span></li>
							<li><a href="index.html">125</a></li>
							<li><a href="index.html">Next</a></li>
						</ul>
					</div>
				</div> <!-- /.row -->
			</div> <!-- /.container -->
		</section> <!-- /.box -->
		<%@include file="footer.jsp" %>
	</div><!-- /.boxed-view -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/options.js"></script>
</body>
</html>