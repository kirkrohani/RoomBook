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
        <!-- main content -->
        <section class="#">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="text-white">
						<img alt="" src="img/guest-landing.jpg">
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