

/* Clash of Clans 닉네임 등록 실패 */

function check() {
	var userName = document.getElementById("userName").value;
	if(userName == ''){
		alert('플레이어를 입력해주세요');
	}else{
		document.getElementById("index").submit();
	}
}


/* Clash of Clans 닉네임 등록 */

var registerRequest = new XMLHttpRequest();
function registerFunction(){
	if (document.getElementById("registerName").value == "") {
		alert('플레이어를 입력해주세요.');
	} else {
		registerRequest.open("Post", "./UserRegisterServlet?userName=" + encodeURIComponent(document.getElementById("registerName").value) +
		"&plunderGold=" + encodeURIComponent("0") +
		"&plunderElixir=" + encodeURIComponent("0") +
		"&plunderDarkElixir=" + encodeURIComponent("0"), true);
		registerRequest.onreadystatechange = registerProcess;
		registerRequest.send(null);
	}
}
function registerProcess(){
	if(registerRequest.readyState == 4 && registerRequest.status == 200){
		var result = registerRequest.responseText;
		if(result != 1){
			alert('닉네임을 확인해주세요.');
		}
		else{
			alert('등록 완료!');
			var registerName = document.getElementById("registerName");
			registerName.value = "";
			}
	}
}

/* Clash of Clans 닉네임 등록 확인*/

var ishereRequest = new XMLHttpRequest();
function ishereFunction(){
	if (document.getElementById("userName").value == "") {
		alert('플레이어를 입력해주세요.');
	} else {
		ishereRequest.open("Post", "./UserIshereServlet?userName=" + encodeURIComponent(document.getElementById("userName").value), true);
		ishereRequest.onreadystatechange = ishereProcess;
		ishereRequest.send(null);
	}
}
function ishereProcess(){
	if(ishereRequest.readyState == 4 && ishereRequest.status == 200){
		var result = ishereRequest.responseText;
		if(result != 1){
			alert('닉네임을 확인해주세요.');
		}
		else{
			var registerName = document.getElementById("userName");
			registerName.value = "";
			}
	}
}
