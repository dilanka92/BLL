<%-- 
    Document   : index
    Created on : 18-Jul-2015, 11:23:40
    Author     : Dilanka
--%>

<%@page import="java.util.List"%>
<%@page import="DLL.DLLService"%>
<%@page import="DLL.DLLService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        DLLService_Service service = new DLLService_Service(); 
        DLLService proxy = service.getDLLServicePort();
        
//        //out.print(proxy.login("dilanka"));
//        List<String> User = proxy.login("dilanka");
//        
//        out.println("User ID: "+User.get(0)+"<br>");
//        out.println("User Password: "+User.get(1)+"<br>");
//        out.println("User UserType "+User.get(2)+"<br>");
//        out.println("User Branch "+User.get(3)+"<br>");
//        //out.println("User branch: "+User.get(4));
////        
////        for (int i=0;i<User.size();i++)
////          {
////
////              out.println(User.get(i));
////
////          }
        %>
    </body>
</html>
