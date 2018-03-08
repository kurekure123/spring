<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="${path.js}/jquery-3.3.1.min.js"></script>
<nav id="nav">
  <ul>
    <li class="top_menu"><a id="burgerking" href="${ctx}/user.do?dir=burgerking&page=main">버거킹</a></li>
    <li class="top_menu"><a id="kakao" href="${ctx}/user.do?dir=kakao&page=main">카카오뱅크</a></li>
    <li class="top_menu"><a id="bitcamp" href="${ctx}/user.do?dir=bitcamp&page=main">비트캠프</a></li>
    <li class="top_menu"><a id="sktelecom" href="${ctx}/user.do?dir=sktelecom&page=main">SK텔레콤</a></li>
    <li class="top_menu"><a id="lotto" href="${ctx}/user.do?dir=lotto&page=main">로또</a></li>
    <li class="top_menu"><a id="mypage" href="${ctx}/user.do?dir=user&page=mypage">마이페이지</a></li>
    <li class="top_logout"><a id="logout" href="${ctx}/user.do?cmd=logout">로그아웃</a></li>
  </ul>
</nav>
