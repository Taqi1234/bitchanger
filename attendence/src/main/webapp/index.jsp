<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html lang="en" dir="ltr">
<head>
  <meta charset="utf-8">
  <title id="top">Login MyPage</title>
  <header style="text-align:center;font-size:250%;color:#5e544c;">
    Welcome to My World
  </header>
  <p style="text-align:right;position:relative">
    <input type="search" name="search" placeholder="Looking for Something? ">
    <button type="button" name="searchButton">Search</button>
  </p>
</head>
<body style="background-color:#f1ede5;font-family:DK Lemon Yellow Sun;font-size:130%;text-align:center" background="bg.jpg">
  <p style="text-align:center" width:"75%">
    <label for=""><a href="About.html">About Us</a> / <a href="Contact.html">Contact Us</a></label>
  </p>
  <hr>
  <html:form method="post"  action="/loginAction.do"  style="text-align:center" width:"75%"> 
 <center> Login Page</center>
 <bean:message key="username"/> :  <html:text property="loginId" selected /></br><html:errors/>
 <bean:message key="username"/>: <html:password property="passWord" /> 
 <center><html:submit property="dfd" value="Login"/>
 </html:form > 
  
  
  
  <form class="" action="index.html" method="post" style="text-align:center" width:"75%">
    <label for="">Username <input type="text" name="name" placeholder="Enter username" selected ></label>
    <br>
    <label for="">Password <input type="password" name="pass" placeholder="Enter your password"></label>
    <br>
    <button type="submit" name="Submit" formaction="registration.jsp" target="_blank">Login</button>
    <button type="reset" name="Reset">Reset</button>
    <label for=""><br><a target="_blank" href="SignUp.html">New user? Create an account</a></label>
  </form>
</body>
<footer style="color:#5e544c;"><hr><b>© 2018.</b> Designed by Pulkit.</footer>
</html>
