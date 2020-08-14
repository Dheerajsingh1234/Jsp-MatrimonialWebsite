<%-- 
    Document   : logout
    Created on : Sep 2, 2019, 3:19:40 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String email=null;
    Cookie c[]=request.getCookies();
    for(int i=0;i<c.length;i++)
       {
         if(c[i].getName().equals("user"))
           {
             email=c[i].getValue();
         }
    }
     session.removeAttribute(email);
    Cookie ct=new Cookie("user",null);
     ct.setMaxAge(0);
    response.addCookie(ct);
   
   
    response.sendRedirect("index.jsp");
  %>