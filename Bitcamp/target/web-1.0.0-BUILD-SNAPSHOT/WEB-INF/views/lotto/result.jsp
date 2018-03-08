<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section>
<article>
	구매 금액 : <input id="money" type="text" value="${money}" /> 
	<button id="btn-money">전송</button>
</article>
<article>
	<div style="height: 40px; width : 300px;"></div>
	<table>
		<tr>
			<th>No.</th>
			<th>로또번호</th>
		</tr>
		<c:forEach var="i" items="${lottos}" > 
			<tr>
				<td>1</td>
				<td>${i.lottoNumber}</td>
			</tr>
		</c:forEach>
	</table>
</article>
</section>
<aside></aside>
<script>
$('#btn-money').on('click', function() {
	var money = $('#money').val();
	alert("입금받은 돈은" + money + "입니다.");
	location.href = "${path.context}/lotto/"+money;
})
</script>
