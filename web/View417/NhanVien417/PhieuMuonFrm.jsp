<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="Model.BanDoc417" %>
<%@ page import="Model.TaiLieu417" %>
<%@ page import="Controller.ChoMuonTaiLieu" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Phiếu Mượn</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<!-- Phần Header -->
<header>
    <h1>Phiếu Mượn</h1>
</header>

<!-- Hiển thị thông tin mượn -->
<section>
    <h2>Phiếu mượn</h2>
    <p>Ngày in: ${formattedDate}</p>
    <p>Ngày mượn: ${ChoMuonTaiLieu.getNgayMuon()}</p>
    <p>Ngày trả dự kiến: ${ChoMuonTaiLieu.getNgayTra()}</p>
    <p>Trạng thái: ${ChoMuonTaiLieu.getTrangThai()}</p>
    <p>Thông tin bạn đọc</p>
    <p>Mã bạn đọc: ${BanDoc417.id}</p>
