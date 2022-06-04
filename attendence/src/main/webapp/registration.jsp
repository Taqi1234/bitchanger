<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
    <title>Sign Up</title>
    <header style="text-align:center;font-size:250%;color:#5e544c;">
      Sign Up
    </header>
  </head>
  <body style="background-color:#f1ede5;font-family:DK Lemon Yellow Sun;font-size:130%;text-align:center;" background="bg.jpg">
    <p style="text-align:center; width:75%">
      <label for=""><a href="index.html">Home</a> / <a href="About.html">About Us</a> / <a href="Contact.html">Contact Us</a><hr></label>
    </p>
    <header style="text-align:center;font-size:150%;color:#5e544c;">
      Create an account ..
      <hr>
    </header>
    <html:form action="/registration.do" method="post" style="text-align:center;width:75%">
     <table style="width:100%;font-size:120%;background-color:#e6e0d3;" align="center">
      <tr><td align="right">Choose a username&emsp;:&emsp;</td><td align="left"> <html:text property="uname"  size="40" /></td></tr>

      <tr><td align="right">First name&emsp;:&emsp;</td><td align="left"><html:text property="fname"  size="40" /></td></tr>

      <tr><td align="right">Last name&emsp;:&emsp;</td><td align="left"><html:text property="lname"  size="40" /></td></tr>

      <tr><td align="right">Gender&emsp;:&emsp;</td><td align="left">
      <html:radio property="gender" value="Male">Male</html:radio>
      <html:radio property="gender" value="female">Female</html:radio>
 


      <tr><td align="right">Email ID&emsp;:&emsp;</td><td align="left"><html:text property="email"  size="40" /></td></tr>

      <tr><td align="right">Phone Number&emsp;:&emsp;</td><td align="left"><html:text property="phone"  size="40" /></td></tr>

      <tr><td align="right">City&emsp;:&emsp;</td><td align="left"><html:text property="city"  size="40" /></td></tr>

      <tr><td align="right">State&emsp;:&emsp;</td><td align="left">
      <html:select property="singleSelect" size="5" style="width:270px">
    
          <html:option value="">Choose one..&emsp;&emsp;</html:option>
        <html:option value="Jharkhand">Jharkhand</html:option>
          <html:option value="Bihar">Bihar</html:option>
       <html:option value="Odisha">Odisha</html:option>
         <html:option value="West Bengal">West Bengal</html:option>
          <html:option value="Goa">Goa</html:option>
          <html:option value="Uttrakhand">Uttrakhand</html:option>
          </html:select>
      </td></tr>

      <tr><td align="right">Password&emsp;:&emsp;</td><td align="left"><html:password property="passWord" size="40"/></td></tr>

      <tr><td align="right">Confirm Password&emsp;:&emsp;</td><td align="left"><html:password property="confpass" size="40" /></td></tr>

      <tr><td align="right">
      
      
       <html:submit property="create" value="create">Create account</html:submit></td><td align="left"><html:submit property="create" value="reset">Cancel</html:submit></td></tr>
    </table>
    </html:form>
  </body>
  <footer style="color:#5e544c;"><hr><b>© 2018.</b> Designed by Pulkit.</footer>

</html>