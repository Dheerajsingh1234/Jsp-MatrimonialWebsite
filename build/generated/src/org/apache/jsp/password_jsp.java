package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class password_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

   
     Cookie c[]= request.getCookies();
     String email=null;
         
        for(int i=0;i<c.length;i++)
        {
            if(c[i].getName().equals("user"))
            {
                
                email =c[i].getValue();
            }    
        }
       
     if(email!=null && session.getAttribute(email)!=null)
      {
         if(request.getParameter("cp").length()==0 && request.getParameter("rp").length()==0 && request.getParameter("np").length()==0)
          {
              response.sendRedirect("password.jsp?err=1") ;
            }
         else
        { 
              String cp=request.getParameter("cp");
                    String np =request.getParameter("np");
                    String rp=request.getParameter("rp");
         
         try 
            {    
             
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection cn= DriverManager.getConnection("jdbc:odbc:dheeraj");
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery("select *from webstudent where email='"+email+"'");
               if(rs.next())  
               {
                   if(cp.equals(rs.getString("Password")))
                  {
                     if(np.equals(rp))
                        {
                            st.execute("update webstudent set password='"+np+"' where email='"+email+"'");
                            response.sendRedirect("index.jsp?succ=1");
                        }
                      else
                      {
                         response.sendRedirect("password.jsp?mismatch=1");
                      }
                         
                   }
                   else
                   {
                    response.sendRedirect("password.jsp?invalidcp=1") ;
                        
                   }    
                        
                     
                } 
                 else
                 {
                     response.sendRedirect("index.jsp?invalid_email=1");
                     
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
           }
         }
           else
            {
            response.sendRedirect("index.jsp");
            
            
           }   
   
      out.write("         \n");
      out.write("         \n");
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
