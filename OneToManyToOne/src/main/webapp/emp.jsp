<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.Department"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form name="emp" method="post" action="EmployeeController">
  <table >
         <tr>
          <td>Department</td>
          <td>
            <select name="dept">
                <option>---Select Department---</option>
                <% List<Department> list=EmployeeDao.getAllDept();
                for(Department d:list){
                	%>
                	<option name="<%=d.getDid()%>"><%=d.getDname() %></option>
                	<%
                }
                %>
            </select>
          
          </td>
         </tr>
        <tr>
          <td>First Name</td>
          <td><input type="text" name="fname">
        </tr>
         <tr>
          <td>Last Name</td>
          <td><input type="text" name="lname">
        </tr> 
        <tr>
          <td>User name</td>
          <td><input type="text" name="uname">
        </tr> 
        <tr>
          <td colspan="1" align="center">
          <td><input type="submit" name="action" value="insert emp"></td>
        </tr>
       
  </table>
 </form>
</body>
</html>