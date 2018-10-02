<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>超智能记事本</title>
  <link type="text/css" rel="stylesheet" href="/css/goal.css">
</head>
<body>

<div class="exit">
  <button type="button" onclick="window.location.href='../templates/login.html'">退出</button>
</div>

<div class="main">
  <table>
    <caption>
      严于律己，努力成为别人的梦想
    </caption>
    <tr>
      <th>编号</th>
      <th>目标</th>
      <th>过期时间</th>
    </tr>
    <#list goals as goal>
      <tr class="cellColor">
        <td class="center">${goal.id}</td>
        <td class="center">${goal.goal}</td>
        <td class="center">${goal.expireTime}</td>
      </tr>
    </#list>
  </table>
</div>

<#--<div class="main">
  <form action="http://www.starbuzzcoffee.com/processorder.php" method="post">
    <div class="tableRow">
      <label for="loginName" class="label">新目标:</label>
      <input type="text" id="loginName" name="loginName" value="" placeholder="请输入牛掰的目标">
    </div>
    <div class="tableRow">
      <label for="expireDate">过期时间:</label>
      <input type="date" id="expireDate" name="expireDate" value="" placeholder="时间">
    </div>
    <div class="formButton">
      <label></label>&ensp;
      <button type="button" value="">新增</button>
    </div>
  </form>
</div>-->
</body>
</html>



