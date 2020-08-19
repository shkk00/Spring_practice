<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<!--
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
-->
<html lang="ko">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="description" content="출연연 온라인 채용정보시스템">
    <meta name="keywords" content="과학, 기술, 통계">
    <meta name="decorator" content="null">

    <title><spring:message code="global.error.notAuth" /> | <spring:message code="title.main" /></title>

    <!-- Google Web Font -->
    <link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>

    <!-- CSS -->
	<link rel="stylesheet" href="${ctxt}/resources/css/sub.css">
	<link rel="stylesheet" href="${ctxt}/resources/css/reset.css">
    <style type="text/css">
      * { margin:0; padding:0; border:none; box-sizing:border-box !important; -moz-box-sizing:border-box !important; -webkit-box-sizing:border-box !important; }
    </style>

  </head>
  <body class="error">
  
<div id="container">
	<div id="content">

    <div class="wrapper">

      <p class="big">File Not Found</p>
      <p class="small"><spring:message code="global.error.notAuth" /></p>

      <p class="msg">요청하신 첨부 파일이 없습니다. 시스템 운영자에게 문의하십시오.</p>
      <p class="msg last-child">Tel : 042-862-7560, 7561</p>

      <a href="javascript:window.history.back();" class="goBack">이전 페이지로 돌아가기</a>
      <a href="${ctxt}/index.do" class="goHome">메인 페이지로 이동하기</a>

    </div>

	</div><!--content-->
</div><!--container-->

  </body>
</html>