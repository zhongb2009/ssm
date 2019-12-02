<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2019/11/27
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>账户</title>
</head>
<body>

    <h3>查询所有的账户</h3>

<%--
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
--%>

    <table border="1" width="300px">
        <tr>
            <th>编号</th>
            <th>账户名称</th>
            <th>账户金额（rmb）</th>
        </tr>
        <c:forEach items="${list}" var="account" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
