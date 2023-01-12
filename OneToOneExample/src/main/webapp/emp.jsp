<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form name="insert" method="post" action="EmployeeController">
  <table>
        <tr>
          <td>First Name</td>
          <td><input type="text" name="fname">
        </tr>
         <tr>
          <td>Last Name</td>
          <td><input type="text" name="lname">
        </tr> 
        <tr>
          <td>Email</td>
          <td><input type="text" name="email">
        </tr> 
        <tr>
          <td>Mobile</td>
          <td><input type="text" name="mobile">
        </tr> 
        <tr>
          <td>Username</td>
          <td><input type="text" name="uname">
        </tr> 
        <tr>
          <td>Password</td>
          <td><input type="password" name="password">
        </tr>
        <tr>
           <td colspan="2" align="center">
           <td><input type="submit" name="action" value="insert"></td>
        </tr>
  </table>
 </form>
</body>
</html>