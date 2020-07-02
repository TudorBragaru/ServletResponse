<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Servlet Response</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">

            <caption><h2>Lucky Numbers</caption>



             <c:forEach var="number" items="${listaNumere}">

                <tr>
                    <td><c:out value="${number}"/></td>
                <tr/>
            </c:forEach>
        </table>
    </div>

</body>
</html>