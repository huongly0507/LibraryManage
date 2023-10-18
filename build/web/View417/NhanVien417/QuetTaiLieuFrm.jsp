<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.TaiLieu417" %>
<%@ page import="Model.BanDoc417" %>
<%@ page import="Controller.ChoMuonTaiLieu" %>
<c:set var="redirectUrl" value="PhieuMuonFrm.jsp" />
<c:redirect url="${redirectUrl}" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quét tài liệu</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<!-- Phần Header -->
<header>
    <h1> QUÉT TÀI LIỆU</h1>
</header>

<!-- Phần Form Nhập Mã Tài Liệu -->
<section>
    <form id="borrowDetailsForm" action="borrow-result.jsp" method="post">
        <label for="documentId">ID:</label>
        <input type="text" id="documentId" name="documentId" required>
        <input type="hidden" name="readerId" value="${reader.id}">
        <button type="submit" name="action" value="submit">Submit</button>
        <button type="submit" name="action" value="print">Print</button>
    </form>
</section>

<!-- Hiển thị thông tin tài liệu nếu có -->
<c:if test="${not empty document}">
    <section>
        <h2>Thông tin tài liệu</h2>
        <p>Mã tài liệu: ${document.id}</p>
        <p>Tên tài liệu: ${document.title}</p>
        <!-- Hiển thị thông tin khác của tài liệu -->
    </section>
</c:if>

<!-- Thêm các script JavaScript và thư viện cần thiết tại đây -->

</body>
</html>
