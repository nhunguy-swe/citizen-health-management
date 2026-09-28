<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Danh sách Bệnh Viện</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container">
  <div class="card shadow mb-4">
    <div class="card-header bg-warning text-dark">
      <h4 class="mb-0"><i class="fa-solid fa-route me-2"></i>Tra Cứu Thông Tin Bệnh Viện</h4>
    </div>
    <div class="card-body">
      <form action="${pageContext.request.contextPath}/benh-vien/search" method="GET" class="row g-3">
        <div class="col-md-9">
          <input type="text" name="keyword" class="form-control" value="${keyword}" placeholder="Nhập tên Bệnh viện cần tìm...">
        </div>
        <div class="col-md-3">
          <button type="submit" class="btn btn-dark w-100"><i class="fa-solid fa-magnifying-glass me-1"></i> Tra cứu</button>
        </div>
      </form>
    </div>
  </div>

  <div class="card shadow">
    <div class="card-body">
      <table class="table table-bordered table-hover text-center align-middle mb-0">
        <thead class="table-warning">
        <tr>
          <th>Mã Bệnh Viện</th>
          <th>Tên Bệnh Viện</th>
          <th>Cấp Bệnh Viện</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="t" items="${dsBenhVien}">
          <tr>
            <td>${t.maBenhVien}</td>
            <td>${t.tenBenhVien}</td>
            <td>${t.capBenhVien}</td>
          </tr>
        </c:forEach>
        <c:if test="${empty dsBenhVien}">
          <tr>
            <td colspan="6" class="text-muted py-3">Không tìm thấy thông tin Bệnh Viện!</td>
          </tr>
        </c:if>
        </tbody>
      </table>
    </div>
  </div>
</div>
</body>
</html>
