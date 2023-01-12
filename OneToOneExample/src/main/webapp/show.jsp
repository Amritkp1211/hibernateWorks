<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
  List<Employee> list=EmployeeDao.showEmployee();
%>
<body>

	<table border="1" width="100%" cellpadding="10px" cellspcaing="10px">
		<tr>
			<th>Eid</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Epid</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<% 
    for(Employee e:list)
    {
    %>
		<tr>
			<td><%=e.getEid() %></td>
			<td><%=e.getUname() %></td>
			<td><%=e.getPassword() %></td>
			<td><%=e.getEpid() %></td>
			<td><%=e.getEpid().getFname()%></td>
			<td><%=e.getEpid().getLname()%></td>
			<td><%=e.getEpid().getEmail()%></td>
            <td><%=e.getEpid().getMobile()%></td>
		</tr>

		<%
    }
      %>
	</table>

</body>
</html>