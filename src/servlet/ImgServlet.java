package servlet;
import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.util.Random;
import java.awt.*;
import java.awt.image.*;

import javax.imageio.*;

public class ImgServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
				throws ServletException,IOException	{
		//设置Content-Type响应头
		response.setContentType("image/jpeg");
		//下面三条语句用于设置页面不缓存
		response.setHeader("Pragma","No-cache");
		response.setHeader("Cache-Control","no-cache");
		response.setDateHeader("Expires",0);		
		OutputStream out = response.getOutputStream();
		int width=80, height=20;
		//建立指定宽、高BufferedImage对象
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		//生成随机类
		Random random = new Random();	
		g.setColor(Color.gray);//设置填充色
		g.fillRect(0, 0, width, height);
		//设置字体
		g.setFont(new Font("Times New Roman",Font.ITALIC,18));
		String sRand = "";
		for (int i=0;i<4;i++){
			
		    String rand = String.valueOf(random.nextInt(10));
		    sRand += rand;
		    // 设置随机颜色
		    g.setColor(new Color(20 + random.nextInt(110),20 + random.nextInt(110),20 + random.nextInt(110)));
		    //绘制
		    g.drawString(rand,20*i + 6,16);
		}
		HttpSession session=request.getSession();
		session.setAttribute("validateCode", sRand);//保存到session中
		g.dispose();
		// 输出图象到页面
		ImageIO.write(image, "JPEG", out);
	}
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) 
				throws ServletException,IOException
	{
		doGet(request,response);
	}
}
