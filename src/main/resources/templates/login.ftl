<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Insert title here</title>
</head>
<body>

<fieldset>
  <table width="933" height="412">
    <tr height="170">
      <td width="570px"> </td>
      <td> </td>
    </tr>
    <tr>
      <td> </td>
      <td><table>
        <form method ="POST" action="/login/confirm" name="frmLogin"  >
          <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" size="20" maxlength="20" onfocus="if (this.value=='Your name')  this.value='';" /></td>
            <td > </td>
            <td> </td>
          </tr>
          <tr>
            <td>密  码：</td>
            <td><input type="password" name="password" size="20" maxlength="20" onfocus="if (this.value=='Your password')  this.value='';" /></td>
            <td> </td>
            <td> </td>
          </tr>
      </table>
      </td>
    <tr>
      <td> </td>
      <td><table>
        <tr>
          <td><input type="submit" name="login" value="登录" onClick="return validateLogin()"/></td>
          <td><input type="button" name="button" value="注册" onclick="return waitFuture()"></td>
        </tr>
        </tr>
      </table>
      </td>
  </table>
</fieldset>
</form>
<script language="javascript">
  function validateLogin(){
    var sUserName = document.frmLogin.username.value ;
    var sPassword = document.frmLogin.password.value ;
    if ((sUserName =="") || (sUserName=="Your name")){
      alert("请输入用户名!");
      return false ;
    }

    if ((sPassword =="") || (sPassword=="Your password")){
      alert("请输入密码!");
      return false ;
    }
  }
  function waitFuture(){
    alert("之后开启注册功能");
  }
</script>
</body>
</html>
