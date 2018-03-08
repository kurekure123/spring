<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
  <%@ include file = "../common/nav.jsp" %>
<head>
  <meta charset="UTF-8" />
  <h1>마이페이지</h1>
</head>
<body>
<article>
</article>
<script src = "${sessionScope.path.js}/jquery-3.3.1.min.js"></script>
<table id = "mypage_table">
<tr id ="mypage_table tr">
  <td rowspan="5"><img src="<%=application.getContextPath()%>/resources/img/profile_0.jpg"
              id = "img" alt="" />  </td>
  <td class="title">ID</td>
  <td></td>
  <td>PW</td>
  <td></td>
</tr>
<tr>
  <td class="title">NAME</td>
  <td></td>
  <td>GENDER</td>
  <td></td>
</tr>
<tr>
  <td class="title">BIRTH</td>
  <td></td>
  <td>E-MAIL</td>
  <td></td>
</tr>
<tr>
  <td class="title">PHONE</td>
  <td></td>
  <td>ADDRESS</td>
  <td></td>
</tr>
<tr>
  <td class="title" >ACCOUNT</td>
  <td ></td>
  <td>D-A-T-E</td>
  <td></td>
</tr>
</table>
<button id = "btn_change_pass">비번 변경</button>
<button id = "btn_delete_btn">회원 탈퇴</button>
<button id = "btn_change">수정</button>
<script>
$(function(){
   $('#btn_change_pass').on('click',function(){
     alert('마이페이지 확인');
     location.href = "${path.context}/nav"
   });
});

</script>