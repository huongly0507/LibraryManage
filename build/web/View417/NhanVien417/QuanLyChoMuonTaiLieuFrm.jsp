<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page import="Model.BanDoc417" %>
<%@ page import="Model.TaiLieu417" %>
<%@ page import="Controller.ChoMuonTaiLieu" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cho Mượn Tài Liệu</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<!-- Phần Header -->
<header>
    <h1>CHO MƯỢN TÀI LIỆU</h1>
</header>

<!-- Phần Form Cho Mượn Tài Liệu -->
<section>
    <form id="borrowForm" action="search-reader.jsp" method="post">
        <button type="submit">CHO MƯỢN TÀI LIỆU</button>
    </form>
</section>

<!-- Thêm các script JavaScript và thư viện cần thiết tại đây -->

</body>
</html>
