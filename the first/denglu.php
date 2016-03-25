<?php
	header("Content-Type:text/html;charset=utf-8");
	@$username=$_POST["username"];

	//密码加密
	@$password=md5($_POST["password"]);

	//连接数据库balabala
	$con=mysql_connect("localhost","root","") or die('找不到要连接的服务器。');

	mysql_select_db("first",$con) or die('不能连接数据库。');

	mysql_set_charset('utf8');

	//比对用户名相同密码是否相同+用户名是否存在
	$response = mysql_fetch_array( mysql_query("select password from administrator where username = '$username' ")) or die("<script language='javascript'> alert('用户名或密码错误！');window.location.href='administrator.html';</script>");
	$result = $response["password"];
	if($password==$result){
		//下面那一串和信息传递有关要注意啊
		$lifeTime = 24 * 3600;
		session_set_cookie_params($lifeTime);
		session_start();
		$_SESSION["admin"] = true;
		$_SESSION["temp"]=array($username);

		echo "<script language='javascript'>window.location.href='show.php';</script>";
	}
	else{
		echo "<script language='javascript'> alert('用户名或密码错误！');window.location.href='administrator.html';</script>";
	}
?>