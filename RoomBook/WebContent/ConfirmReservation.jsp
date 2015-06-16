<%@ taglib prefix="tl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Hotelia - Developed with love by TeslaThemes.com</title>
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
                                <li><i class="icon-312 font-13x"></i> Dallas, Texas 75251</li>
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
           
                <!-- /.container -->
            </div>
            <!-- /.nav-bar -->
        </header>
        <!-- /.main-nav -->

        <!-- main content -->
        <section class="box">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="text-dark-blue text-center fancy-heading">
							<h1 class="font-700">Book now</h1>
							<hr class="text-dark-blue size-30 center-me">
							<br>			
						</div>
					</div>
				</div> <!-- /.row -->

				<div class="row booking-nav">
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="4">
							<span></span>
							<h4 class="font-100">01. Booking Info</h4>
						</div>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="3">
							<span></span>
							<h4 class="font-100">02. Personal Info</h4>
						</div>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="2">
							<span></span>
							<h4 class="font-100">03. Payment Info</h4>
						</div>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="1">
							<span></span>
							<h4 class="font-100">04. Complete</h4>
						</div>
					</div>
				</div>
				<div class="booking-slider">
					<ul class="clean-list">
					
						<li>
							<div class="row">
								<div class="col-md-4">
									<table>
										<tbody>
											<tr>
												<td>Room:</td>
												<td class="text-right">30 night x <span class="text-orange">49$</span></td>
											</tr>
											<tr>
												<td>Additinal fee:</td>
												<td class="text-right text-orange">119$</td>
											</tr>
											<tr>
												<td class="uppercase font-500 text-green">Grand-total:</td>
												<td class="text-right text-orange">1589$ <span class="text-green">(Paid)</span></td>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="col-md-8">
									<div class="alert-box green">
										<h4 class="text-white">Your reservation was succefull submited!</h4>
									</div>
									<p>
										Lorem ipsum dolor sit amet, consectetur adipisicing elit. Excepturi dicta commodi officia unde esse enim repellat ipsa quae omnis error numquam!
									</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<a href="#" class="button-md grey text-dark hover-orange" data-target="prev">About RoomBook</a>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div> <!-- /.container -->
		</section> <!-- /.box -->
        
	<%@ include file="footer.jsp" %>
	</div><!-- /.boxed-view -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/options.js"></script>
</body>
</html>