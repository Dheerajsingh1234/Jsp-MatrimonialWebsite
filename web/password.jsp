<%-- 
    Document   : changepass
    Created on : Jul 31, 2019, 1:15:34 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%
   
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
   %>         
         
