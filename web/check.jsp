<%-- 
    Document   : check
    Created on : Aug 4, 2019, 7:13:20 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*,java.util.*" %>
<%
           
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
    %>
  