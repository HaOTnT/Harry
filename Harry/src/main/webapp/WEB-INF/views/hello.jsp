<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h5>index</h5>
<h5>${test}</h5>

<form action="/upload/upLoadFile" method="post" enctype="multipart/form-data">
    <h6>文件上传</h6>
    文件：<input type="file" name="file">
    <input type="submit" value="upload">
</form>
</body>
</html>
