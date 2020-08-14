package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

      
     int id=0;
     if(request.getParameter("page")!=null)
      {
          id=Integer.parseInt(request.getParameter("page"));  
               
     }
     int n=5;
     int start=id*n;

            
          try
            { 
                Class.forName("com.mysql.jdbc.Driver");
               Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dheeraj","root","");
               //Connection cn=DriverManager.getConnection("Jdbc:Odbc:Dheeraj");
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from webstudent1 order by Sn limit"+start+","+n);
                while(rs.next())
                {
                    //out.print("profile");
                   
                   // out.println("name<input type='text' value='"+rs.getString(2)+"' name ='sname'><br>");
                    //out.println("avgr<input type ='number' value='"+rs.getString(3)+"'><br>");
                   // out.print("email<input type ='text' value='"+rs.getString(4)+"'>");
                      out.println("Name :"+rs.getString(1)+"<br>");
                      
                      out.println("FName :"+rs.getString(2)+"<br>");
                       out.println("Contact :"+rs.getString(3)+"<br>");
                        out.println("Gender :"+rs.getString(4)+"<br>"); 
                        out.println("Country :"+rs.getString(5)+"<br>");
                         out.println("Email :"+rs.getString(6)+"<br>");
                          out.println("Password :"+rs.getString(7)+"<br>");
                           
                        
                      out.println("<br><a href=edit.jsp>edit</a>");
                      out.print("<a href=delet.jsp>delet</a>");  
                      out.print("<a href=password.jsp> Change_password</a>");
                    
                   // response.sendRedirect("index.jsp?succ=1profile");
                     
                     
                         
                      
                }   
               
                cn.close();
          }
                
              
              catch(ClassNotFoundException er)
             {
                 out.print(er.getMessage());
             }
             catch(SQLException er)
             {
                 out.print(er.getMessage());
             }
         
        
    
  
      out.write("       ");
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
