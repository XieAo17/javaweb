<%@ page language="java" import="java.util.*,bean.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'amend.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.2.0/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="css/default.css">
    <link rel="stylesheet" type="text/css" href="css/set2.css" />
  </head>
  
  <body>
    <%
    	BookBean student=(BookBean)session.getAttribute("student");
    	
     %>
     <form action="AmendServlet2">
     	
     	 <center>
    <div class="jq22-content bgcolor-1">
				<span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-1" name="booknumber" value="<%=student.getBooknumber() %>" readonly="readonly"/>
					<label class="input__label input__label--nao" for="input-1">
						<span class="input__label-content input__label-content--nao"><%=student.getBooknumber() %></span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
				</div>
    	<div class="jq22-content bgcolor-1">
				<span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-1" name="bookname" value="<%=student.getBookname() %>"/>
					<label class="input__label input__label--nao" for="input-1">
						<span class="input__label-content input__label-content--nao"><%=student.getBookname() %></span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
				</div>
				<div class="jq22-content bgcolor-1">
				<span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-1" name="author" value="<%=student.getAuthor() %>"/>
					<label class="input__label input__label--nao" for="input-1">
						<span class="input__label-content input__label-content--nao"><%=student.getAuthor() %></span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
				</div>
				<div class="jq22-content bgcolor-1">
				<span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-1" name="publisher" value="<%=student.getPublisher() %>"/>
					<label class="input__label input__label--nao" for="input-1">
						<span class="input__label-content input__label-content--nao"><%=student.getPublisher() %></span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
				</div>
				<div class="jq22-content bgcolor-1">
				<span class="input input--nao">
					<input class="input__field input__field--nao" type="text" id="input-1" name="price" value="<%=student.getPrice() %>"/>
					<label class="input__label input__label--nao" for="input-1">
						<span class="input__label-content input__label-content--nao"><%=student.getPrice() %></span>
					</label>
					<svg class="graphic graphic--nao" width="300%" height="100%" viewBox="0 0 1200 60" preserveAspectRatio="none">
						<path d="M0,56.5c0,0,298.666,0,399.333,0C448.336,56.5,513.994,46,597,46c77.327,0,135,10.5,200.999,10.5c95.996,0,402.001,0,402.001,0"/>
					</svg>
				</span>
				</div>
    	<div class="jq22-content bgcolor-1">
    	
    	<input type="submit" value="修改">
    	</div>
    	</center>
     </form>
     <script src="js/classie.js"></script>
    <script>
        (function () {
            if (!String.prototype.trim) {
                (function () {
                    // Make sure we trim BOM and NBSP
                    var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
                    String.prototype.trim = function () {
                        return this.replace(rtrim, '');
                    };
                })();
            }

            [ ].slice.call(document.querySelectorAll('input.input__field')).forEach(function (inputEl) {
                // in case the input is already filled..
                if (inputEl.value.trim() !== '') {
                    classie.add(inputEl.parentNode, 'input--filled');
                }

                // events:
                inputEl.addEventListener('focus', onInputFocus);
                inputEl.addEventListener('blur', onInputBlur);
            });

            function onInputFocus(ev) {
                classie.add(ev.target.parentNode, 'input--filled');
            }

            function onInputBlur(ev) {
                if (ev.target.value.trim() === '') {
                    classie.remove(ev.target.parentNode, 'input--filled');
                }
            }
        })();
    </script>
  </body>
</html>
