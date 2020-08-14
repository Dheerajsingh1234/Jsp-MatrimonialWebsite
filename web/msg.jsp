<%-- 
    Document   : msg.jsp
    Created on : Sep 7, 2019, 9:47:48 PM
    Author     : dell
--%>

<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*,java.util.*"%>
<%
    String email=null;
    Cookie ct[]=request.getCookies();
    for(int i=0;i<ct.length;i++)
    {
        if(ct[i].getName().equals("user"))
         {
            email=ct[i].getValue();
        }
    }
    
   if(email!=null && session.getAttribute(email)!=null)
        {
            
          try
            { 
              // Date d=new Date();
              String msg = request.getParameter("msg");
              String tcode=request.getParameter("id");
              String fcode="",temail="";
              // String code=null;
              int sn=0;
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection cn =DriverManager.getConnection("Jdbc:Odbc:dheeraj");
                Statement st=cn.createStatement();
                Statement st1=cn.createStatement();
                Statement  st2=cn.createStatement();
                Statement st3=cn.createStatement();

                ResultSet rs = st.executeQuery("select * from webstudent where  Email='"+email+"'");
                if(rs.next())
                {
                   fcode=rs.getString(16);
                  //String sn= rs.getString(15);
                   
                   
                }
                else
                {
                    response.sendRedirect("index.jsp?invalid_email=1");
                    
                } 
              //  cn.close();
               // Statement st=cn.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from webstudent where code='"+tcode+"'");
                if(rs1.next())
                {
                     temail= rs1.getString(2);
                    
                }
                else
                 {
                    response.sendRedirect("viewprofile.jsp");
                }
               // cn.close();
                ResultSet rs2 = st3.executeQuery("select max(Sn) from inbox");
                 if(rs2.next())
                {
                    sn=rs2.getInt(1);
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
                
                st2.execute("insert into inbox values('"+sn+"','"+code+"','"+fcode+"','"+email+"','"+tcode+"','"+temail+"','"+msg+"')");  
                //out.print("done");msg.jsp
                response.sendRedirect("viewprofile.jsp?id="+fcode+"&&succ=1");
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
           else
            {
               response.sendRedirect("index.jsp");
           } 
    %>
      