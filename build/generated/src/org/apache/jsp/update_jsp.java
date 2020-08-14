package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    
  //  String sname=request.getParameter("name");
    
   // int avgr=Integer.parseInt(request.getParameter("avgr"));
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
     
  //  out.print(email);
    String name=request.getParameter("name");
    String gender=request.getParameter("gender");
    String dob=request.getParameter("dob");
    String cast=request.getParameter("cast");
    String hieght=request.getParameter("hieght");
    String religion=request.getParameter("religion");
    String education=request.getParameter("education");
    String location=request.getParameter("location");
    String marital=request.getParameter("marital");
     String country=request.getParameter("country");
      String state=request.getParameter("state");
      String age=request.getParameter("age");
   // out.print(session.getAttribute(email));
      if(email!=null && session.getAttribute(email)!=null)
        {
         try
           {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection cn =DriverManager.getConnection("jdbc:odbc:dheeraj");
                 PreparedStatement ps =cn.prepareStatement("update webstudent set Sname=?,Gender=?,DOB=?,Cast=?,Religion=?,Hieght=?,Location=?,Education=?,Marital_status=?,country=?,state=?,age=? where email=?");
                   ps.setString(1,name);
                   ps.setString(2,gender);
                   ps.setString(3,dob);
                    ps.setString(4,cast);
                    ps.setString(5,religion);
                   ps.setString(6,hieght);
                    ps.setString(7,location);
                   ps.setString(8,education);
                    ps.setString(10,country);
                    ps.setString(11,state);
                     ps.setString(9,marital);
                      ps.setString(12,age);
                    ps.setString(13,email);
                    
                    ps.execute();
                   cn.close();
                   response.sendRedirect("index.jsp?succ=1");
                    
             }
             
           catch(ClassNotFoundException er)
             {
                 out.print(er.getMessage());
             }
             catch(SQLException er)
             {
                 out.print(er.getMessage());
             }
        }
        else
        {
         response.sendRedirect("index.jsp?err=1");
           
        }  
 

      out.write("      \n");
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
