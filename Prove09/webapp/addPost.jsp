<%-- 
    Document   : addPost
    Created on : Mar 4, 2017, 2:08 PM
    Author     : Zane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Post</title>
    </head>
    <body>
                <p>${username} is signed in</p>
                    <h1>Add a new post</h1>
                    

                    <form action="NewPost" method="POST">
                            <label for="entry" >Post entry:</label>
                            <textarea name="entry"></textarea><br><br>
                            <input type="hidden" id="username" name="username" value="${username}"></input>
                        <input type="submit" value="Submit Post">
                    </form><br>
               <a href="ViewPosts">View Posts</a>
            
        
    </body>
</html>
