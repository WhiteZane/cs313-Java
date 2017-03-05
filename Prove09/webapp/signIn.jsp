<%-- 
    Document   : BadLogin
    Created on : Mar 4, 2017, 2:08 PM
    Author     : Zane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in</title>
    </head>
    <body>
                    <h1>Sign in to the discussion</h1>
                    
                    <form action="SignIn" method="POST">
                            <label for="username">Username:</label>
                            <input type="text" name="username" required><br><br>
                            <label for="password" >Password:</label>
                            <input type="password" name="password" required><br><br>
                        <input type="submit" value="Sign In">
                    </form>
                
            
        
    </body>
</html>
