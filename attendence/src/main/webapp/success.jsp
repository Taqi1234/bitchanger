<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
</head>
<body>
<%-- <h1>Welcome....<bean:write name="loginForm" property="fullName" />
</h1> --%>


Welcome.... : <bean:write name="loginForm" property="loginId"/><br/>
</body>
</html>