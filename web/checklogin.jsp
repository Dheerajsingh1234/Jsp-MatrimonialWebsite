3<%-- 
    Document   : check
    Created on : Jul 30, 2019, 5:55:40 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%
       // response.sendRedirect("profile.jsp");
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
           //  out.println(email);

    if(email==null)
     {
           
        if(request.getParameter("email").length()==0)
         {
            response.sendRedirect("index.jsp?email=1");
         } 
         else
         {
            email=request.getParameter("email");
         }
       }   
       if(request.getParameter("pass").length()==0)
         {
           response.sendRedirect("index.jsp?invalid=1");
         }
       else
        {
            String pass =  request.getParameter("pass");
             out.println(pass);
            try
           {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection cn =DriverManager.getConnection("jdbc:odbc:dheeraj");
                Statement st = cn.createStatement();
                out.println(email);
                ResultSet rs = st.executeQuery("select * from webstudent where  email='"+email+"'");
                  //response.sendRedirect("profile.jsp");
                if(rs.next())
                {
                    if(pass.equals(rs.getString("password")))
                     {
                        
                             Cookie ct= new Cookie("user",email);
                            ct.setMaxAge(100);
                            response.addCookie(ct);
                            session.setAttribute(email,pass);
                            session.setMaxInactiveInterval(100);
                            response.sendRedirect("profile.jsp");
                     } 
                      else
                     {
                        response.sendRedirect("login.jsp?invalid_pass=1");
                      }   
                    
                } 
                else
                {    
                    response.sendRedirect("index.jsp?invalid_email=1err");
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

     
    %> 