<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<html>
<head>
    <title>Form</title>
</head>
<body>

<h1>
   Player details
</h1>
<p>
Player name: ${player.name}
<br>
Player country: ${player.country}
<br>
Player designation: ${player.designation}
<br>

<b>DOB: </b>
<fmt:formatDate value="${player.dob}" type="date" pattern="dd-MM-YYYY" />


<br>
Player email: ${player.email}
</p>


</body>
</html>