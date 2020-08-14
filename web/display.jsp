<%-- 
    Document   : profile
    Created on : Jul 30, 2019, 5:57:56 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*,java.util.*"%>
<%
      
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
         
        
    
  %>       