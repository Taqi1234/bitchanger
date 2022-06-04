
 <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

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
  <p style="text-align:center">
    <label for=""><a href="About.html">About Us</a> / <a href="Contact.html">Contact Us</a></label>
  </p>
  <hr>
  <html:form  action="/loginAction.do" method="post" style="text-align:center;width75%">
  
    Username <html:text property="loginId"/>
    <br>
     Password <html:password property="passWord" />
    <br>
    <html:submit property="login" value="Login"/>
   <!--  <button type="reset" name="Reset">Reset</button> -->
    <label for=""><br><a target="_blank" href="registration.jsp">New user? Create an account</a></label>
  </html:form > 
</body>
<footer style="color:#5e544c;"><hr><b>© 2018.</b>Designed by Pulkit.</footer>
</html>