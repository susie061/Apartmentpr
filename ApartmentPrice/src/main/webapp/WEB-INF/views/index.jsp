<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
	<div>
		<form action="/result" method="post">
		<div>
			날짜:
			<select name="year">
				<c:forEach var="i" begin="2000" end="2020">
					<option value ="${i}">${i}</option>
				</c:forEach>
			</select>
			-
			<select name="mon">
				<c:forEach var="i" begin="1" end="12">
					<option value ="${i}">${i}</option>
				</c:forEach>
			</select>
			-
			<select name="day">
				<c:forEach var="i" begin="1" end="31">
					<option value ="${i}">${i}</option>
				</c:forEach>
			</select>
			</div>
			<div>
				지역:
				<select name="locationCd">
					<c:forEach var="item" items="${locationList}">
						<option value="${item.external_cd}">${item.local_nm}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<input type="submit" value="검색">
			</div>
		</form>
	</div>
</body>
</html>