package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BookBean;

import db.DbConn;

public class IncreaseServlet extends HttpServlet {

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
		String booknumber=req.getParameter("booknumber");
		String bookname=req.getParameter("bookname");
		String author=req.getParameter("author");
		String publisher=req.getParameter("publisher");
		String price=req.getParameter("price");
		//��װ��javabean����
		BookBean stu=new BookBean();
		stu.setBooknumber(booknumber);
		stu.setBookname(bookname);
		stu.setAuthor(author);
		stu.setPublisher(publisher);
		stu.setPrice(price);
		//���÷���
		boolean flag=true;
		try {
			flag=new DbConn().AddUsers(stu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��ת
		if(flag){
			resp.sendRedirect("FindAllServlet");
		}else{
			
			resp.sendRedirect("error.jsp");
		}
	}

}
