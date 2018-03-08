<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
  .navbar-brand {
    padding-top: 3px;
  }
  .navbar-header {
    padding-left: 30px;
    padding-right: 30px;
  }
</style>
<script src="${path.js}/jquery-3.3.1.min.js"></script>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img style="height : 40px;" src="${path.img}/common/logo.png" alt="비트캠프 로고입니다." >
      </a>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a><span class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;Home</span></a></li>
        <!-- HOME END -->
        <li><a id="a-login" href="#"><span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;Login</span></a></li>
        <!-- loginEnd -->
        <li><a href="#"><span class="glyphicon glyphicon-book" aria-hidden="true">&nbsp;About</span></a></li>
        <!-- about end -->
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" 
              aria-expended="false">유틸리티 
              <span class="caret"></span></a>
              <ul id="ul-util">
                <li><a>로또</a></li>
                <li><a>햄버거주문</a></li>
              </ul>
            </li>
      </ul>
    </div>
  </div>
</nav>
<script>
  $('#a-login').on('click', function(){
    alert('버튼눌림');
    location.href = '${path.context}/login';
  });
   var $ulUtil=$("#ul-util");
   $ulUtil.addClass("dropdown-menu");
   $('.dropdown-menu a').eq(0).on('click', function() {
	alert('로또 가즈아!')
	location.href = '${path.context}/lotto';
	})
	 $('.dropdown-menu a').eq(1).on('click', function() {
	alert('햄버거 가즈아!')
	location.href = '${path.context}/burgerking';
	})
</script>
