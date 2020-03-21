<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
	<meta charset="UTF-8">
	<title>CocStatus</title>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<div id = "warp">
		<div id = "header">
			<div id = "header-nav">
				<nav id="nav-1">
				  	<a class="link-1" href="Index.jsp">COCStatus</a>
				 	<a class="link-1" href="userRegister.jsp">회원 등록</a>
				  	<a class="link-1" href="https://gall.dcinside.com/board/lists?id=clashofclans" target="_blank">DC콬갤러리</a>
				  	<a class="link-1" href="http://coc.inven.co.kr" target="_blank">COC인벤</a>
				  	<a class="link-1" href="https://www.youtube.com/user/ClashofClansKorea" target="_blank">유튜브</a>
				</nav>
			</div>
		</div>
		<div id = "main-container">
			<h2 style="text-align : center">플레이어 등록</h2>
			<img id ="logo"  src="img/coc_logo.png"  width="30%" height="auto"><br>
			<div id = "container-contents" style="text-align : center">
				<input class="textbox1" type="text" size="50" placeholder="플레이어 등록"  id="registerName">  
				<input type="button" onclick="registerFunction();"  value="등록" id="button-blue"/>	
			</div>
		</div>
		<div id = "footer">
			<div class="footer-intro">만 든 이 : <a href="wlxo0401@gmail.com"> wlxo0401@gmail.com</a><span class="bar"></span>소개 : 연습용 개인 사이트입니다.</div>
			<div class="copyright">Copyright© KimJiTae</div>
		</div>
	</div>
</body>
</html>