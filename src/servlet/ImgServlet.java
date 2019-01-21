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
		//����Content-Type��Ӧͷ
		response.setContentType("image/jpeg");
		//�������������������ҳ�治����
		response.setHeader("Pragma","No-cache");
		response.setHeader("Cache-Control","no-cache");
		response.setDateHeader("Expires",0);		
		OutputStream out = response.getOutputStream();
		int width=80, height=20;
		//����ָ������BufferedImage����
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		//���������
		Random random = new Random();	
		g.setColor(Color.gray);//�������ɫ
		g.fillRect(0, 0, width, height);
		//��������
		g.setFont(new Font("Times New Roman",Font.ITALIC,18));
		String sRand = "";
		for (int i=0;i<4;i++){
			
		    String rand = String.valueOf(random.nextInt(10));
		    sRand += rand;
		    // ���������ɫ
		    g.setColor(new Color(20 + random.nextInt(110),20 + random.nextInt(110),20 + random.nextInt(110)));
		    //����
		    g.drawString(rand,20*i + 6,16);
		}
		HttpSession session=request.getSession();
		session.setAttribute("validateCode", sRand);//���浽session��
		g.dispose();
		// ���ͼ��ҳ��
		ImageIO.write(image, "JPEG", out);
	}
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) 
				throws ServletException,IOException
	{
		doGet(request,response);
	}
}
