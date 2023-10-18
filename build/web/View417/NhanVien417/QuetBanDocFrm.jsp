<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.BanDoc417" %>
<%@ page import="Controller.ChoMuonTaiLieu" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quét bạn đọc</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<!-- Phần Header -->
<header>
    <h1>QUÉT BẠN ĐỌC</h1>
</header>

<!-- Phần Form Tìm Kiếm Bạn Đọc -->
<section>
    <form id="searchReaderForm" action="borrow-form.jsp" method="post">
        <label for="readerId">ID:</label>
        <input type="text" id="readerId" name="readerId" required>
        <button type="submit">Tìm kiếm</button>
    </form>
</section>

<!-- Hiển thị thông tin bạn đọc nếu có -->
<c:if test="${not empty reader}">
    <section>
        <h2>Thông tin bạn đọc</h2>
        <p>Mã bạn đọc: ${BanDoc417.id}</p>
        <p>Tên bạn đọc: ${BanDoc417.HoTen}</p>
        <!-- Hiển thị thông tin khác của bạn đọc -->
    </section>
</c:if>

<!-- Thêm các script JavaScript và thư viện cần thiết tại đây -->

</body>
</html>
