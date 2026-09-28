<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sức Khỏe Công Dân</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container py-5 text-center">
    <div class="p-5 mb-4 bg-white rounded-3 shadow-sm border">
        <div class="container-fluid py-3">
            <h1 class="display-5 fw-bold text-primary mb-3">HỆ THỐNG QUẢN LÝ SỨC KHỎE CÔNG DÂN</h1>
            <hr class="my-4" style="max-width: 200px; margin: 0 auto;">
            <div class="d-flex justify-content-center gap-3 mt-4 flex-wrap">
                <a href="${pageContext.request.contextPath}/benh-vien/add" class="btn btn-outline-primary px-4">
                    <i class="fa-solid fa-plane me-1"></i> Quản lý Bệnh Viện
                </a>
            </div>
        </div>
    </div>
</div>
</body>
</html>