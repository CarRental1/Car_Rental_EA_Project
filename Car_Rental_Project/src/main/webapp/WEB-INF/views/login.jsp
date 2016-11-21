<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style2 {font-size: 36px}
-->
</style>
</head>

<body>
<form action="" method="get">
  <span class="style2">
  <label>
  <div align="center"><strong>Login</strong></div>
  </label>
  </span>
<table width="100%" border="0">
  <tr>
    <td width="51%"><div align="right">User Name: *</div></td>
    <td width="49%"><label>
      <input type="text" name="txtUserName" id="txtUserName" />
    </label></td>
  </tr>
  <tr>
    <td><div align="right">Password: *</div></td>
    <td><label>
      <input type="text" name="txtPassword" id="txtPassword" />
    </label></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><label>
      <input type="radio" name="radio" id="radioRememberMe" value="radioRememberMe" />
      Remember my member number on this browser</label></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><label>
      <input type="submit" name="btnLogin" id="btnLogin" value="Submit" />
    </label></td>
  </tr>
</table>

</form>
</body>
</html>
