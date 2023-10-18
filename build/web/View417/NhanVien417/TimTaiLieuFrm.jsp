<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.TaiLieu417" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tìm kiếm tài liệu</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<header>
    <h1>TÌM TÀI LIỆU</h1>
</header>


<section>
    <form id="searchForm" action="search-result.jsp" method="post">
        <label for="searchInput">Key:</label>
        <input type="text" id="searchInput" name="searchInput" required>
        <button type="submit">Tìm kiếm</button>
    </form>
</section>


</body>
</html>
