<%@ page import="com.opennaru.khan.test.Deadlock" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%--
  ~  Opennaru, Inc. http://www.opennaru.com/
  ~
  ~  Copyright (C) 2014 Opennaru, Inc. and/or its affiliates.
  ~  All rights reserved by Opennaru, Inc.
  --%>
<html>
<body>


<br>
<hr>
<center>
    <a href=#>HOME</a>
</center>
<br><br>

<h1>OPENMARU APM Test Applications</h1>

<%
    Deadlock.start();
%>

<a href="deadlock.jsp">Deadlock Test</a><br>

test22
<br>
<br>


</body>
</html>
