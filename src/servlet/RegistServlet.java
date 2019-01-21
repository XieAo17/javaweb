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
		//����ֵ
				req.setCharacterEncoding("utf-8");
				resp.setCharacterEncoding("utf-8");
				String username=req.getParameter("username");
				String password=req.getParameter("password");
				StudentBean student;
				//�����ж��Ƿ�ע��
				try {
					student = new DbConn().FindUser(username, password);
					int count = new DbConn().countByName(username);
					
					if (count > 0) {
						req.setAttribute("username", "�û����ѱ�ע��");
						req.getRequestDispatcher("error.jsp").forward(req, resp);
						return;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				student = new StudentBean();
				//��װ��javabean����
				student.setId(0);	// ����
				student.setUsername(username);
				student.setPassword(password);
				//���÷���
				boolean flag=true;
				try {
					flag=new DbConn().AddUser(student);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				//��ת
				if(flag){
					req.getRequestDispatcher("index.jsp").forward(req, resp);
				}else{
					
					resp.sendRedirect("error.jsp");
				}
			}
	

}
