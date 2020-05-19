<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<table border="1">
		<tr>
			<td>
				<% if(session.getAttribute("USER_ID")==null){ %>
					<a href="../Login/Login.jsp">로그인</a>
				<%}else{ %>
					<a href="../Login/Logout.jsp">로그아웃</a>
				<% } %>
				&nbsp;&nbsp;&nbsp;
				<a href="../Board/BoardList.jsp">회원게시판</a>
			</td>
		
		</tr>
	
	</table>

	<h2>로그인 페이지</h2>
	
	<!--
		em : 1em은 현재 지정된 기본폰트 사이즈와 동일하다. 
		즉, 2em은 기본폰트의 2배사이즈가 되고 0.5em은 기본폰트 사이즈의 절반 
		em은 기본폰트로 지정된 사이즈를 스케일로 조정하여 화면상에 표현하므로
		기본폰트에 따라 가변적으로 표시된다. 
		주로 모바일 환경에서 많이 사용된다.
	-->

	<span style="color:red; font-size:1.5em;">
		<%=request.getAttribute("ERROR_MSG")==null ?
			"" : request.getAttribute("ERROR_MSG") %>
	</span>

<%
//로그인 전이거나 로그인에 실패했을때 출력되는내용

if(session.getAttribute("USER_ID") == null){
%>
	<script>
	function loginValidate(fn){
		if(!fn.user_id.value){
			alert("아이디를 입력하세요");
			fn.user_id.focus();
			return false;
		}
		if(!fn.user_pw.value){
			alert("비밀번호를 입력하세요");
			fn.user_id.focus();
			return false;
		}
	
	}
	</script>
	
	<form action="LoginProcess.jsp" method = "post" name = "loginFrm"
		onsubmit="return loginValidate(this);">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="user_id" tabindex="1"/></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="user_pw" tabindex="2"/></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="로그인하기" tabindex="3"/>
				</td>
			</tr>
		</table>
	</form>
<%}else{%>
	<table border = "1">
		<tr>
			<td style="text-align:center;">
				<%=session.getAttribute("USER_NAME") %> 회원님, 로그인 하셨습니다.
				<br/>
				즐거운 시간 보내세요 ^^*
				<br/>
				<a href="Logout.jsp">[로그아웃]</a>
			</td>
		</tr>
	</table>
<% } %>
	
</body>
</html>