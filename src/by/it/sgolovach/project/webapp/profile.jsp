<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<%@ include file="include/head.htm" %>
<body>
<div class="container">
<%@ include file="include/menu.htm" %>
<p>User:<br>${user}</p>
<p>All ads of User:<br>${listAdsUser}</p>
<form class="form-horizontal" method="post" action="do?command=Profile">
<fieldset>
<legend>Logout</legend>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="logout">logout</label>
  <div class="col-md-4">
    <button id="logout" name="logout" value="ourTrue" class="btn btn-primary">logout</button>
  </div>
</div>
</fieldset>
</form>
</div>
</body>
</html>
