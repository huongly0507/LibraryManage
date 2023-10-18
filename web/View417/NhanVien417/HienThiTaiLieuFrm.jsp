<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="Model.TaiLieu417" %>
<%@ page import="Controller.TimTaiLieu" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tài liệu</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<!-- Phần Header -->
<header>
    <h1>DANH SÁCH TÀI LIỆU</h1>
</header>

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
                <td>${TaiLieu417.ID}</td>
                <td>${TaiLieu417.TenTailieu}</td>
                <td>${TaiLieu417.Tacgia}</td>
                <td>${TaiLieu417.NamXuatban}</td>
                <td>${TaiLieu417.SoLanMuon}</td>
                <td>${TaiLieu417.LoaiTaiLieu}</td>
            </tr>
        </table>
    </c:if>
</section>

</body>
</html>
