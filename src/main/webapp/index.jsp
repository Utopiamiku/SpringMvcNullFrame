<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
</head>
<body>
Utopiamiku


<script src="static/jquery-3.5.1.min.js"></script>
<script>
    $(function (){
        $.ajax({
            url:"user/demo",
            dataType:"json",
            type:"post",
            success:function (data) {
                console.log(data)
            }
        })
    })
</script>
</body>
</html>