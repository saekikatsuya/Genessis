<?php
	header("Content-Type:text/html;charset=utf-8");
	$name1=$_POST["name1"];
	$sex1=$_POST["sex1"];
	$academy1=$_POST["academy1"];
	$grade1=$_POST["grade1"];
	$tel1=$_POST["tel1"];
	$name2=$_POST["name2"];
	$sex2=$_POST["sex2"];
	$academy2=$_POST["academy2"];
	$grade2=$_POST["grade2"];
	$tel2=$_POST["tel2"];
	$score=0;


	$con=mysql_connect("localhost","root","")or die("<script language='javascript'> alert('提交失败1');</script>");
	mysql_select_db("first",$con)or die("<script language='javascript'> alert('提交失败2');</script>");
	mysql_set_charset('utf8');

	$response=mysql_num_rows((mysql_query("select id from thefirst where id='45'")));
	if($response>0){
		echo "<script language='javascript'>alert('报名已结束');</script>";
	}
	else{
		mysql_query("insert into thefirst value('','$name1','$sex1','$academy1','$grade1','$tel1','$name2','$sex2','$academy2','$grade2','$tel2','$score')")or die("<script language='javascript'> alert('提交失败3');</script>");

		$lifeTime = 24 * 3600;
		session_set_cookie_params($lifeTime);
		session_start();
		$_SESSION["admin"] = true;

		$res_radio=mysql_query("select * from thefirst where tel1 = '$tel1'") or die('取不来数据QAQ');

		$num=mysql_num_rows($res_radio);
		$row=mysql_fetch_array($res_radio);





		$_SESSION["temp"]=array($row['id']);








		echo "<script language='javascript'>window.location.href='success.php';</script>";
	}
?>