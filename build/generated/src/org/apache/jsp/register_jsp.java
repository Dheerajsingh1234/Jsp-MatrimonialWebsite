package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Marital an Wedding Category Flat Bootstarp Resposive Website Template | Register :: w3layouts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap-3.1.1.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>\n");
      out.write("<!----font-Awesome----->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!----font-Awesome----->\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".dropdown\").hover(            \n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideDown(\"fast\");\n");
      out.write("            $(this).toggleClass('open');        \n");
      out.write("        },\n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideUp(\"fast\");\n");
      out.write("            $(this).toggleClass('open');       \n");
      out.write("        }\n");
      out.write("    );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- ============================  Navigation Start =========================== -->\n");
      out.write(" <div class=\"navbar navbar-inverse-blue navbar\">\n");
      out.write("    <!--<div class=\"navbar navbar-inverse-blue navbar-fixed-top\">-->\n");
      out.write("      <div class=\"navbar-inner navbar-inner_1\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"navigation\">\n");
      out.write("             <nav id=\"colorNav\">\n");
      out.write("\t\t\t   <ul>\n");
      out.write("\t\t\t\t<li class=\"green\">\n");
      out.write("\t\t\t\t  <a href=\"#\" class=\"icon-home\"></a>\n");
      out.write("\t\t\t\t  <ul>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t   </ul>\n");
      out.write("             </nav>\n");
      out.write("           </div>\n");
      out.write("           <a class=\"brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>\n");
      out.write("           <div class=\"pull-right\">\n");
      out.write("          \t<nav class=\"navbar nav_bottom\" role=\"navigation\">\n");
      out.write(" \n");
      out.write("\t\t <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t  <div class=\"navbar-header nav_2\">\n");
      out.write("\t\t      <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">Menu\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t      </button>\n");
      out.write("\t\t      <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("\t\t   </div> \n");
      out.write("\t\t   <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t    <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t        <ul class=\"nav navbar-nav nav_1\">\n");
      out.write("\t\t            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t            <li><a href=\"Edit.jsp\">Edit</a></li>\n");
      out.write("\t\t    \t\t<li class=\"dropdown\">\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Matches<span class=\"caret\"></span></a>\n");
      out.write("\t\t              <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                <li><a href=\"matches.html\">New Matches</a></li>\n");
      out.write("\t\t                <li><a href=\"viewed-profile.html\">Who Viewed my Profile</a></li>\n");
      out.write("\t\t                <li><a href=\"viewed-not_contacted.html\">Viewed & not Contacted</a></li>\n");
      out.write("\t\t                <li><a href=\"members.html\">Premium Members</a></li>\n");
      out.write("\t\t                <li><a href=\"shortlisted.html\">Shortlisted Profile</a></li>\n");
      out.write("\t\t              </ul>\n");
      out.write("\t\t            </li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Search<span class=\"caret\"></span></a>\n");
      out.write("\t\t              <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                <li><a href=\"search.jsp\">Regular Search</a></li>\n");
      out.write("\t\t                <li><a href=\"profile.html\">Recently Viewed Profiles</a></li>\n");
      out.write("\t\t                <li><a href=\"search-id.html\">Search By Profile ID</a></li>\n");
      out.write("\t\t                <li><a href=\"faq.html\">Faq</a></li>\n");
      out.write("\t\t                <li><a href=\"shortcodes.html\">Shortcodes</a></li>\n");
      out.write("\t\t              </ul>\n");
      out.write("\t\t            </li>\n");
      out.write("\t\t            <li class=\"dropdown\">\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Messages<span class=\"caret\"></span></a>\n");
      out.write("\t\t              <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                <li><a href=\"inbox.html\">Inbox</a></li>\n");
      out.write("\t\t                <li><a href=\"inbox.html\">New</a></li>\n");
      out.write("\t\t                <li><a href=\"inbox.html\">Accepted</a></li>\n");
      out.write("\t\t                <li><a href=\"sent.html\">Sent</a></li>\n");
      out.write("\t\t                <li><a href=\"upgrade.html\">Upgrade</a></li>\n");
      out.write("\t\t              </ul>\n");
      out.write("\t\t            </li>\n");
      out.write("\t\t            <li class=\"last\"><a href=\"contact.html\">Contacts</a></li>\n");
      out.write("\t\t        </ul>\n");
      out.write("\t\t     </div><!-- /.navbar-collapse -->\n");
      out.write("\t\t    </nav>\n");
      out.write("\t\t   </div> <!-- end pull-right -->\n");
      out.write("          <div class=\"clearfix\"> </div>\n");
      out.write("        </div> <!-- end container -->\n");
      out.write("      </div> <!-- end navbar-inner -->\n");
      out.write("    </div> <!-- end navbar-inverse-blue -->\n");
      out.write("<!-- ============================  Navigation End ============================ -->\n");
      out.write("<div class=\"grid_3\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("   <div class=\"breadcrumb1\">\n");
      out.write("     \n");
      out.write("        <a href=\"index.jsp\"><i class=\"fa fa-home home_1\"></i></a>\n");
      out.write("        <span class=\"divider\">&nbsp;|&nbsp;</span>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("   </div>\n");
      out.write("   <div class=\"services\">\n");
      out.write("   \t  <div class=\"col-sm-6 login_left\">\n");
      out.write("\t     <form method=post action=\"check.jsp\">\n");
      out.write("                \n");
      out.write("\t\t      <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"edit-name\">Sn <span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t\t      <input type=\"number\" id=\"name\" name=\"sn\" value=\"\" size=\"20\" maxlength=\"20\"  class=\"form-text required\"> \n");
      out.write("                    \n");
      out.write("\t\t    </div>\n");
      out.write("\t  \t    <div class=\"form-group\">\n");
      out.write("\t\t      <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"edit-name\">Name <span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t\t      <input type=\"text\" id=\"name\" name=\"name\" value=\"\" size=\"20\" maxlength=\"20\"  class=\"form-text required\"> \n");
      out.write("                    \n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"edit-pass\">Password <span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t\t      <input type=\"password\" id=\"pass\" name=\"pass\" size=\"60\" maxlength=\"128\" class=\"form-text required\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"edit-email\">Email <span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t\t      <input type=\"text\" id=\"email\" name=\"email\" value=\"\" size=\"60\" maxlength=\"60\" class=\"form-text required\">\n");
      out.write("\t\t    </div>\n");
      out.write("              \n");
      out.write("                    <div class=\"form_group\">\n");
      out.write("                     <lable for=\"cast\"><strong>Cast</strong><span class=\"form-required\" title=\"this field is required\"<span>*</lable>\n");
      out.write("                     <input type=\"text\" id=\"cast\" name=\"cast\" value=\"\" size=\"60\" maxlength=\"60\" class=\"form-text required\">           \n");
      out.write("                     </div> \n");
      out.write("                        \n");
      out.write("                    <div class=\"form_group\">\n");
      out.write("                     <lable for=\"cast\"><strong>location*</strong><span class=\"form-required\" title=\"this field is required\"<span>*</lable>\n");
      out.write("                     <input type=\"text\" id=\"cast\" name=\"location\" value=\"\" size=\"60\" maxlength=\"60\" class=\"form-text required\">           \n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("\t\t     <div class=\"age_select\">\n");
      out.write("\t\t      <label for=\"edit-pass\">DOB<span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t\t        <div class=\"age_grid\">\n");
      out.write("                            \n");
      out.write("\t\t         <div class=\"col-sm-4 form_box\">\n");
      out.write("                  <div class=\"select-block1\">\n");
      out.write("                    <select name=\"date\">\n");
      out.write("\t                    <option value=\"Date\">Date</option>\n");
      out.write("\t                    <option value=\"1\">1</option>\n");
      out.write("\t                    <option value=\"2\">2</option>\n");
      out.write("\t                    <option value=\"3\">3</option>\n");
      out.write("\t                    <option value=\"4\">4</option>\n");
      out.write("\t                    <option value=\"5\">5</option>\n");
      out.write("\t                    <option value=\"67\">6</option>\n");
      out.write("\t                    <option value=\"7\">7</option>\n");
      out.write("\t                    <option value=\"8\">8</option>\n");
      out.write("\t                    <option value=\"9\">9</option>\n");
      out.write("\t                    <option value=\"10\">10</option>\n");
      out.write("\t                    <option value=\"11\">11</option>\n");
      out.write("\t                    <option value=\"12\">12</option>\n");
      out.write("\t                    <option value=\"13\">13</option>\n");
      out.write("\t                    <option value=\"14\">14</option>\n");
      out.write("\t                    <option value=\"15\">15</option>\n");
      out.write("\t                    <option value=\"16\">16</option>\n");
      out.write("\t                    <option value=\"17\">17</option>\n");
      out.write("\t                    <option value=\"18\">18</option>\n");
      out.write("\t                    <option value=\"19\">19</option>\n");
      out.write("\t                    <option value=\"20\">20</option>\n");
      out.write("\t                    <option value=\"21\">21</option>\n");
      out.write("\t                    <option value=\"22\">22</option>\n");
      out.write("\t                    <option value=\"24\">24</option>\n");
      out.write("\t                    <option value=\"25\">25</option>\n");
      out.write("\t                    <option value=\"26\">26</option>\n");
      out.write("\t                    <option value=\"27\">27</option>\n");
      out.write("\t                    <option value=\"28\">28</option>\n");
      out.write("\t                    <option value=\"29\">29</option>\n");
      out.write("\t                    <option value=\"30\">30</option>\n");
      out.write("\t                    <option value=\"31\">31</option>\n");
      out.write("                    </select>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4 form_box2\">\n");
      out.write("                   <div class=\"select-block1\">\n");
      out.write("                    <select name=\"month\">\n");
      out.write("\t                    <option value=\"Month\">Month</option>\n");
      out.write("\t                    <option value=\"January\">January</option>\n");
      out.write("\t                    <option value=\"February\">February</option>\n");
      out.write("\t                    <option value=\"March\">March</option>\n");
      out.write("\t                    <option value=\"April\">April</option>\n");
      out.write("\t                    <option value=\"May\">May</option>\n");
      out.write("\t                    <option value=\"June\">June</option>\n");
      out.write("\t                    <option value=\"July\">July</option>\n");
      out.write("\t                    <option value=\"August\">August</option>\n");
      out.write("\t                    <option value=\"September\">September</option>\n");
      out.write("\t                    <option value=\"October\">October</option>\n");
      out.write("\t                    <option value=\"November\">November</option>\n");
      out.write("\t                    <option value=\"December\">December</option>\n");
      out.write("                     </select>\n");
      out.write("                  </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-4 form_box1\">\n");
      out.write("                   <div class=\"select-block1\">\n");
      out.write("                    <select name=\"year\">\n");
      out.write("\t                    <option value=\"Year\">Year</option>\n");
      out.write("\t                    <option value=\"1990\">1980</option>\n");
      out.write("\t                    <option value=\"1981\">1981</option>\n");
      out.write("\t                    <option value=\"1982\">1982</option>\n");
      out.write("\t                    <option value=\"1983\">1983</option>\n");
      out.write("\t                    <option value=\"1984\">1984</option>\n");
      out.write("\t                    <option value=\"1985\">1985</option>\n");
      out.write("\t                    <option value=\"1986\">1986</option>\n");
      out.write("\t                    <option value=\"1987\">1987</option>\n");
      out.write("\t                    <option value=\"1988\">1988</option>\n");
      out.write("\t                    <option value=\"1989\">1989</option>\n");
      out.write("\t                    <option value=\"1990\">1990</option>\n");
      out.write("\t                    <option value=\"1991\">1991</option>\n");
      out.write("\t                    <option value=\"1992\">1992</option>\n");
      out.write("\t                    <option value=\"1993\">1993</option>\n");
      out.write("\t                    <option value=\"1994\">1994</option>\n");
      out.write("\t                    <option value=\"1995\">1995</option>\n");
      out.write("\t                    <option value=\"1996\">1996</option>\n");
      out.write("\t                    <option value=\"1997\">1997</option>\n");
      out.write("\t                    <option value=\"\">1998</option>\n");
      out.write("\t                    <option value=\"1998\">1999</option>\n");
      out.write("\t                    <option value=\"2000\">2000</option>\n");
      out.write("\t                    <option value=\"2001\">2001</option>\n");
      out.write("\t                    <option value=\"2002\">2002</option>\n");
      out.write("\t                    <option value=\"2003\">2003</option>\n");
      out.write("\t                    <option value=\"2004\">2004</option>\n");
      out.write("\t                    <option value=\"\">2005</option>\n");
      out.write("\t                    <option value=\"\">2006</option>\n");
      out.write("\t                    <option value=\"\">2007</option>\n");
      out.write("\t                    <option value=\"\">2008</option>\n");
      out.write("\t                    <option value=\"\">2009</option>\n");
      out.write("\t                    <option value=\"\">2010</option>\n");
      out.write("\t                    <option value=\"\">2011</option>\n");
      out.write("\t                    <option value=\"\">2012</option>\n");
      out.write("\t                    <option value=\"\">2013</option>\n");
      out.write("\t                    <option value=\"\">2014</option>\n");
      out.write("\t                    <option value=\"\">2015</option>\n");
      out.write("                     </select>\n");
      out.write("                   </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"clearfix\"> </div>\n");
      out.write("                 </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group form-group1\">\n");
      out.write("                <label class=\"col-sm-7 control-lable\" >Sex : </label>\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <div class=\"radios\">\n");
      out.write("\t\t\t\t        <label  class=\"label_radio\">\n");
      out.write("\t\t\t\t            <input type=\"radio\" value=\"male\" name =\"sex\"checked=\"\"> Male\n");
      out.write("\t\t\t\t        </label>\n");
      out.write("\t\t\t\t        <label  class=\"label_radio\">\n");
      out.write("\t\t\t\t            <input type=\"radio\" value=\"female\" name=\"sex\"> Female\n");
      out.write("\t\t\t\t        </label>\n");
      out.write("\t                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("             </div>\n");
      out.write("                   </div>\n");
      out.write("                <div class=\"form_but1\">\n");
      out.write("                 <h4><Strong>Height*</strong></h4>\n");
      out.write("                <input type=\"text\" id=\"height\" name=\"height\" value=\"\" size=\"20\" maxlength=\"20\"  class=\"form-text required\" required> \n");
      out.write("                </div>\n");
      out.write("               <div class=\"form_but1\">\n");
      out.write("                    <h4><Strong>Age*</strong></h4>\n");
      out.write("                <input type=\"text\"  name=\"age\" value=\"\" size=\"20\" maxlength=\"20\"  class=\"form-text required\" required> \n");
      out.write("                </div>\n");
      out.write("               <div class=\"form_but1\">\n");
      out.write("                    <label class=\"col-sm-5 control-lable1\" >Marital Status* </label>\n");
      out.write("                    \n");
      out.write("                      <div class=\"select-block1\">\n");
      out.write("                        <select name=\"status\"  >\n");
      out.write("                            <option value=\"Married\">Married</option>\n");
      out.write("                            <option value=\"Divorced\">Divorced</option>\n");
      out.write("                            <option value=\"Separated\">Separated</option>\n");
      out.write("                            <option value=\"Single\">Single</option>\n");
      out.write("                            \n");
      out.write("                        </select>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                   \n");
      out.write("\t\t\t <div class=\"clearfix\"> </div>\n");
      out.write("                 <div class=\"form_but1\">\n");
      out.write("                    <label class=\"col-sm-5 control-lable1\" for=\"sex\">Country* </label>\n");
      out.write("                    \n");
      out.write("                      <div class=\"select-block1\">\n");
      out.write("                        <select name=\"country\"  maxlength=\"20\" class=\"form-text required\" required>\n");
      out.write("                            <option value=\"\">Country</option>\n");
      out.write("                            <option value=\"Japan\">Japan</option>\n");
      out.write("                            <option value=\"India\">india</option>\n");
      out.write("                            <option value=\"Dubai\">Dubai</option>\n");
      out.write("                            <option value=\"Italy\">Italy</option>\n");
      out.write("                        <option value=\"Greece\">Greece</option> \n");
      out.write("                        <option value=\"Iceland\">Iceland</option> \n");
      out.write("                        <option value=\"China\">China</option> \n");
      out.write("                        <option value=\"Doha\">Doha</option> \n");
      out.write("                        <option value=\"Irland\">Irland</option> \n");
      out.write("                        <option value=\"Srilanka\">Srilanka</option>\n");
      out.write("                        </select>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                          <div>  \n");
      out.write("                 <h4><Strong>Education*</strong></h4>\n");
      out.write("                <input type=\"text\" id=\"education\" name=\"education\" value=\"\" size=\"20\" maxlength=\"20\"  class=\"form-text required\" required> \n");
      out.write("               </div> \n");
      out.write("                         <div class=\"form_but1\">\n");
      out.write("                            <label class=\"col-sm-5 control-lable1\" for=\"sex\">Religion : </label>\n");
      out.write("                            <div >\n");
      out.write("                              <div class=\"select-block1\">\n");
      out.write("                                <select name=\"religion\">\n");
      out.write("                                    <option value=\"Hindu\">Hindu</option>\n");
      out.write("                                    <option value=\"Sikh\">Sikh</option>\n");
      out.write("                                    <option value=\"Jain-All\">Jain-All</option>\n");
      out.write("                                    <option value=\"Jain-Digambar\">Jain-Digambar</option>\n");
      out.write("                                    <option value=\"Jain-Others\">Jain-Others</option>\n");
      out.write("                                    <option value=\"Muslim-All\">Muslim-All</option> \n");
      out.write("                                    <option value=\"Muslim-Shia\">Muslim-Shia</option> \n");
      out.write("                                    <option value=\"Muslim-Sunni\">Muslim-Sunni</option> \n");
      out.write("\n");
      out.write("                                    <option value=\"Christian-All\">Christian-All</option> \n");
      out.write("                                    <option value=\"Christian-Catholic\">Christian-Catholic</option> \n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("    <div class=\"clearfix\"> </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("                <div class=\"form_but1\">\n");
      out.write("                    <label class=\"col-sm-5 control-lable1\" for=\"sex\">State* </label>\n");
      out.write("                    \n");
      out.write("                   <div class=\"select-block1\">\n");
      out.write("                        <select name=\"state\"  maxlength=\"20\" class=\"form-text required\" required>\n");
      out.write("                            <option value=\"\">State</option>\n");
      out.write("                            <option value=\"Japan\">Rajsthan</option>\n");
      out.write("                            <option value=\"Utter pradesh\">Utter pradesh</option>\n");
      out.write("                            <option value=\"Mubai\">Mumbai</option>\n");
      out.write("                            <option value=\"Haryana\">Haryana</option>\n");
      out.write("                        <option value=\"Delhi\">Delhi</option> \n");
      out.write("                        <option value=\"Maharastra\">Maharastra</option> \n");
      out.write("                        <option value=\"Chennai\">Chennai</option>\n");
      out.write("                         </select>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t  <div class=\"form-actions\">\n");
      out.write("\t\t\t    <input type=\"submit\" id=\"edit-submit\" name=\"submit\" value=\"Submit\" class=\"btn_1 submit\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("                       \n");
      out.write("\t\t </form>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-sm-6\">\n");
      out.write("\t     <ul class=\"sharing\">\n");
      out.write("\t\t\t<li><a href=\"#\" class=\"facebook\" title=\"Facebook\"><i class=\"fa fa-boxed fa-fw fa-facebook\"></i> Share on Facebook</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"twitter\" title=\"Twitter\"><i class=\"fa fa-boxed fa-fw fa-twitter\"></i> Tweet</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"google\" title=\"Google\"><i class=\"fa fa-boxed fa-fw fa-google-plus\"></i> Share on Google+</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"linkedin\" title=\"Linkedin\"><i class=\"fa fa-boxed fa-fw fa-linkedin\"></i> Share on LinkedIn</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"mail\" title=\"Email\"><i class=\"fa fa-boxed fa-fw fa-envelope-o\"></i> E-mail</a></li>\n");
      out.write("\t\t </ul>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"clearfix\"> </div>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"map\">\n");
      out.write("\t<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978\"> </iframe>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"col-md-4 col_2\">\n");
      out.write("    \t\t\t<h4>About Us</h4>\n");
      out.write("    \t\t\t<p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.\"</p>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"col-md-2 col_2\">\n");
      out.write("    \t\t\t<h4>Help & Support</h4>\n");
      out.write("    \t\t\t<ul class=\"footer_links\">\n");
      out.write("    \t\t\t\t<li><a href=\"#\">24x7 Live help</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"contact.html\">Contact us</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"#\">Feedback</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"faq.html\">FAQs</a></li>\n");
      out.write("    \t\t\t</ul>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"col-md-2 col_2\">\n");
      out.write("    \t\t\t<h4>Quick Links</h4>\n");
      out.write("    \t\t\t<ul class=\"footer_links\">\n");
      out.write("    \t\t\t\t<li><a href=\"privacy.html\">Privacy Policy</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"terms.html\">Terms and Conditions</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"services.html\">Services</a></li>\n");
      out.write("    \t\t\t</ul>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"col-md-2 col_2\">\n");
      out.write("    \t\t\t<h4>Social</h4>\n");
      out.write("    \t\t\t<ul class=\"footer_social\">\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-facebook fa1\"> </i></a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-twitter fa1\"> </i></a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-google-plus fa1\"> </i></a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-youtube fa1\"> </i></a></li>\n");
      out.write("\t\t\t    </ul>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"clearfix\"> </div>\n");
      out.write("    \t\t<div class=\"copy\">\n");
      out.write("\t\t       <p>Copyright © 2015 Marital . All Rights Reserved  | Design by <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t        </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
