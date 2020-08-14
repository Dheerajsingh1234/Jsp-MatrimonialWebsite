<%-- 
    Document   : password
    Created on : Jul 31, 2019, 1:06:35 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form method=post action="password.jsp">
            current_password<input type="password" name="cp" required ><br>
            new_password<input type="password" name="np" required><br>
            Retype_password<input type="password" name="rp" required><br>
            <input type="submit" value="change_password">
 </form>
