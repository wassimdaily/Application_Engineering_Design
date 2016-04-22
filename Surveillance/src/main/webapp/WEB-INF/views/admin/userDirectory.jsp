<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js'></script>
<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>User Directory</title>
<style>
table.t3 {
	width: 550px;
	height: 340px;
	background-color: #e0e0e0;
	border: silver;
	border-radius: 10px;
	opacity: 0.7;
}

td {
	text-align: center;
	font-weight: 600;
}
</style>
</head>
<body>
	<form action="userDirectory.htm" method="POST">
	<div align="left" style="width: 570px; height: 350px; overflow: scroll; margin-left: 100px">
		
		Search User : <input type="text" id="search" name="search" />
		
		<table class="t3" border="2" cellpadding="5" cellspacing="2"
			align="center">
			<tr>
				<td colspan="5">Welcome :${sessionScope.userAccount.getUserName()}</td>
			</tr>
			<tr>
				<td colspan="5">User Table</td>
			</tr>

			<tr>
				<th>User ID</th>
				<th>UserName</th>
				<th>Full Name</th>
				<th>Role</th>
				<th>Enterprise</th>
			</tr>
			<c:forEach var="d" items="${userList}">

				<tr>
					<td><c:out value="${d.personID}" /></td>
					<td><c:out value="${d.userName}" /></td>
					<td><c:out value="${d.firstName} ${d.lastName}" /></td>
					<td><c:out value="${d.role}" /></td>
					<td><c:out value="${d.enterprise.enterpriseName}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	</form>
	
	<script>
	//onchange="youFunction();"
	$("#search").change("input",function(){
		var searc = $(this.value);
		alert("hello" + searc);
		$.ajax({
			url:"userDirectory.htm", data: {'comp' : eid},
			success : function(response){
				$('#drug').html(response);
				
			},
		});
	});
	</script>
</body>
</html>