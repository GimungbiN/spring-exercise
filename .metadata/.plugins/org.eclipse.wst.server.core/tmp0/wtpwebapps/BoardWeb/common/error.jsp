<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>기본 에러 화면</title>
</head>
<body bgcolor="#ffffff" text="#000000">
<table width="100%" border="1" cellpadding="0" cellspacing="0">
<tr>
           <td align="center"><B>기본 에러 화면입니다.</B></td>
</tr>
</table>
<br>


<table width="100%" border="1" cellpadding="0" cellspacing="0" align="center">
<tr>
     <td align="center">
     <br>
     Message:${exception.message}
     <br><br><br>
     </td>
</tr>
</table>
</body>
</html>