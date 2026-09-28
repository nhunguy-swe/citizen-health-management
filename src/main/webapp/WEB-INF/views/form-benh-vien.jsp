
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bệnh Viện</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5" style="max-width: 600px;">
    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>

    <div class="card shadow-sm p-4">
        <c:if test="${param.success != null}">
            <div class="alert alert-success">Lưu thông tin Bệnh viện thành công!</div>
        </c:if>
        <form:form action="${pageContext.request.contextPath}/benh-vien/save" method="POST" modelAttribute="benhVien">
            <div class="mb-3">
                <label class="form-label fw-bold">Tên Bệnh viện</label>
                <form:input path="tenBenhVien" class="form-control" required="required" placeholder="Bệnh viện Từ Vũ"/>
            </div>
            <div class="mb-3">
                <label class="form-label fw-bold">Cấp Bệnh viện</label>
                <form:select path="capBenhVien" class="form-select">
                    <form:option value="Trung Ương" label="Trung Ương"/>
                    <form:option value="Tỉnh" label="Tỉnh"/>
                    <form:option value="Xã" label="Xã"/>
                </form:select>
            </div>
            <button type="submit" class="btn btn-success w-100"><i class="fa-solid fa-floppy-disk"></i> Lưu Bệnh Viện</button>
        </form:form>
    </div>
</div>
</body>
</html>
