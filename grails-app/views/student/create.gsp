<%--
  Created by IntelliJ IDEA.
  User: pabll
  Date: 22/09/2021
  Time: 03:27
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main" />
</head>
<body>
<div id="create-student" class="content scaffold-create" role="main">
    <g:form resource="${this.student}" method="POST">
        <fieldset class="form">
            <all bean="student"/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="create" class="save" value="Create" />
        </fieldset>
    </g:form>
</div>
</body>
</html>