<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Insert title here</title>
  <style type="text/css">
    .divForm{
      position: absolute;/*绝对定位*/
      width: 300px;
      height: 200px;

      text-align: center;/*(让div中的内容居中)*/
      top: 50%;
      left: 50%;
      margin-top: -200px;
      margin-left: -150px;
    }
  </style>
</head>
<body>
<table style="text-align:center;FONT-SIZE: 11pt; WIDTH: 600px; FONT-FAMILY: 宋体; BORDER-COLLAPSE: collapse" borderColor=#3399ff cellSpacing=0 cellPadding=0 align=center border=1>
  <tr>
    <td><b>id</b></td>
    <td><b>name</b></td>
  </tr>
    <#list students as stu>
    <tr>
      <td>${stu.id}</td>
      <td>${stu.name}</td>
    </tr>
    </#list>
</table>
<div class="divForm">
  <form name="addform" action="/add" method="post">
    Username: <input type="text" name="username" size="40" maxlength="80">
    <input type="submit" value="新增" onclick="return validateLogin()">
  </form>
</div>
<script language="javascript">
  function validateLogin(){
    var context = document.addform.username.value ;
    if (context ==""){
      alert("请输入内容!");
      return false ;
    }
  }
</script>
</body>
</html>

