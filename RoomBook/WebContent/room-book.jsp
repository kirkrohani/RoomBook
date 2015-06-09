<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>RoomBook - Hotel Management Engine</title>
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
                                <li><i class="icon-312 font-13x"></i> Dallas, Texas</li>
                                <li><i class="icon-274 font-13x"></i> kirk.rohani@gmail.com</li>
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


           <%@ include file="mainmenu.jsp" %>
        <!-- /.main-nav -->
           
        </header>
        <!-- /.main-nav -->

        <!-- main content -->
		<section class="slider-box">
			<div class="slider-mask"></div>
			<div class="simple-slider">
			    <ul class="clean-list">
			    	<li><a href="#"><img src="img/main-slider/slide-one.jpg" alt="slide"/></a></li>
			    	<li><a href="#"><img src="img/main-slider/slide-two.jpg" alt="slide"/></a></li>
			    </ul>
			</div>
			<div class="container custom-controls">
				<div class="row">
					<div class="col-md-8 col-md-offset-2">
						<div class="slider-helper">
							<ul class="clean-list">
								<li class="text-white text-center">
									<h1 class="font-6x font-100">RoomBook</h1>
									<p class="darken font-100 welcome-mess">With us you will enjoy your Vacation</p>
									<p class="uppercase letter-spacing"><b>You are Welcome</b></p>
								</li>
								<li class="text-white text-center">
									<h1 class="font-6x font-100">RoomBook</h1>
									<p class="darken welcome-mess">With us you will enjoy your Vacation</p>
									<p class="uppercase letter-spacing"><b>You are Welcome</b></p>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="container custom-controls">
				<span id="controls">
					<a href="#" class="prev-nav" data-target="prev"><i class="icon-83"></i></a>
					<a href="#" class="next-nav" data-target="next"><i class="icon-90"></i></a>
				</span>
			</div>	
		</section> <!-- /.slider-box -->

		<section class="box border-bottom book-box" data-stellar-background-ratio="0.5">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<h4 class="the-title text-center font-300"><i class="icon-141"></i> Make a Reservation</h4>
						<div class="dark-blue booking-form">
							<form action="#" class="row no-padding">
								<div class="col-md-2 col-sm-12">
									<i class="icon-201"></i>
									<input type="text" readonly class="room-select" placeholder="Room">
									<ul class="clean-list font-small">
										<li>Double</li>
										<li>Lux</li>
										<li>Single</li>
									</ul>

								</div>
								<div class="col-md-2 col-sm-6">
									<i class="icon-233"></i>
									<input type="text" id="check-in" placeholder="Check in">
								</div>
								<div class="col-md-2 col-sm-6">
									<i class="icon-233"></i>
									<input type="text" id="check-out" placeholder="Check out">
								</div>
								<div class="col-md-4 col-sm-12">
									<input type="text" class="darken text-white" placeholder="Guest/rooms">
								</div>
								<div class="col-md-2 col-sm-12 text-right">
									<button type="submit" class="button-md green hover-dark-green soft-corners">Book Now</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section> <!-- /.book-form -->
		<section class="box border-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="text-dark-blue text-center fancy-heading">
							<h1 class="font-700">Facilities</h1>
							<hr class="text-dark-blue size-30 center-me">
							<p>What we can offer</p>				
						</div>
					</div>
				</div> <!-- /.row -->
				<ul class="clean-list facilities-items text-center row">
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">GYM</span>					
						</div>
					</li>
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">SPA</span>					
						</div>
					</li>
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">Rooms</span>					
						</div>
					</li>
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">Italian food</span>					
						</div>
					</li>
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">Business meetings</span>					
						</div>
					</li>
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">Fourchette</span>					
						</div>
					</li>
					<li class="col-md-3 col-sm-4">
						<div class="facility-item">
							<div class="shape-square aquablue">
								<figure>
									<a href="#">
										<img src="http://placehold.it/800x800" alt="facilities">
									</a>
								</figure>
							</div>
							<span class="uppercase font-300 text-white facility-text">Parking</span>					
						</div>
					</li>
				</ul>
			</div> <!-- /.container -->
		</section> <!-- /.facilities -->

		<section class="box box-discover-us" data-stellar-background-ratio="0.1">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2">
						<div class="text-center text-white">
							<h1 class="font-100">Be our guest</h1>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
							<br>
							<a href="http://vimeo.com/15202735" class="text-white hover-text-aquablue zoom-image" rel="vimeo">
								<i class="icon-485 font-5x"></i>
							</a>
						</div>
					</div>
				</div>
			</div>
		</section>
		

	<%@include file="footer.jsp" %>
	</div><!-- /.boxed-view -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/options.js"></script>

</body>
</html>