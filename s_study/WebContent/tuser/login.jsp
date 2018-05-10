<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
	#container{
		margin: 20px auto;
		width:300px;
	}
	span{
		width :100px; 
	}

</style>
<script type="text/javascript">
	function logbtn() {
		console.log("작동?");
	}
	function regbtn() {
		console.log("가입 작동?");
	}
</script>
</head>
<body>
	<div id="container">
		<form action="loginOk.jsp" id="frm">
			<div id="divid">
				<span>ID</span>
				<input type="text" name="id" id="id" />
			</div>
			<div id="pw">
				<span>PW</span>
				<input type="text" name="pw" id="pw" />
			</div>
			<div id="btn">
				<input type="button" value="로그인" onclick="logbtn"/>
				<input type="button" value="회원가입" onclick="regbtn"/>
			</div>
		</form>
	</div>

</body>
</html>