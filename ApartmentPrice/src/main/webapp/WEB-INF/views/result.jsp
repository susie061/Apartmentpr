<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<div>결과</div>
	<table>
		<tr>
			<th>지역명</th>
			<th>법정동</th>
			<th>지번</th>
			<th>아파트명</th>
			<th>건축년도</th>
			<th>거래금액</th>
			<th>계약일</th>
			<th>전용면적</th>
			<th>층</th>
		</tr>
		<c:forEach items ="${data}" var ="item">
			<tr>
				<td>${item.local_nm }</td>
				<td>${item.dong }</td>
				<td>${item.jibun }</td>
				<td>${item.apartment_name }</td>
				<td>${item.build_year }</td>
				<td>${item.deal_amount}만원</td>
				<td>
				${item.deal_year}.${item.deal_month}.${item.deal_day}
				</td>
				<td>${item.area_for_exclusive_use}</td>
				<td>${item.flr}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>