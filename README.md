# Quản Lý Sức Khỏe Công Dân

<p>
  <img src="https://img.shields.io/badge/Java-17%2B-orange" alt="Java">
  <img src="https://img.shields.io/badge/Spring%20Boot-Backend-6DB33F?logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Build-Maven-blue" alt="Maven">
</p>

Hệ thống quản lý thông tin sức khỏe công dân, xây dựng bằng **Spring Boot**, quản lý bằng **Maven** (Maven Wrapper), có script khởi tạo cơ sở dữ liệu sẵn trong thư mục `database/`.

---

## Giới thiệu (About)

Dự án mô phỏng nghiệp vụ quản lý hồ sơ sức khỏe của công dân trong một cộng đồng/địa phương: lưu trữ thông tin cá nhân, tiền sử bệnh, lịch sử khám chữa bệnh. Phục vụ mục đích học tập, thực hành xây dựng backend theo kiến trúc Spring Boot (Controller – Service – Repository – Entity) kết hợp cơ sở dữ liệu quan hệ.

> Ghi chú: danh sách tính năng dưới đây là bản nháp dựa trên tên và cấu trúc dự án. Bạn chỉnh lại cho khớp với các API/chức năng thực tế trong `src/main`.

---

## Tính năng chính (dự kiến — chỉnh lại theo thực tế)

- Quản lý hồ sơ công dân (thông tin cá nhân, CCCD/CMND)
- Ghi nhận thông tin sức khỏe, tiền sử bệnh
- Theo dõi lịch sử khám chữa bệnh
- Tra cứu, tìm kiếm hồ sơ theo tiêu chí

---

## Công nghệ sử dụng

| Thành phần | Công nghệ |
|---|---|
| Ngôn ngữ | Java 17+ |
| Framework | Spring Boot |
| Database | Script SQL trong thư mục `database/` |
| Build tool | Maven (Maven Wrapper `mvnw` / `mvnw.cmd`) |

---

## Cấu trúc dự án

```
quan-ly-suc-khoe-cong-dan/
├── .mvn/wrapper/         # Cấu hình Maven Wrapper
├── database/               # Script SQL khởi tạo cơ sở dữ liệu
├── src/main/                 # Source code chính (Controller, Service, Repository, Entity...)
├── mvnw / mvnw.cmd              # Maven Wrapper script (Linux/macOS & Windows)
├── pom.xml                        # Cấu hình Maven, khai báo dependencies
├── .gitignore
└── README.md
```

---

## Bắt đầu (Getting Started)

### Yêu cầu

- JDK 17+
- MySQL/PostgreSQL (hoặc DB tương ứng script trong `database/`)
- IDE: IntelliJ IDEA / VS Code / Eclipse

### Cài đặt

```bash
git clone https://github.com/nhunguy-swe/quan-ly-suc-khoe-cong-dan.git
cd quan-ly-suc-khoe-cong-dan
```

### Cấu hình Database

1. Chạy script SQL trong thư mục `database/` để tạo bảng và dữ liệu mẫu.
2. Cập nhật thông tin kết nối trong `src/main/resources/application.properties` (hoặc `.yml`).

> ⚠️ **Lưu ý bảo mật:** không hard-code mật khẩu database trực tiếp trong file `.properties` nếu định push lên GitHub public. Nên dùng biến môi trường hoặc file cấu hình riêng đã được thêm vào `.gitignore`.

### Chạy ứng dụng

```bash
# macOS/Linux
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

Mặc định Spring Boot sẽ chạy tại `http://localhost:8080`.

---

## Tác giả

- GitHub: [@nhunguy-swe](https://github.com/nhunguy-swe)

---

## Giấy phép

Dự án này được thực hiện cho mục đích học tập/thực hành cá nhân. Bạn có thể tham khảo, sử dụng lại code cho mục đích học tập.
