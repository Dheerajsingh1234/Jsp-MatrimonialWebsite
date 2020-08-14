package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class search1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
  
          String email=null;
     Cookie c[]=request.getCookies();
     for(int i =0; i<c.length;i++)
      {
         if(c[i].getName().equals("user"))
          {
                email=c[i].getValue();
                 break;
             
         }  
     }
      String gender= request.getParameter("sex");
           
            String religion=request.getParameter("religion");
            String cast=request.getParameter("cast");
            
       
 //   out.print(email);
   if(email==null && session.getAttribute(email)==null)
   {
       response.sendRedirect("index.jsp");
     }
  else
   {

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Marital an Wedding Category Flat Bootstarp Resposive Website Template | Profile :: w3layouts</title>\n");
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
      out.write("\t\t\t\t\t<a href=\"#\" class=\"icon-home\"></a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t    <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
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
      out.write("\t\t            <li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t            <li><a href=\"about.html\">About</a></li>\n");
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
      out.write("\t\t                <li><a href=\"inbox.jsp\">Inbox</a></li>\n");
      out.write("\t\t                <li><a href=\"inbox.jsp\">New</a></li>\n");
      out.write("\t\t                <li><a href=\"inbox.jsp\">Accepted</a></li>\n");
      out.write("\t\t                <li><a href=\"sent.jsp\">Sent</a></li>\n");
      out.write("\t\t                <li><a href=\"upgrade.jsp\">Upgrade</a></li>\n");
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
      out.write("      <ul>\n");
      out.write("        <a href=\"index.html\"><i class=\"fa fa-home home_1\"></i></a>\n");
      out.write("        <span class=\"divider\">&nbsp;|&nbsp;</span>\n");
      out.write("        <li class=\"current-page\">Profile</li>\n");
      out.write("      </ul>\n");
      out.write("   </div>\n");
      out.write("  <div class=\"col-md-9 profile_left1\">\n");
      out.write("  \t<h1>Recently Viewed Profile</h1>\n");
      out.write("    <div class=\"profile_top\"><a href=\"viewprofile.jsp\">\n");
      out.write("      <h2>254879</h2>\n");
      out.write("\t    <div class=\"col-sm-3 profile_left-top\">\n");
      out.write("\t    \t<img src=\"images/p13.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-3\">\n");
      out.write("\t      <ul class=\"login_details1\">\n");
      out.write("\t\t\t <li>Last Login : 5 days ago</li>\n");
      out.write("\t\t\t <li><p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.\" More....</p></li>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t     ");

                try
               {

           
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection cn =DriverManager.getConnection("jdbc:odbc:dheeraj");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from webstudent where Gender='"+gender+"'");
                 while(rs.next())
                {
            
                
      out.write("\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <table class=\"table_working_hours\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                            <tr class=\"opened_1\">\n");
      out.write("                                                            <td class=\"day_label1\">name :</td>\n");
      out.write("                                                            <td class=\"day_value\">");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                <tr class=\"opened\">\n");
      out.write("                                                            <td class=\"day_label1\">Age</td>\n");
      out.write("                                                            <td class=\"day_value\">");
      out.print( rs.getString(14));
      out.write("</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                <tr class=\"opened\">\n");
      out.write("                                                            <td class=\"day_label1\">Education</td>\n");
      out.write("                                                            <td class=\"day_value\">");
      out.print( rs.getString(11));
      out.write("</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                <tr class=\"opened\">\n");
      out.write("                                                            <td class=\"day_label1\">Location</td>\n");
      out.write("                                                            <td class=\"day_value\">");
      out.print( rs.getString(10));
      out.write("</td>\n");
      out.write("                                                    </tr>\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("\t\t   </table>\n");
      out.write("                \n");
      out.write("\t\t   </div><div>\n");
      out.write("               <form method=post action=\"viewprofile.jsp?id=");
      out.print(rs.getString(16));
      out.write("\">                                \n");
      out.write("\t\t   <div class=\"buttons\">\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Mail</div>\n");
      out.write("                         <div class=\"form-actions\">\n");
      out.write("\t\t\t    <input type=\"submit\"  value = \"view profile\" class=\"btn_1 submit\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("                          </div>\n");
      out.write("\t\t</form>\t  \n");
      out.write("                    \n");
      out.write("                   </div>\n");
      out.write("                                                    \n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("           \n");
      out.write("   </div>\n");
      out.write("           \n");
      out.write("                   </a>\n");
      out.write("           ");

                
                  }
                cn.close();          
              } 
            
              catch(ClassNotFoundException er)
             {
                  out.print("Exception "+er.getMessage());
             }
              catch(SQLException er)
             {
                  out.print("SQL "+er.getMessage());
             }
       
                
      out.write("\n");
      out.write("    <div class=\"profile_top\"><a href=\"view_profile.html\">\n");
      out.write("      <h2>254879</h2>\n");
      out.write("\t    <div class=\"col-sm-3 profile_left-top\">\n");
      out.write("\t    \t<img src=\"images/p15.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-3\">\n");
      out.write("\t      <ul class=\"login_details1\">\n");
      out.write("\t\t\t <li>Last Login : 5 days ago</li>\n");
      out.write("\t\t\t <li><p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.\" More....</p></li>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-6\">\n");
      out.write("\t    \t<table class=\"table_working_hours\">\n");
      out.write("\t        \t<tbody>\n");
      out.write("\t        \t\t<tr class=\"opened_1\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Age / Height :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">28, 5ft 5in / 163cm</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Last Login :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">4 hours ago</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Religion :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Sikh</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Marital Status :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Single</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Location :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">India</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Profile Created by :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Self</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Education :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Engineering</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t    </tbody>\n");
      out.write("\t\t   </table>\n");
      out.write("\t\t   <div class=\"buttons\">\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Mail</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Shortlisted</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Interest</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("    </a></div>\n");
      out.write("    <div class=\"profile_top\"><a href=\"view_profile.html\">\n");
      out.write("      <h2>254879</h2>\n");
      out.write("\t    <div class=\"col-sm-3 profile_left-top\">\n");
      out.write("\t    \t<img src=\"images/p16.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-3\">\n");
      out.write("\t      <ul class=\"login_details1\">\n");
      out.write("\t\t\t <li>Last Login : 5 days ago</li>\n");
      out.write("\t\t\t <li><p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.\" More....</p></li>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-6\">\n");
      out.write("\t    \t<table class=\"table_working_hours\">\n");
      out.write("\t        \t<tbody>\n");
      out.write("\t        \t\t<tr class=\"opened_1\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Age / Height :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">28, 5ft 5in / 163cm</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Last Login :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">4 hours ago</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Religion :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Sikh</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Marital Status :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Single</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Location :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">India</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Profile Created by :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Self</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Education :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Engineering</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t    </tbody>\n");
      out.write("\t\t   </table>\n");
      out.write("\t\t   <div class=\"buttons\">\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Mail</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Shortlisted</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Interest</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("    </a></div>\n");
      out.write("    <div class=\"profile_top\"><a href=\"view_profile.html\">\n");
      out.write("      <h2>254879</h2>\n");
      out.write("\t    <div class=\"col-sm-3 profile_left-top\">\n");
      out.write("\t    \t<img src=\"images/p17.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-3\">\n");
      out.write("\t      <ul class=\"login_details1\">\n");
      out.write("\t\t\t <li>Last Login : 5 days ago</li>\n");
      out.write("\t\t\t <li><p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.\" More....</p></li>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-6\">\n");
      out.write("\t    \t<table class=\"table_working_hours\">\n");
      out.write("\t        \t<tbody>\n");
      out.write("\t        \t\t<tr class=\"opened_1\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Age / Height :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">28, 5ft 5in / 163cm</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Last Login :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">4 hours ago</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Religion :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Sikh</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Marital Status :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Single</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Location :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">India</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Profile Created by :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Self</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Education :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Engineering</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t    </tbody>\n");
      out.write("\t\t   </table>\n");
      out.write("\t\t   <div class=\"buttons\">\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Mail</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Shortlisted</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Interest</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("    </a></div>\n");
      out.write("    <div class=\"profile_top profile_top1\"><a href=\"view_profile.html\">\n");
      out.write("      <h2>254879</h2>\n");
      out.write("\t    <div class=\"col-sm-3 profile_left-top\">\n");
      out.write("\t    \t<img src=\"images/s1.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-3\">\n");
      out.write("\t      <ul class=\"login_details1\">\n");
      out.write("\t\t\t <li>Last Login : 5 days ago</li>\n");
      out.write("\t\t\t <li><p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.\" More....</p></li>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"col-sm-6\">\n");
      out.write("\t    \t<table class=\"table_working_hours\">\n");
      out.write("\t        \t<tbody>\n");
      out.write("\t        \t\t<tr class=\"opened_1\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Age / Height :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">28, 5ft 5in / 163cm</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Last Login :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">4 hours ago</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Religion :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Sikh</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Marital Status :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">Single</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"opened\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Location :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value\">India</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Profile Created by :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Self</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t    <tr class=\"closed\">\n");
      out.write("\t\t\t\t\t\t<td class=\"day_label1\">Education :</td>\n");
      out.write("\t\t\t\t\t\t<td class=\"day_value closed\"><span>Engineering</span></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t    </tbody>\n");
      out.write("\t\t   </table>\n");
      out.write("\t\t   <div class=\"buttons\">\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Mail</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Shortlisted</div>\n");
      out.write("\t\t\t   <div class=\"vertical\">Send Interest</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("    </a></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-3 match_right\">\n");
      out.write("\t<div class=\"profile_search1\">\n");
      out.write("\t   <form>\n");
      out.write("\t\t  <input type=\"text\" class=\"m_1\" name=\"ne\" size=\"30\" required=\"\" placeholder=\"Enter Profile ID :\">\n");
      out.write("\t\t  <input type=\"submit\" value=\"Go\">\n");
      out.write("\t   </form>\n");
      out.write("   </div>\n");
      out.write("   <section class=\"slider\">\n");
      out.write("\t <h3>Happy Marriage</h3>\n");
      out.write("\t <div class=\"flexslider\">\n");
      out.write("\t\t<ul class=\"slides\">\n");
      out.write("\t\t  <li>\n");
      out.write("\t\t\t<img src=\"images/s2.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t<h4>Lorem & Ipsum</h4>\n");
      out.write("\t\t\t<p>It is a long established fact that a reader will be distracted by the readable</p>\n");
      out.write("\t\t  </li>\n");
      out.write("\t\t  <li>\n");
      out.write("\t\t\t<img src=\"images/s1.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t<h4>Lorem & Ipsum</h4>\n");
      out.write("\t\t\t<p>It is a long established fact that a reader will be distracted by the readable</p>\n");
      out.write("\t\t  </li>\n");
      out.write("\t\t  <li>\n");
      out.write("\t\t\t<img src=\"images/s3.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t<h4>Lorem & Ipsum</h4>\n");
      out.write("\t\t\t<p>It is a long established fact that a reader will be distracted by the readable</p>\n");
      out.write("\t\t  </li>\n");
      out.write("\t    </ul>\n");
      out.write("\t  </div>\n");
      out.write("   </section>\n");
      out.write("   <div class=\"view_profile view_profile2\">\n");
      out.write("        \t<h3>View Similar Profiles</h3>\n");
      out.write("        \t<ul class=\"profile_item\">\n");
      out.write("        \t  <a href=\"#\">\n");
      out.write("        \t   <li class=\"profile_item-img\">\n");
      out.write("        \t   \t  <img src=\"images/p5.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <li class=\"profile_item-desc\">\n");
      out.write("        \t   \t  <h4>2458741</h4>\n");
      out.write("        \t   \t  <p>29 Yrs, 5Ft 5in Christian</p>\n");
      out.write("        \t   \t  <h5>View Full Profile</h5>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <div class=\"clearfix\"> </div>\n");
      out.write("        \t  </a>\n");
      out.write("           </ul>\n");
      out.write("           <ul class=\"profile_item\">\n");
      out.write("        \t  <a href=\"#\">\n");
      out.write("        \t   <li class=\"profile_item-img\">\n");
      out.write("        \t   \t  <img src=\"images/p6.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <li class=\"profile_item-desc\">\n");
      out.write("        \t   \t  <h4>2458741</h4>\n");
      out.write("        \t   \t  <p>29 Yrs, 5Ft 5in Christian</p>\n");
      out.write("        \t   \t  <h5>View Full Profile</h5>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <div class=\"clearfix\"> </div>\n");
      out.write("        \t  </a>\n");
      out.write("           </ul>\n");
      out.write("           <ul class=\"profile_item\">\n");
      out.write("        \t  <a href=\"#\">\n");
      out.write("        \t   <li class=\"profile_item-img\">\n");
      out.write("        \t   \t  <img src=\"images/p7.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <li class=\"profile_item-desc\">\n");
      out.write("        \t   \t  <h4>2458741</h4>\n");
      out.write("        \t   \t  <p>29 Yrs, 5Ft 5in Christian</p>\n");
      out.write("        \t   \t  <h5>View Full Profile</h5>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <div class=\"clearfix\"> </div>\n");
      out.write("        \t  </a>\n");
      out.write("           </ul>\n");
      out.write("           <ul class=\"profile_item\">\n");
      out.write("        \t  <a href=\"#\">\n");
      out.write("        \t   <li class=\"profile_item-img\">\n");
      out.write("        \t   \t  <img src=\"images/p8.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <li class=\"profile_item-desc\">\n");
      out.write("        \t   \t  <h4>2458741</h4>\n");
      out.write("        \t   \t  <p>29 Yrs, 5Ft 5in Christian</p>\n");
      out.write("        \t   \t  <h5>View Full Profile</h5>\n");
      out.write("        \t   </li>\n");
      out.write("        \t   <div class=\"clearfix\"> </div>\n");
      out.write("        \t  </a>\n");
      out.write("           </ul>\n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"clearfix\"> </div>\n");
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
      out.write("\t\t      <p>Copyright © 2015 Marital . All Rights Reserved  | Design by <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t        </div>\n");
      out.write("    \t</div>\n");
      out.write("</div>\n");
      out.write("<!-- FlexSlider -->\n");
      out.write("<link href=\"css/flexslider.css\" rel='stylesheet' type='text/css' />\n");
      out.write("  <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t  SyntaxHighlighter.all();\n");
      out.write("\t});\n");
      out.write("\t$(window).load(function(){\n");
      out.write("\t  $('.flexslider').flexslider({\n");
      out.write("\t\tanimation: \"slide\",\n");
      out.write("\t\tstart: function(slider){\n");
      out.write("\t\t  $('body').removeClass('loading');\n");
      out.write("\t\t}\n");
      out.write("\t  });\n");
      out.write("\t});\n");
      out.write("  </script>\n");
      out.write("<!-- FlexSlider -->\n");
      out.write("</body>\n");
      out.write("</html>\t\n");

        }   
    
   
      out.write(' ');
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
