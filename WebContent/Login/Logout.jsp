<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	session.removeAttribute("USER_ID");
	session.removeAttribute("USER_PW");
	
	session.invalidate();
	/*
	세션 기본개체가 삭제됨. 즉 할당된 세션의 속성값을 모두 제거한다. 
	주로 세션을 종료할 때 사용한다.*/
	
	response.sendRedirect("Login.jsp");
%>