<%@ page language="java" import="java.util.*,bean.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'find.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/iconfont.css">
	<link rel="stylesheet" type="text/css" href="css/iconfont2.css">
	<link rel="stylesheet" type="text/css" href="css/iconfont3.css">
<script src="http://www.jq22.com/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-setTableColor.js"></script>
	<script type="text/javascript">
		$(function(){
			$('table').setTableColor('lightblue','pink');
		});
	</script>
	<style type="text/css">
	
	form{
		
	}
		
		td{border:1px solid black;
			text-align: center;
			vertical-align: middle;
		}
		*{margin:0;padding:0;}

.slideshow {
  position: absolute;
  width: 100vw;
  height: 100vh;
  overflow: hidden;
}

.slideshow-image {
  position: absolute;
  width: 100%;
  height: 100%;
  background: no-repeat 50% 50%;
  background-size: cover;
  -webkit-animation-name: kenburns;
          animation-name: kenburns;
  -webkit-animation-timing-function: linear;
          animation-timing-function: linear;
  -webkit-animation-iteration-count: infinite;
          animation-iteration-count: infinite;
  -webkit-animation-duration: 16s;
          animation-duration: 16s;
  opacity: 1;
  -webkit-transform: scale(1.2);
          transform: scale(1.2);
}
.slideshow-image:nth-child(1) {
  -webkit-animation-name: kenburns-1;
          animation-name: kenburns-1;
  z-index: 3;
}
.slideshow-image:nth-child(2) {
  -webkit-animation-name: kenburns-2;
          animation-name: kenburns-2;
  z-index: 2;
}
.slideshow-image:nth-child(3) {
  -webkit-animation-name: kenburns-3;
          animation-name: kenburns-3;
  z-index: 1;
}
.slideshow-image:nth-child(4) {
  -webkit-animation-name: kenburns-4;
          animation-name: kenburns-4;
  z-index: 0;
}

@-webkit-keyframes kenburns-1 {
  0% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  1.5625% {
    opacity: 1;
  }
  23.4375% {
    opacity: 1;
  }
  26.5625% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  98.4375% {
    opacity: 0;
    -webkit-transform: scale(1.21176);
            transform: scale(1.21176);
  }
  100% {
    opacity: 1;
  }
}

@keyframes kenburns-1 {
  0% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  1.5625% {
    opacity: 1;
  }
  23.4375% {
    opacity: 1;
  }
  26.5625% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  98.4375% {
    opacity: 0;
    -webkit-transform: scale(1.21176);
            transform: scale(1.21176);
  }
  100% {
    opacity: 1;
  }
}
@-webkit-keyframes kenburns-2 {
  23.4375% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  26.5625% {
    opacity: 1;
  }
  48.4375% {
    opacity: 1;
  }
  51.5625% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
}
@keyframes kenburns-2 {
  23.4375% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  26.5625% {
    opacity: 1;
  }
  48.4375% {
    opacity: 1;
  }
  51.5625% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
}
@-webkit-keyframes kenburns-3 {
  48.4375% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  51.5625% {
    opacity: 1;
  }
  73.4375% {
    opacity: 1;
  }
  76.5625% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
}
@keyframes kenburns-3 {
  48.4375% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  51.5625% {
    opacity: 1;
  }
  73.4375% {
    opacity: 1;
  }
  76.5625% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
}
@-webkit-keyframes kenburns-4 {
  73.4375% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  76.5625% {
    opacity: 1;
  }
  98.4375% {
    opacity: 1;
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes kenburns-4 {
  73.4375% {
    opacity: 1;
    -webkit-transform: scale(1.2);
            transform: scale(1.2);
  }
  76.5625% {
    opacity: 1;
  }
  98.4375% {
    opacity: 1;
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}


table {
width:700px;margin:auto;border:1px solid black;border-collapse:collapse;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate3d(-50%, -50%, 0);
          transform: translate3d(-50%, -50%, 0);
  z-index: 99;
  text-align: center;
  font-family: Raleway, sans-serif;
  font-weight: 300;
  text-transform: uppercase;
  background-color: rgba(255, 255, 255, 0.75);
  box-shadow: 0 1em 2em -1em rgba(0, 0, 0, 0.5);
  padding: 1em 2em;
  line-height: 1.5;
}

}
body{
	 position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate3d(-50%, -50%, 0);
          transform: translate3d(-50%, -50%, 0);
  z-index: 99;
  text-align: center;
  font-family: Raleway, sans-serif;
  font-weight: 300;
  text-transform: uppercase;
  background-color: rgba(255, 255, 255, 0.75);
  box-shadow: 0 1em 2em -1em rgba(0, 0, 0, 0.5);
  padding: 1em 2em;
  line-height: 1.5;
}
		
	</style>
  </head>
  
  <body align="center">
  <form action="FindAllServlet" method="post">
  <table  >
  <tr>
				<td>编号</td>
				<td>书名</td>
				<td>作者</td>
				<td>出版社</td>
				<td>价格</td>
			<td colspan="2">相关操作</td>
    	</tr>
  <c:forEach items="${stulist}" var="stu">
  <tr>
				<td>${stu.booknumber}</td>
				<td>${stu.bookname}</td>
				<td>${stu.author}</td>
				<td>${stu.publisher}</td>
				<td>${stu.price}</td>
			<td><a href="DeleteServlet?booknumber=${stu.booknumber}"><i class="iconfont icon-shanchu"></i></a></td>
    	 <td><a href="AmendServlet?booknumber=${stu.booknumber}"><i class="iconfont icon-xiugai"></i></a></td>
    	</tr>
			</c:forEach>

    <tr>	<c:if test="${pageNo==1 }">
  	<td><i class="iconfont icon-diyiyeshouyeshangyishou"></i></td> <td><i class="iconfont icon-shangyiye"></i></td>
  </c:if>
  <c:if test="${pageNo!=1 }">
  	<td><a href="FindAllServlet?pageNo=1"><i class="iconfont icon-diyiyeshouyeshangyishou"></i></a></td>
  	<td><a href=FindAllServlet?pageNo=${pageNo-1}><i class="iconfont icon-shangyiye"></i></a></td>
  </c:if>
  <c:if test="${pageNo==pageCount} ">
  	<td><i class="iconfont icon-xiayiye"></i></td>
  	<td><i class="iconfont icon-zuihouyiyemoyexiayishou"></i></td>
  </c:if>
  <c:if test="${pageNo!=pageCount}">
  	<td><a href=FindAllServlet?pageNo=${pageNo+1}><i class="iconfont icon-xiayiye"></i></a></td>
  	<td><a href=FindAllServlet?pageNo=${pageCount}><i class="iconfont icon-zuihouyiyemoyexiayishou"></i></a></td>
  </c:if>
  <td colspan=+5><a href="increase.jsp"><i class="iconfont icon-zengjia"></i></a></td>
</tr>

			
			<tr>	<td colspan=7>跳转到<input type="text" name="pageNo">页
				<input type="submit" value="跳转"></td>
				</tr>
			
    	
  </table>
			</form>
			
    	
    	<div class="slideshow">
	
	<div class="slideshow-image" style="background-image: url('img/4.jpg')"></div>
	<div class="slideshow-image" style="background-image: url('img/1.jpg')"></div>
	<div class="slideshow-image" style="background-image: url('img/2.jpg')"></div>
	<div class="slideshow-image" style="background-image: url('img/3.jpg')"></div>
</div>
  </body>
</html>
