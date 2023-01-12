package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.bean.EmployeePI;
import com.dao.EmployeeDao;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        
        
        if(action.equalsIgnoreCase("insert"))
        {
        	EmployeePI eid=new EmployeePI();
        	
        	eid.setFname(request.getParameter("fname"));
        	eid.setLname(request .getParameter("lname"));
        	eid.setEmail(request.getParameter("email"));
        	eid.setMobile(request.getParameter("mobile"));
        	 EmployeeDao.insertEmployeePI(eid);
         
            Employee e=new Employee();
            
            e.setUname(request.getParameter("uname"));
            e.setPassword(request.getParameter("password"));
            e.setEpid(eid);
            EmployeeDao.insertEmployee(e);
            
            response.sendRedirect("emp.jsp");
        }
        
        
	}

}
