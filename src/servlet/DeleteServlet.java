package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DbConn;

public class DeleteServlet extends HttpServlet {

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
		resp.setContentType("text/html");
		req.setCharacterEncoding("gb2312");
		resp.setCharacterEncoding("gb2312");
		
		PrintWriter out = resp.getWriter();
		String booknumber=req.getParameter("booknumber");
		DbConn db=new DbConn();
		
		try {
			
			if(db.DelUserById(booknumber)>0){
				req.getRequestDispatcher("FindAllServlet").forward(req, resp);
				
			}else{
				out.print("É¾³ýÊ§°Ü");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
