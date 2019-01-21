package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.*;
public class DbConn {
	public Connection getConn() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=DriverManager.getConnection("jdbc:mysql://119.23.25.226:3306/test?useUnicode=true&characterEncoding=UTF-8", "myuser", "mypassword");
		return conn;
	}
	//用户名登录
	public StudentBean FindUser(String username,String password) throws SQLException{
		String sql="select * from user where username=? and password=?";
		PreparedStatement ps=this.getConn().prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		StudentBean stu=new StudentBean();
		if(rs.next()){
			stu.setUsername(rs.getString(2));
			stu.setPassword(rs.getString(3));
			return stu;
		}else{
			return null;
		}
	}
	//用户名添加
	public boolean AddUser(StudentBean stu) throws SQLException{
		String sql="insert into user values(?,?,?)";
		
		PreparedStatement ps=this.getConn().prepareStatement(sql);
		ps.setInt(1, stu.getId());
		ps.setString(2, stu.getUsername());
		ps.setString(3, stu.getPassword());
		int i=ps.executeUpdate();
		if(i>0) return true;
		else return false;
	}
	
	//图书添加
	public boolean AddUsers(BookBean stu) throws SQLException{
		String sql="insert into book values(?,?,?,?,?)";
		PreparedStatement ps=this.getConn().prepareStatement(sql);
		ps.setString(1, stu.getBooknumber());
		ps.setString(2, stu.getBookname());
		ps.setString(3, stu.getAuthor());
		ps.setString(4, stu.getPublisher());
		ps.setString(5, stu.getPrice());
		int i=ps.executeUpdate();
		if(i>0) return true;
		else return false;
	}
	//图书查找
	public ArrayList<BookBean> FindAll() throws SQLException{
		String sql="select * from book";
		PreparedStatement ps=this.getConn().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		ArrayList<BookBean> stulist=new ArrayList<BookBean>();
		while(rs.next()){
			BookBean stu = new BookBean();
			stu.setBooknumber(rs.getString(1));
			stu.setBookname(rs.getString(2));
			stu.setAuthor(rs.getString(3));
			stu.setPublisher(rs.getString(4));
			stu.setPrice(rs.getString(5));
			stulist.add(stu);
		}
		return stulist;
	}
	
	//查找分页
	public ArrayList<BookBean> FindAll2(String pageNo) throws SQLException{
		String sql = "select * from book";
		ArrayList<BookBean> stulist = new ArrayList<BookBean>();
		PreparedStatement ps = this.getConn().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int ipageNo=Integer.parseInt(pageNo);
		int begin=(ipageNo-1)*7+1;
		int end=ipageNo*7;
		int index=0;
		while(rs.next()){
			index++;
			if(index<begin)continue;
			if(index>end)break;
			BookBean stu = new BookBean();
			stu.setBooknumber(rs.getString(1));
			stu.setBookname(rs.getString(2));
			stu.setAuthor(rs.getString(3));
			stu.setPublisher(rs.getString(4));
			stu.setPrice(rs.getString(5));
			stulist.add(stu);
		}
		return stulist;
	}

	
	//图书删除
	public int DelUserById(String booknumber) throws SQLException{
		String sql="delete from book where booknumber="+booknumber;
		PreparedStatement ps=this.getConn().prepareStatement(sql);
		return ps.executeUpdate();
	}
	
	//修改图书look
	public BookBean FindOneById(String booknumber) throws SQLException{
		String sql="select * from book where booknumber="+booknumber;
		PreparedStatement ps=this.getConn().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			BookBean stu=new BookBean();
			stu.setBooknumber(rs.getString(1));
			stu.setBookname(rs.getString(2));
			stu.setAuthor(rs.getString(3));
			stu.setPublisher(rs.getString(4));
			stu.setPrice(rs.getString(5));
						return stu;
		}else{
			return null;
		}
	}
	//修改yep
	public boolean ChangeUser(String booknumber,String bookname,String author,String publisher,String price) throws SQLException {
		
		String sql="update book set bookname=?,author=?,publisher=?,price=? where booknumber="+booknumber;
		PreparedStatement ps = this.getConn().prepareStatement(sql);
		
	    ps.setString(1, bookname);
		ps.setString(2, author);
		ps.setString(3, publisher);
		ps.setString(4, price);
		int rs= ps.executeUpdate();
		if(rs>0)return true;
		else return false;
	}
	//分页
	public int pageCount() throws SQLException{
	String sql = "select count(*) from book";
	PreparedStatement ps = this.getConn().prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	rs.next();
	int n=rs.getInt(1);
	int pageCount=1;
	pageCount=(n-1)/7+1;
	return pageCount;
}
	public int countByName(String username) {
		String sql = "select count(*) from user where username=?";
		try {
		PreparedStatement ps = this.getConn().prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs;
			rs = ps.executeQuery();
			int count = 0;//查询count（*） 返回int
			while (rs.next()) {
				count = rs.getInt(1);
			}
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
}
