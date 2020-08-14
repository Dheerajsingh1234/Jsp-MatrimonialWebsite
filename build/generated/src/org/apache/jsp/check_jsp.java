package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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

           
                String name =  request.getParameter("name");
                // String code =  request.getParameter("id");
               //  int sn =  Integer.parseInt(request.getParameter("sn"));
               String date =  request.getParameter("date"); 
                String gender =  request.getParameter("sex"); 
               String state =  request.getParameter("state"); 
                String email =  request.getParameter("email"); 
                String age =  request.getParameter("age"); 
                String height =  request.getParameter("height"); 
                String marital =  request.getParameter("status"); 
              String location =  request.getParameter("location"); 
              String education =  request.getParameter("education"); 
                  String month =  request.getParameter("month"); 
                    String year =  request.getParameter("year");
                      String cast =  request.getParameter("cast"); 
                      String country= request.getParameter("country");
                    String religion =  request.getParameter("religion");
                String password =  request.getParameter("pass"); 
              
                      
                     
                    
                                //  out.print(month);






            if(request.getParameter("name")==null|| request.getParameter("status")==null|| request.getParameter("email")==null || request.getParameter("sex")==null || request.getParameter("age")==null|| request.getParameter("month")==null || request.getParameter("year")==null || request.getParameter("cast")==null || request.getParameter("religion")==null || request.getParameter("pass")==null|| request.getParameter("date")==null|| request.getParameter("country")==null|| request.getParameter("state")==null)
                {
                    
                    response.sendRedirect("register.jsp");
                }  
              else  
                {
               try   
               {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection cn =DriverManager.getConnection("jdbc:odbc:dheeraj");
                Statement st = cn.createStatement();
         
                int sn=0;
                ResultSet rs = st.executeQuery("select max(Sn) from webstudent");
                if(rs.next())
                {
                    sn=rs.getInt(1);
                }
                  sn=sn+1; 
                  String code ="";
                  LinkedList l=new LinkedList();
                  for(char c='a';c<='z';c++)
                   {
                      l.add(c+"");
                  }
                  for(char c='A';c<='Z';c++)
                   {
                      l.add(c+"");
                      
                  }
                  for(int i =0 ;i<=9;i++)
                {
                        l.add(i+"");
                    }
                  Collections.shuffle(l);
                  for(int i=0;i<=9;i++)
                   {
                      code=code+l.get(i);
                  }
                  code=code+"_"+sn;
                 
                       
              
            //    String name="sheeraj";
                st.execute("insert into webstudent values('"+name+"','"+email+"','"+password+"','"+gender+"','"+date+'/'+month+'/'+year+"','"+cast+"','"+religion+"','"+height+"','"+marital+"','"+location+"','"+education+"','"+country+"','"+state+"','"+age+"','"+sn+"','"+code+"')");
                         cn.close(); 
                   response.sendRedirect("login.jsp");     
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
         //<form method=post action ="login1.jsp">    
    
      out.write("\n");
      out.write("  ");
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
