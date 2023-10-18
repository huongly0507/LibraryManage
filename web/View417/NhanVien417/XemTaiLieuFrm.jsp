<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="your.package.model.Document" %>
<%@ page import="your.package.service.DocumentService" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Xem tài liệu</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<!-- Phần Header -->
<header>
    <h1>XEM TAI LIỆU</h1>
</header>

<!-- Phần Hiển Thị Thông Tin Tài Liệu -->
<section>
    <c:if test="${not empty document}">
        <table>
            <tr>
                <th>Mã</th>
                <th>Tên</th>
                <th>Tác giả</th>
                <th>Năm xuất bản</th>
                <th>Loại tài liệu</th>
            </tr>
            <tr>
                <td>${document.id}</td>
                <td>${document.title}</td>
                <td>${document.author}</td>
                <td>${document.publishYear}</td>
                <td>${document.borrowCount}</td>
                <td>${document.documentType}</td>
            </tr>
        </table>
    </c:if>
</section>

</body>
</html>
