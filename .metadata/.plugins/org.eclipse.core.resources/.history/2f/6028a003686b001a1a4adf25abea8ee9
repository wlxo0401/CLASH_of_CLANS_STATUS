<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<meta charset="UTF-8">
	<title>CocStatus</title>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<%
		String userName = request.getParameter("_userName");
		if (userName == null){
			response.sendRedirect("Index.jsp");
		}
	%>
	
	<script>
		function show(){
			headdiv.style.display = "";
			showbtn.style.display = "none";
		}
		function hide(){
			headdiv.style.display = "none";
			showbtn.style.display = "";
		}
		
		/* Clash of Clans 기록 조회 */
		var searchRequest = new XMLHttpRequest();
		function searchFunction(){
			searchRequest.open("Post", "./UserSearchServlet?userName=" + encodeURIComponent('<%=userName%>'), true);
			searchRequest.onreadystatechange = searchProcess;
			searchRequest.send(null);
		}
		function searchProcess(){
			var table = document.getElementById("ajaxTable");
			table.innerHTML = "";
			if(searchRequest.readyState = 4 && searchRequest.status == 200) {
				var object = eval('(' + searchRequest.responseText + ')');
				var result = object.result;
				for(var i = 0; i < result.length; i++){
					var row = table.insertRow(0);
					for(var j = 0; j < result[i].length; j++){
						var cell = row.insertCell(j);
						cell.innerHTML = result[i][j].value;
					}
				}
			}
		}
		var registerRequest2 = new XMLHttpRequest();
		function registerFunction2(){
				registerRequest2.open("Post", "./UserInputServlet?userName=" + encodeURIComponent('<%=userName%>') +
				"&plunderGold=" + encodeURIComponent(document.getElementById("inputGold").value) +
				"&plunderElixir=" + encodeURIComponent(document.getElementById("inputElixir").value)+
				"&plunderDarkElixir=" + encodeURIComponent(document.getElementById("inputDarkElixir").value), true);
				registerRequest2.onreadystatechange = registerProcess2;
				registerRequest2.send(null);
		}
		function registerProcess2(){
			if(registerRequest2.readyState == 4 && registerRequest2.status == 200){
				var result = registerRequest2.responseText;
				if(result != 1){
					alert('닉네임을 확인해주세요.');
				}
				else{
					var inputGold = document.getElementById("inputGold");
					var inputElixir = document.getElementById("inputElixir");
					var inputDarkElixir = document.getElementById("inputDarkElixir");
					inputGold.value = "";
					inputElixir.value = "";
					inputDarkElixir.value = "";
					searchFunction();
					}
			}
		}
		
		function firstFunction(){
			searchFunction();
			hide();
		}
		
		
		
		window.onload = firstFunction;
	
	</script>
</head>
<body>
	<div id = "warp">
		<div id = "header">
			<div id = "header-nav">
				<nav id="nav-1">
				  	<a class="link-1" href="Index.jsp">COCStatus</a>
				  	<a class="link-1" href="https://gall.dcinside.com/board/lists?id=clashofclans" target="_blank">DC콬갤러리</a>
				  	<a class="link-1" href="http://coc.inven.co.kr" target="_blank">COC인벤</a>
				  	<a class="link-1" href="https://www.youtube.com/user/ClashofClansKorea" target="_blank">유튜브</a>
				</nav>
			</div>
		</div>
		<div id = "userinfo-container">
			<div id = "userInfo">
				<div id = "user-Info-head">
					
					<div id = "uesr-Info-head-up">
						<img id ="logo"  src="img/TH13.png"  width="10%" height="auto" style="text-align: left;">
						<span color="#fff" class="sc-ifAKCX sc-eqIVtm ccYABU" id="userName2"><%=userName%></span></td>
						<input type="button" id = "showbtn" value="입력" onclick="show();" style="width: 70px" />	
					</div>
					<div id = "headdiv">
						<input class="textbox2" type="text" placeholder="골드"  id="inputGold">  
						<input class="textbox2" type="text" placeholder="엘릭서"  id="inputElixir">  
						<input class="textbox2" type="text" placeholder="다크 엘릭서"  id="inputDarkElixir">  
						<input type="button" onclick="registerFunction2();"  value="등 록" id="button-blue"/>	
						<input type="button" id = "hidebtn" value="입력중지" onclick="hide();" style="width: 70px" />
					</div>			
				</div>
				<div id = "user-Info_body">
					<table class="table" style="text-align: center; border: 1px solid #dddddd">
						<thead>
							<tr>
								<th style="background-color: #fafafa; text-align: center;">플레이어</th>
								<th style="background-color: #fafafa; text-align: center;">골 드</th>
								<th style="background-color: #fafafa; text-align: center;">엘릭서</th>
								<th style="background-color: #fafafa; text-align: center;">다크 엘릭서</th>
							</tr>
						</thead>
						<tbody id="ajaxTable">
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div id = "footer">
			<div class="footer-intro">만든이 : <a href="wlxo0401@gmail.com"> wlxo0401@gmail.com</a><span class="bar"></span>소개 : 연습용 개인 사이트입니다.</div>
			<div class="copyright">Copyright© KimJiTae</div>
		</div>
	</div>

</body>
</html>