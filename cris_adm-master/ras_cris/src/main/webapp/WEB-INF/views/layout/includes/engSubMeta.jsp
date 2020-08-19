<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<%-- <meta id="_csrf" name="_csrf" content="${_csrf.token}" /> --%>
<!-- default header name is X-CSRF-TOKEN -->
<%-- <meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>	 --%>

<!-- responsive -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- MS Edge tel링크제거 -->
<meta name="format-detection" content="telephone=no"/>

	
<link rel="stylesheet" href="${ctxt}/resources/css/print/print-preview.css" media="screen" />
<link rel="stylesheet" href="${ctxt}/resources/css/print/print.css" media= "print"/>
<link rel="stylesheet" href="${ctxt}/resources/css/print/screen.css" media = "screen"/>
	

<!-- jquery -->
<script src="${ctxt}/resources/js/jquery-1.11.3.min.js"></script>
<script src="${ctxt}/resources/js/chart/jui/jquery-ui.min.js"></script>
<script src="${ctxt}/resources/js/jquery.easing.min.js"></script>
<script src="${ctxt}/resources/js/html5shiv.min.js"></script>
<!--[if lt ie 9]><![endif]-->
<script src="${ctxt}/resources/js/_front_end_main.js"></script>
<script src="${ctxt}/resources/js/_front_end_gnb.js"></script>
<script src="${ctxt}/resources/js/_front_end_footer.js"></script>
<script src="${ctxt}/resources/js/_front_end_sub.js"></script>
<script src="${ctxt}/resources/js/visual.js"></script>
<!-- common js -->

<script src="${ctxt}/resources/js/jquery.popupoverlay.js"></script>
<script src="${ctxt}/resources/js/dtree.js"></script>
<script src="${ctxt}/resources/js/paging/jquery.paging.js"></script>
<script src="${ctxt}/resources/js/paging/jquery.paging.min.js"></script>
<script src="${ctxt}/resources/js/common.js"></script>

<script src="${ctxt}/resources/js/paging/jquery.paging.min.js"></script>
<script type="text/javascript" src="${ctxt}/resources/js/jquery.treeview.js"></script>

<script type="text/javascript" src="${ctxt}/resources/js/commAttfile.js"></script>

<script type="text/javascript" src="${ctxt}/resources/js/jquery.print-preview.js"></script>
<script type="text/javascript" src="${ctxt}/resources/js/jquery.printElement.js"></script>

<script type="text/javascript" src="${ctxt}/resources/js/accordianMenu.js"></script>

<!-- css -->
<%-- <link rel="stylesheet" href="${ctxt}/resources/css/common.css" /> --%>
<%-- <link rel="stylesheet" href="${ctxt}/resources/css/layout.css" /> --%>
<link rel="stylesheet" href="${ctxt}/resources/css/ncmik/subIndex.css" type="text/css" />
<link rel="stylesheet" href="${ctxt}/resources/css/popup.css"  type="text/css" /> 
<%-- <link rel="stylesheet" href="${ctxt}/resources/css/jquery-ui.css" type="text/css" />     --%>     
<link rel="stylesheet" href="${ctxt}/resources/css/jquery-ui.min.css" type="text/css" />  
	
<link rel="stylesheet" href="${ctxt}/resources/css/ncmik/wonkiIndex.css" type="text/css" />
<link rel="stylesheet" href="${ctxt}/resources/css/ncmik/eng.css" type="text/css" />
<link rel="stylesheet" href="${ctxt}/resources/css/ncmik/mediaSub.css" type="text/css" />
<%-- <script type="text/javascript" src="${ctxt}/resources/js/lib/jquery-2.1.1.min.js"></script> --%>
		
<!-- 달력  -->		
<script type="text/javascript" src="${ctxt}/resources/utils/datepicker/js/datepicker.js"></script>
<link rel="stylesheet" href="${ctxt}/resources/utils/datepicker/css/datepicker.css" />