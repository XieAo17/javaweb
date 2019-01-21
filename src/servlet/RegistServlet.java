package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.StudentBean;
import db.DbConn;

public class RegistServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//接收值
				req.setCharacterEncoding("utf-8");
				resp.setCharacterEncoding("utf-8");
				String username=req.getParameter("username");
				String password=req.getParameter("password");
				StudentBean student;
				//调用判断是否注册
				try {
					student = new DbConn().FindUser(username, password);
					int count = new DbConn().countByName(username);
					
					if (count > 0) {
						req.setAttribute("username", "用户名已被注册");
						req.getRequestDispatcher("error.jsp").forward(req, resp);
						return;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				student = new StudentBean();
				//封装成javabean对象
				student.setId(0);	// 废弃
				student.setUsername(username);
				student.setPassword(password);
				//调用方法
				boolean flag=true;
				try {
					flag=new DbConn().AddUser(student);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				//跳转
				if(flag){
					req.getRequestDispatcher("index.jsp").forward(req, resp);
				}else{
					
					resp.sendRedirect("error.jsp");
				}
			}
	

}
