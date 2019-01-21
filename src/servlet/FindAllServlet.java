package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.BookBean;
import db.DbConn;
 
public class FindAllServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost( req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Ω” ’÷µ
		PrintWriter out=resp.getWriter();
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		HttpSession session=req.getSession();
		DbConn db=new DbConn();
		int pageNo=1;
		String spageNo=req.getParameter("pageNo");
		if(spageNo=="" || spageNo==null) spageNo="1";
		pageNo=Integer.parseInt(spageNo);
		try {
			ArrayList stulist=db.FindAll2(String.valueOf(pageNo));
			int pageCount=db.pageCount();
			session.setAttribute("stulist", stulist);
			session.setAttribute("pageCount",pageCount);
			session.setAttribute("pageNo",pageNo);
			resp.sendRedirect("find.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}
