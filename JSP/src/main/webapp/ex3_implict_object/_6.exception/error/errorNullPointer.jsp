<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500 error</title>
<style>
body { background-color : #dbc2cb}

@keyframes textColorAnimation {
	0% {color : red;}
	20% {color : orange;}
	40% {color : yellow;}
	60% {color : green;}
	80% {color : blue;}
	100% {color : magenta;}
}
span{
	font-weight : bold;
	font-size : 40px;
	animation-name : textColorAnimation;;
	animation-duration : 5s;
	animation-interation-count : infinite;
	display : block;
	text-align : center;
	}
</style>
</head>
<body>
	<span>서비스 처리과정에서 널(Null) 에러가 발생하였습니다.</span>
</body>
</html>