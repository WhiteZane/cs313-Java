<%-- 
    Document   : viewPost
    Created on : Mar 4, 2017, 2:08 PM
    Author     : Zane
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body>
                        <p>${username} is signed in.</p>
                    
                    <h1>View Posts</h1>
                    
                    <a href="addPost.jsp" >Create a New Post</a>
                    
                    <c:forEach var="Post" items="${posts}" >
                        <p><strong>Post:</strong> ${post.entry}</p>
                        <p>user: ${post.username} <br> date:${post.date} </p>
                    </c:forEach>
              
    </body>
</html>
