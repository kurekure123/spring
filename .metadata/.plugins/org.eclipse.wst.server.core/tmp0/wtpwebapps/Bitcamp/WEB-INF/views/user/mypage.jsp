<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src = "${path.js}/jquery-3.3.1.min.js"></script>
<table id = "mypage_table">
<tr id ="mypage_table tr">
  <td rowspan="5"><img src=""
              id = "img" alt="" />  </td>
  <td class="title">ID</td>
  <td>${user.id}</td>
  <td>PW</td>
  <td>${user.pass}</td>
</tr>
<tr>
  <td class="title">NAME</td>
  <td>${user.name}</td>
  <td>GENDER</td>
  <td>남</td>
</tr>
<tr>
  <td class="title">BIRTH</td>
  <td>${user.ssn}</td>
  <td>E-MAIL</td>
  <td>${user.email}</td>
</tr>
<tr>
  <td class="title">PHONE</td>
   <td>
   	${user.phone}
   	<a id="a-phone" href="#">폰 개통하러 가기</a>
   </td>
  <td>ADDRESS</td>
  <td>${user.addr}</td>
</tr>
<tr>
  <td class="title" >ACCOUNT</td>
  <td ></td>
  <td>D-A-T-E</td>
  <td></td>
</tr>
</table>
<button id = "btn-change_pass">비번 변경</button>
<button id = "btn-delete_btn">회원 탈퇴</button>
<button id = "btn-change">수정</button>
<button id = "btn-logout">로그아웃</button>
<script>
$('#btn-logout').on('click', function(){
	  alert("클릭 인식됨.");
	  location.href = '${path.context}/logout';
	});
	
$('#a-phone').on('click', function(){
	  alert("폰을 개통하러 갑니다.");
	  location.href = '${path.context}/mobile/open';
	});
</script>