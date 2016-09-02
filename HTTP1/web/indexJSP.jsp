<%-- 
    Document   : indexJSP
    Created on : 01-09-2016, 15:51:51
    Author     : Philip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style="width:100%" border="5">
            <tr>   
                <th>Host:</th>
                <th><%=request.getHeader("host")%></th>
            </tr>
            <tr>
                <th>Connection:</th>
                <th><%=request.getHeader("connection")%></th>
            </tr>
            <tr>
                <th>Cache-control:</th>
                <th><%=request.getHeader("cache-control")%></th>
            </tr>
            <tr>
                <th>Accept:</th>
                <th><%=request.getHeader("accept")%></th>
            </tr>
            <tr>
                <th>User-agent:</th>
                <th><%=request.getHeader("user-agent")%></th>
            </tr>
            <tr>
                <th>Accept-encoding:</th>
                <th><%=request.getHeader("accept-encoding")%></th>
            </tr>
            <tr>
                <th>Accept-language</th>
                <th><%=request.getHeader("accept-language")%></th>
            </tr>

        </table>
    </body>
</html>
