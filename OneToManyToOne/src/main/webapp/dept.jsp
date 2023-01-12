<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form name="dept" method="post" action="EmployeeController">
  <table>
        <tr>
          <td>Dept Name</td>
          <td><input type="text" name="dname">
        </tr>
         <tr>
          <td>Location</td>
          <td><input type="text" name="location">
        </tr> 
        <tr>
           <td colspan="1" align="center">
           <td><input type="submit" name="action" value="insert dept"></td>
        </tr>
  </table>
 </form>
</body>
</html>