<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>RoomBook - Let's book a room, shall we...</title>
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
							<h1 class="font-700">Book now</h1>
							<hr class="text-dark-blue size-30 center-me">
							<br>			
						</div>
					</div>
				</div> <!-- /.row -->

				<div class="row booking-nav">
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="1">
							<span></span>
							<h4 class="font-100">01. Booking Info</h4>
						</div>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="2">
							<span></span>
							<h4 class="font-100">02. Personal Info</h4>
						</div>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="3">
							<span></span>
							<h4 class="font-100">03. Payment Info</h4>
						</div>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-3">
						<div class="text-center nav-step" data-target="4">
							<span></span>
							<h4 class="font-100">04. Complete</h4>
						</div>
					</div>
				</div>
				<div class="booking-slider">
					<ul class="clean-list">
						<li>
							<div class="row">
								<div class="col-md-12">
									<div class="grey booking-info">
										<div class="row">
											<div class="col-md-2 col-sm-3">
												<figure>
													<a href="#" class="zoom-image">
														<img src="http://placehold.it/600x600" alt="">
													</a>
												</figure>
											</div>
											<div class="col-md-10 col-sm-9">
												<h3 class="blog-title text-dark-blue font-300"><tl:out value="${selectedRoom.bedType}"/> <tl:out value="${selectedRoom.type}" /> (<span class="text-orange"><tl:out value="${selectedRoom.price }"/> /night</span>)</h3>
												<ol class="inline-list tag-list font-small">
													<li>
														<a href="#" class="button-sm green text-white hover-green hover-text-white">SPA</a>
													</li>
													<li>
														<a href="#" class="button-sm green text-white hover-green hover-text-white">GYM</a>
													</li>
													<li>
														<a href="#" class="button-sm green text-white hover-green hover-text-white">WI-FI</a>
													</li>
													<li>
														<a href="#" class="button-sm green text-white hover-green hover-text-white">TV</a>
													</li>
													<li>
														<a href="#" class="button-sm green text-white hover-green hover-text-white">Parking</a>
													</li>
												</ol>
												<div class="grey booking-form">
													<form action="Reservation" class="row no-padding" method="POST" id="form1">
														
														<div class="col-md-2">
															<i class="icon-233"></i>
															<input type="text"  name="date1" id="check-in" placeholder="Check in" value="07-15-2015">
														</div>
														<div class="col-md-2">
															<i class="icon-233"></i>
															<input type="text"  name="date2" id="check-out" placeholder="Check out" value="07-16-2015">
														</div>
														<div class="col-md-2">
															<i class="icon-201"></i>
															<input type="text" readonly class="room-select" placeholder="Adults" value="2">
															<ul class="clean-list font-small">
																<li>1</li>
																<li>2</li>
																<li>3</li>
																<li>4</li>
																<li>5+</li>
															</ul>
														</div>
														<div class="col-md-2">
															<i class="icon-201"></i>
															<input type="text" readonly class="room-select" placeholder="Children" value="1">
															<ul class="clean-list font-small">
																<li>1</li>
																<li>2</li>
																<li>3</li>
																<li>4</li>
																<li>5+</li>
															</ul>

														</div>
														
													</form>
												</div>
											</div>
										</div>
									</div>
								</div>
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
												<td class="text-right text-orange">1589$</td>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="col-md-8">
									<p>
										Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil atque modi velit molestiae, repellendus iure sint possimus cumque, provident, dolorum unde laboriosam ut eius ex maiores quod repudiandae aut asperiores?
									</p>
									<p>
										<label class="radio-fancy">
											<input type="radio" name="test-check">
											<span class="light-blue round-corners"><i class="darken round-corners"></i></span>
											<em>I read and accept the terms and conditions</em>
										</label>
									</p>
									<p class="clearfix">
										<a href="javascript:;" onclick="document.getElementById('form1').submit();" class="button-md green to-right hover-dark-green nav-step" data-target="next">Next</a>
									</p>
								</div>
							</div> <!-- /.row -->
						</li>

						<li>
							<div class="row">
						<form action="#" class="#">
						<div class="col-md-6">							
										<p>
											<input type="text" name="f_name" placeholder="First name">
										</p>
										<p>
											<input type="text" name="l_name" placeholder="Last name">
										</p>
										<p>
											<input type="email" name="email" placeholder="E-mail">
										</p>
										<p>
											<input type="tel" name="tel" placeholder="Telephone Number">
										</p>
										<p>
											<textarea name="notices" cols="30" rows="10" placeholder="Notes and special requests"></textarea>
										</p>
								</div>

								<div class="col-md-6">
									<div class="row">
										<div class="col-md-6">
											<p><input type="text" placeholder="Early Check In"></p>
										</div>
										<div class="col-md-6">
											<p><input type="text" placeholder="Late Check In"></p>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12">
											<p>
												<label class="check-fancy white round-corners">
													<b>Yes</b>
													<input type="checkbox">
													<span class="round-corners green"></span>
													<b>No</b>
												</label>
												<span>Smoking Room</span>
											</p>
										</div>
										<div class="col-md-12">
											<i class="icon-201"></i>
											<input type="text" readonly class="room-select" placeholder="Bed Choices">
											<ul class="clean-list font-small">
												<li>Double Bed</li>
												<li>Twin Bed</li>
											</ul>
										</div>
										<br>
										<div class="col-md-12">
											<p>
												<label class="check-fancy white round-corners">
													<b>Yes</b>
													<input type="checkbox">
													<span class="round-corners grey"></span>
													<b>No</b>
												</label>
												<span>Travel with pets</span>
											</p>
										</div>
										<div class="col-md-12">
											<p>
												<label class="check-fancy white round-corners">
													<b>Yes</b>
													<input type="checkbox">
													<span class="round-corners grey"></span>
													<b>No</b>
												</label>
												<span>Need parking</span>
											</p>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 col-xs-6">
									<a href="#" class="button-md grey text-dark hover-orange nav-step" data-target="prev">Back</a>
								</div>
								<div class="col-md-6 col-xs-6">
									<p class="text-right">
										<a href="#" class="button-md green hover-dark-green nav-step" data-target="next">Next</a>
									</p>
								</div>
							</div>
						</form>
								
						</li>
						
						<li>
							<div class="row">
								<form action="#">
								<div class="col-md-6">
									Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia voluptatem laborum magni facilis officiis vel accusantium sed hic cumque quis id a nihil dicta, dignissimos blanditiis tempore quidem tenetur culpa!
									<h3 class="font-300">Select Payment method</h3>
									<ul class="inline-list payment-method">
										<li>
											<label>
												<input type="radio" name="payment">
												<img src="http://placehold.it/64x40" alt="payment method">
											</label>
										</li>
										<li>
											<label>
												<input type="radio" name="payment">
												<img src="http://placehold.it/64x40" alt="payment method">
											</label>
										</li>
										<li>
											<label>
												<input type="radio" name="payment">
												<img src="http://placehold.it/64x40" alt="payment method">
											</label>
										</li>
										<li>
											<label>
												<input type="radio" name="payment">
												<img src="http://placehold.it/64x40" alt="payment method">
											</label>
										</li>
									</ul>
								</div>
								<div class="col-md-6">							
									<p>
										<input type="text" name="f_name" placeholder="Cardholder name">
									</p>
									<p>
										<input type="text" name="l_name" placeholder="Credit Card Number">
									</p>
									<div class="row">
										<div class="col-md-4">
											<p>
												<input type="email" name="email" placeholder="Expiration Date">
											</p>
										</div>
										<div class="col-md-4">
											<p>
												<input type="email" name="email" placeholder="Expiration Year">
											</p>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4">
											<p>
												<input type="text" name="tel" placeholder="CVV">
											</p>
										</div>

										<div class="col-md-8">
											<a href="#" class="button-md no-shadow text-blue hover-text-green">Card Identification Number?</a>
										</div>
									</div>
									<br>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 col-xs-6">
									<a href="#" class="button-md grey text-dark hover-orange nav-step" data-target="prev">Back</a>
								</div>
								<div class="col-md-6 col-xs-6">
									<p class="text-right">
										<a href="#" class="button-md green hover-dark-green nav-step" data-target="next">Confirm and Pay</a>
									</p>
								</div>
							</div>
							</form>
						</li>
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
									<a href="#" class="button-md grey text-dark hover-orange" data-target="prev">About Hotelia</a>
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