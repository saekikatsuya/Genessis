<?php
	header("Content-Type:text/html;charset=utf-8");
	$admin = false;
	session_start();
	if (isset($_SESSION["admin"]) && $_SESSION["admin"] ) {

	} 
	else {
		$_SESSION["admin"] = false;
		die("<script language='javascript'>alert('登录失败');window.location.href='entry.html';</script>");
	}

  //验证是否成功登录【关于登录部分注意和session相关的部分
  //下面是连接数据库

	$con=mysql_connect("localhost","root","") or die('找不到要连接的服务器。');

	mysql_select_db("work",$con) or die('不能连接数据库。');

	mysql_set_charset('utf8');

	$id=$_SESSION["temp"][0];


?>


<html>
	<head>
		<meta http-equiv="Content-type" content="text/html;charset=utf-8"/>
		<title>传说中的网页-报名成功</title>
	</head>
	<script type="text/javascript" src="flexible.js"></script>
	<style type="text/css">
		*{
			margin: 0px;
			padding: 0px;
			font-family: "华文行楷";
		}
		.center{
			width:750px;
			height:1600px;
			margin: auto;
			left: 0px;
			right: 0px;
			position: absolute;
		}
	</style>
	<body>
		<div class="center">
			报名成功，您的组号为：<?php
				echo $id;
			?>
		</div>
	</body>
</html>