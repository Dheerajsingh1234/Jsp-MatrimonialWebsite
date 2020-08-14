<%-- 
    Document   : update
    Created on : Jul 31, 2019, 12:43:27 AM
    Author     : dell
--%>
<%@page  import="java.sql.*,java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
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
 
%>      
