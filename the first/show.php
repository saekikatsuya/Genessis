<?php
	header('Content-Type:text/html;charset=utf-8');
	$admin = false;
	session_start();
	if (isset($_SESSION["admin"]) && $_SESSION["admin"] ) {
		// echo "<script language='javascript'>alert('您已经成功登陆');</script>";
	} 
	else {
		$_SESSION["admin"] = false;
		die("<script language='javascript'>alert('登录失败');window.location.href='administrator.html';</script>");
	}

	$con=mysql_connect("localhost","root","") or die('找不到要连接的服务器。');

	mysql_select_db("first",$con) or die('不能连接数据库。');

	mysql_set_charset('utf8');

	$res_radio=mysql_query("select * from thefirst limit 0,10") or die('取不来数据1');

	$num = mysql_num_rows($res_radio);

	$row = mysql_fetch_array($res_radio);
?>

<html>
	<head>
		<meta http-equiv="Content-type" content="text/html;charset=utf-8"/>
		<title>传说中的网页-管理员界面</title>
	</head>
	<body>
	<table>
		<tr>
				<th>组号</th>
				<th>姓名1</th>
				<th>性别1</th>
				<th>学院1</th>
				<th>年级1</th>
				<th>联系电话1</th>
				<th>姓名2</th>
				<th>性别2</th>
				<th>学院2</th>
				<th>年级2</th>
				<th>联系电话2</th>
				<th>得分</th>
		</tr>
	<?php
		for($j=0;$j<$num;$j++){
			$k=$row['id'];
			echo "<tr>";		
			echo "<td>{$row['id']}</td>";
			echo "<td>{$row['name1']}</td>";
			echo "<td>{$row['sex1']}</td>";
			echo "<td>{$row['academy1']}</td>";
			echo "<td>{$row['grade1']}</td>";
			echo "<td>{$row['tel1']}</td>";
			echo "<td>{$row['name2']}</td>";
			echo "<td>{$row['sex2']}</td>";
			echo "<td>{$row['academy2']}</td>";
			echo "<td>{$row['grade2']}</td>";
			echo "<td>{$row['tel2']}</td>";
			echo "<td>{$row['score']}</td>";
			echo "</tr>";

			$row=mysql_fetch_array($res_radio);
		}

	?>
	</table>


	</body>
</html>
