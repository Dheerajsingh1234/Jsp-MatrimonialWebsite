<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<!DOCTYPE HTML>
<html>
<head>
<title>Marital an Wedding Category Flat Bootstarp Resposive Website Template | Register :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>
<!----font-Awesome----->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<script>
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
</head>
<body>
<!-- ============================  Navigation Start =========================== -->
 <div class="navbar navbar-inverse-blue navbar">
    <!--<div class="navbar navbar-inverse-blue navbar-fixed-top">-->
      <div class="navbar-inner navbar-inner_1">
        <div class="container">
           <div class="navigation">
             <nav id="colorNav">
			   <ul>
				<li class="green">
				  <a href="#" class="icon-home"></a>
				  <ul>
					
					<li><a href="register.jsp">Register</a></li>
					<li><a href="logout.jsp">Logout</a></li>
				  </ul>
				</li>
			   </ul>
             </nav>
           </div>
           <a class="brand" href="index.html"><img src="images/logo.png" alt="logo"></a>
           <div class="pull-right">
          	<nav class="navbar nav_bottom" role="navigation">
 
		 <!-- Brand and toggle get grouped for better mobile display -->
		  <div class="navbar-header nav_2">
		      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">Menu
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#"></a>
		   </div> 
		   <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
		        <ul class="nav navbar-nav nav_1">
		            <li><a href="index.jsp">Home</a></li>
		            <li><a href="Edit.jsp">Edit</a></li>
		    		<li class="dropdown">
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Matches<span class="caret"></span></a>
		              <ul class="dropdown-menu" role="menu">
		                <li><a href="matches.html">New Matches</a></li>
		                <li><a href="viewed-profile.html">Who Viewed my Profile</a></li>
		                <li><a href="viewed-not_contacted.html">Viewed & not Contacted</a></li>
		                <li><a href="members.html">Premium Members</a></li>
		                <li><a href="shortlisted.html">Shortlisted Profile</a></li>
		              </ul>
		            </li>
					<li class="dropdown">
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Search<span class="caret"></span></a>
		              <ul class="dropdown-menu" role="menu">
		                <li><a href="search.jsp">Regular Search</a></li>
		                <li><a href="profile.html">Recently Viewed Profiles</a></li>
		                <li><a href="search-id.html">Search By Profile ID</a></li>
		                <li><a href="faq.html">Faq</a></li>
		                <li><a href="shortcodes.html">Shortcodes</a></li>
		              </ul>
		            </li>
		            <li class="dropdown">
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Messages<span class="caret"></span></a>
		              <ul class="dropdown-menu" role="menu">
		                <li><a href="inbox.jsp">Inbox</a></li>
		                <li><a href="inbox.jsp">New</a></li>
		                <li><a href="inbox.jsp">Accepted</a></li>
		                <li><a href="sent.jsp">Sent</a></li>
		                <li><a href="upgrade.jsp">Upgrade</a></li>
		              </ul>
		            </li>
		            <li class="last"><a href="contact.html">Contacts</a></li>
		        </ul>
		     </div><!-- /.navbar-collapse -->
		    </nav>
		   </div> <!-- end pull-right -->
          <div class="clearfix"> </div>
        </div> <!-- end container -->
      </div> <!-- end navbar-inner -->
    </div> <!-- end navbar-inverse-blue -->
<!-- ============================  Navigation End ============================ -->
<div class="grid_3">
  <div class="container">
   <div class="breadcrumb1">
     
        <a href="index.jsp"><i class="fa fa-home home_1"></i></a>
        <span class="divider">&nbsp;|&nbsp;</span>
        
     
   </div>
   <div class="services">
   	  <div class="col-sm-6 login_left">
	     <form method=post action="check.jsp">
                
		      <div class="form-group">
		      <label for="edit-name">Sn <span class="form-required" title="This field is required.">*</span></label>
		      <input type="number" id="name" name="sn" value="" size="20" maxlength="20"  class="form-text required"> 
                    
		    </div>
	  	    <div class="form-group">
		      <div class="form-group">
		      <label for="edit-name">Name <span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="name" name="name" value="" size="20" maxlength="20"  class="form-text required"> 
                    
		    </div>
		    <div class="form-group">
		      <label for="edit-pass">Password <span class="form-required" title="This field is required.">*</span></label>
		      <input type="password" id="pass" name="pass" size="60" maxlength="128" class="form-text required">
		    </div>
		    <div class="form-group">
		      <label for="edit-email">Email <span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="email" name="email" value="" size="60" maxlength="60" class="form-text required">
		    </div>
              
                    <div class="form_group">
                     <lable for="cast"><strong>Cast</strong><span class="form-required" title="this field is required"<span>*</lable>
                     <input type="text" id="cast" name="cast" value="" size="60" maxlength="60" class="form-text required">           
                     </div> 
                        
                    <div class="form_group">
                     <lable for="cast"><strong>location*</strong><span class="form-required" title="this field is required"<span>*</lable>
                     <input type="text" id="cast" name="location" value="" size="60" maxlength="60" class="form-text required">           
                    </div> 
                    
		     <div class="age_select">
		      <label for="edit-pass">DOB<span class="form-required" title="This field is required.">*</span></label>
		        <div class="age_grid">
                            
		         <div class="col-sm-4 form_box">
                  <div class="select-block1">
                    <select name="date">
	                    <option value="Date">Date</option>
	                    <option value="1">1</option>
	                    <option value="2">2</option>
	                    <option value="3">3</option>
	                    <option value="4">4</option>
	                    <option value="5">5</option>
	                    <option value="67">6</option>
	                    <option value="7">7</option>
	                    <option value="8">8</option>
	                    <option value="9">9</option>
	                    <option value="10">10</option>
	                    <option value="11">11</option>
	                    <option value="12">12</option>
	                    <option value="13">13</option>
	                    <option value="14">14</option>
	                    <option value="15">15</option>
	                    <option value="16">16</option>
	                    <option value="17">17</option>
	                    <option value="18">18</option>
	                    <option value="19">19</option>
	                    <option value="20">20</option>
	                    <option value="21">21</option>
	                    <option value="22">22</option>
	                    <option value="24">24</option>
	                    <option value="25">25</option>
	                    <option value="26">26</option>
	                    <option value="27">27</option>
	                    <option value="28">28</option>
	                    <option value="29">29</option>
	                    <option value="30">30</option>
	                    <option value="31">31</option>
                    </select>
                  </div>
            </div>
            <div class="col-sm-4 form_box2">
                   <div class="select-block1">
                    <select name="month">
	                    <option value="Month">Month</option>
	                    <option value="January">January</option>
	                    <option value="February">February</option>
	                    <option value="March">March</option>
	                    <option value="April">April</option>
	                    <option value="May">May</option>
	                    <option value="June">June</option>
	                    <option value="July">July</option>
	                    <option value="August">August</option>
	                    <option value="September">September</option>
	                    <option value="October">October</option>
	                    <option value="November">November</option>
	                    <option value="December">December</option>
                     </select>
                  </div>
                 </div>
                 <div class="col-sm-4 form_box1">
                   <div class="select-block1">
                    <select name="year">
	                    <option value="Year">Year</option>
	                    <option value="1990">1980</option>
	                    <option value="1981">1981</option>
	                    <option value="1982">1982</option>
	                    <option value="1983">1983</option>
	                    <option value="1984">1984</option>
	                    <option value="1985">1985</option>
	                    <option value="1986">1986</option>
	                    <option value="1987">1987</option>
	                    <option value="1988">1988</option>
	                    <option value="1989">1989</option>
	                    <option value="1990">1990</option>
	                    <option value="1991">1991</option>
	                    <option value="1992">1992</option>
	                    <option value="1993">1993</option>
	                    <option value="1994">1994</option>
	                    <option value="1995">1995</option>
	                    <option value="1996">1996</option>
	                    <option value="1997">1997</option>
	                    <option value="">1998</option>
	                    <option value="1998">1999</option>
	                    <option value="2000">2000</option>
	                    <option value="2001">2001</option>
	                    <option value="2002">2002</option>
	                    <option value="2003">2003</option>
	                    <option value="2004">2004</option>
	                    <option value="">2005</option>
	                    <option value="">2006</option>
	                    <option value="">2007</option>
	                    <option value="">2008</option>
	                    <option value="">2009</option>
	                    <option value="">2010</option>
	                    <option value="">2011</option>
	                    <option value="">2012</option>
	                    <option value="">2013</option>
	                    <option value="">2014</option>
	                    <option value="">2015</option>
                     </select>
                   </div>
                  </div>
                  <div class="clearfix"> </div>
                 </div>
              </div>
              <div class="form-group form-group1">
                <label class="col-sm-7 control-lable" >Sex : </label>
                <div class="col-sm-5">
                    <div class="radios">
				        <label  class="label_radio">
				            <input type="radio" value="male" name ="sex"checked=""> Male
				        </label>
				        <label  class="label_radio">
				            <input type="radio" value="female" name="sex"> Female
				        </label>
	                </div>
                </div>
                <div class="clearfix"> </div>
             </div>
                   </div>
                <div class="form_but1">
                 <h4><Strong>Height*</strong></h4>
                <input type="text" id="height" name="height" value="" size="20" maxlength="20"  class="form-text required" required> 
                </div>
               <div class="form_but1">
                    <h4><Strong>Age*</strong></h4>
                <input type="text"  name="age" value="" size="20" maxlength="20"  class="form-text required" required> 
                </div>
               <div class="form_but1">
                    <label class="col-sm-5 control-lable1" >Marital Status* </label>
                    
                      <div class="select-block1">
                        <select name="status"  >
                            <option value="Married">Married</option>
                            <option value="Divorced">Divorced</option>
                            <option value="Separated">Separated</option>
                            <option value="Single">Single</option>
                            
                        </select>
                          </div>
                        </div>
                   
			 <div class="clearfix"> </div>
                 <div class="form_but1">
                    <label class="col-sm-5 control-lable1" for="sex">Country* </label>
                    
                      <div class="select-block1">
                        <select name="country"  maxlength="20" class="form-text required" required>
                            <option value="">Country</option>
                            <option value="Japan">Japan</option>
                            <option value="India">india</option>
                            <option value="Dubai">Dubai</option>
                            <option value="Italy">Italy</option>
                        <option value="Greece">Greece</option> 
                        <option value="Iceland">Iceland</option> 
                        <option value="China">China</option> 
                        <option value="Doha">Doha</option> 
                        <option value="Irland">Irland</option> 
                        <option value="Srilanka">Srilanka</option>
                        </select>
                          </div>
                        </div>
                          <div>  
                 <h4><Strong>Education*</strong></h4>
                <input type="text" id="education" name="education" value="" size="20" maxlength="20"  class="form-text required" required> 
               </div> 
                         <div class="form_but1">
                            <label class="col-sm-5 control-lable1" for="sex">Religion : </label>
                            <div >
                              <div class="select-block1">
                                <select name="religion">
                                    <option value="Hindu">Hindu</option>
                                    <option value="Sikh">Sikh</option>
                                    <option value="Jain-All">Jain-All</option>
                                    <option value="Jain-Digambar">Jain-Digambar</option>
                                    <option value="Jain-Others">Jain-Others</option>
                                    <option value="Muslim-All">Muslim-All</option> 
                                    <option value="Muslim-Shia">Muslim-Shia</option> 
                                    <option value="Muslim-Sunni">Muslim-Sunni</option> 

                                    <option value="Christian-All">Christian-All</option> 
                                    <option value="Christian-Catholic">Christian-Catholic</option> 

                                </select>
                              </div>
                            </div>
    <div class="clearfix"> </div>
  </div>
  
                <div class="form_but1">
                    <label class="col-sm-5 control-lable1" for="sex">State* </label>
                    
                   <div class="select-block1">
                        <select name="state"  maxlength="20" class="form-text required" required>
                            <option value="">State</option>
                            <option value="Japan">Rajsthan</option>
                            <option value="Utter pradesh">Utter pradesh</option>
                            <option value="Mubai">Mumbai</option>
                            <option value="Haryana">Haryana</option>
                        <option value="Delhi">Delhi</option> 
                        <option value="Maharastra">Maharastra</option> 
                        <option value="Chennai">Chennai</option>
                         </select>
                          </div>
                        </div>
		
			  <div class="form-actions">
			    <input type="submit" id="edit-submit" name="submit" value="Submit" class="btn_1 submit">
			  </div>
                       
		 </form>
	  </div>
	  <div class="col-sm-6">
	     <ul class="sharing">
			<li><a href="#" class="facebook" title="Facebook"><i class="fa fa-boxed fa-fw fa-facebook"></i> Share on Facebook</a></li>
		  	<li><a href="#" class="twitter" title="Twitter"><i class="fa fa-boxed fa-fw fa-twitter"></i> Tweet</a></li>
		  	<li><a href="#" class="google" title="Google"><i class="fa fa-boxed fa-fw fa-google-plus"></i> Share on Google+</a></li>
		  	<li><a href="#" class="linkedin" title="Linkedin"><i class="fa fa-boxed fa-fw fa-linkedin"></i> Share on LinkedIn</a></li>
		  	<li><a href="#" class="mail" title="Email"><i class="fa fa-boxed fa-fw fa-envelope-o"></i> E-mail</a></li>
		 </ul>
	  </div>
	  <div class="clearfix"> </div>
   </div>
  </div>
</div>
<div class="map">
	<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978"> </iframe>
</div>
<div class="footer">
    	<div class="container">
    		<div class="col-md-4 col_2">
    			<h4>About Us</h4>
    			<p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris."</p>
    		</div>
    		<div class="col-md-2 col_2">
    			<h4>Help & Support</h4>
    			<ul class="footer_links">
    				<li><a href="#">24x7 Live help</a></li>
    				<li><a href="contact.html">Contact us</a></li>
    				<li><a href="#">Feedback</a></li>
    				<li><a href="faq.html">FAQs</a></li>
    			</ul>
    		</div>
    		<div class="col-md-2 col_2">
    			<h4>Quick Links</h4>
    			<ul class="footer_links">
    				<li><a href="privacy.html">Privacy Policy</a></li>
    				<li><a href="terms.html">Terms and Conditions</a></li>
    				<li><a href="services.html">Services</a></li>
    			</ul>
    		</div>
    		<div class="col-md-2 col_2">
    			<h4>Social</h4>
    			<ul class="footer_social">
				  <li><a href="#"><i class="fa fa-facebook fa1"> </i></a></li>
				  <li><a href="#"><i class="fa fa-twitter fa1"> </i></a></li>
				  <li><a href="#"><i class="fa fa-google-plus fa1"> </i></a></li>
				  <li><a href="#"><i class="fa fa-youtube fa1"> </i></a></li>
			    </ul>
    		</div>
    		<div class="clearfix"> </div>
    		<div class="copy">
		       <p>Copyright � 2015 Marital . All Rights Reserved  | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
	        </div>
      </div>
</div>
</body>
</html>	
