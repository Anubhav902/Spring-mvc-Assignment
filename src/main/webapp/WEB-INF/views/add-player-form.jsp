<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri= "http://www.springframework.org/tags/form" %>

<html>
<head>
    <style>
        .error{
            color:red;
            font-style: italic;
        }
    </style>
    <title>An Athlete</title>
</head>
<body>

<h1>
   Player Form
</h1>
<form:form action="showPlayerDetails" modelAttribute="player">

<lable>Name</lable>

<form:input path="name"/>

<form:errors path="name" cssClass="error"/>

<form:select path = "country">
  <form:option label = "IND" value = "India"/>
  <form:option label = "AUS" value = "Australia"/>
  <form:option label = "FR" value="France"/>
</form:select>

<label>designation</label>
<form:input path="Designation"/>

<form:errors path="designation" cssClass="error"/>
<br><br>



<label>DOB</label>
<form:input path="dob" />

<form:errors path="dob" cssClass="error"/>
<br><br>
<label>Email</label>
<form:input path="email" />

<form:errors path="email" cssClass="error"/>
<br><br>

<input type="submit" value="enter" />

</form:form>

</body>
</html>