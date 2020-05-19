<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page = "../commonT/boardHead.jsp"/>
<body>
<div class = "container">
	<jsp:include page="../commonT/boardTop.jsp"/>
	<div class="row">
		<jsp:include page="../commonT/boardLeft.jsp"/>
		<div class = "col-9 pt-3">
			<h3>게시판 - <small> 마음대로 글을 써보세요.</small></h3>
			<div class = "row">
			<!-- 검색(제목,내용 중 선택해서 해당 검색내용으로 찾는부분 -->
			<!-- bootstrap문법
			
				form class:
					form-inline: 폼 내부의 컨트롤들을 같은 줄에 이어서 출력하는 클래스 
					form-control: 선택목록을 표시하게하는 클래스
					-->
			
			<form class ="form-inline ml-auto" name="searchFrm" method="get"> 
				<div class = "form-group">
					<select name = "searchColumn" class ="form-control" >
						<option value = "title">제목</option>
						<option value = "content">내용</option>
					</select>
				</div>
				<div class = "input-group">
					<input type="text" name="searchWord" class="form-control"/>
					<div class = "input-group-btn">
						<button type="submit" class = "btn btn-success">
							<i class='fa fa-search' style='font-size:20px'></i>
						</button>
					</div>
				</div>
			</form>
			</div>
			<div class="row mt-3">
			<!-- 게시판리스트부분 -->
			<table class = "table table-warning table-bordered table-hover table-striped">
			<colgroup>
				<col width="60px"/>
				<col width="*"/>
				<col width="120px"/>
				<col width="120px"/>
				<col width="80px"/>
				<col width="60px"/>
			</colgroup>	
			
			</table>
			
			
			</div>
		
		</div>
	</div>
	

</div>

</body>
</html>