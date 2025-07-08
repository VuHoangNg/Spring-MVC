# LaptopShop - Spring MVC Application

Một ứng dụng web quản lý cửa hàng laptop được xây dựng bằng Spring Boot và Spring MVC.

## Mô tả dự án

LaptopShop là một ứng dụng web full-stack được phát triển với Spring Boot framework, sử dụng:
- **Spring MVC** cho xử lý web layer
- **Spring Data JPA** cho data access layer  
- **Spring Security** cho authentication và authorization
- **JSP** cho view template
- **MySQL** cho database
- **Bootstrap** cho UI styling

## Tính năng chính

- 🔐 Quản lý người dùng (User Management)
- 📊 Dashboard quản trị
- 🛒 Quản lý sản phẩm laptop
- 👥 Hệ thống phân quyền
- 📱 Responsive UI với Bootstrap

## Công nghệ sử dụng

- **Java 17**
- **Spring Boot 3.2.2**
- **Spring MVC**
- **Spring Data JPA**
- **Spring Security**
- **MySQL Connector**
- **JSP & JSTL**
- **Bootstrap**
- **Maven**

## Cấu trúc project

```
src/
├── main/
│   ├── java/
│   │   └── vn/vproject/laptopshop/
│   │       ├── config/          # Cấu hình Spring
│   │       ├── controller/      # MVC Controllers
│   │       ├── domain/          # Entity classes
│   │       ├── repository/      # Data repositories
│   │       ├── service/         # Business logic
│   │       └── LaptopshopApplication.java
│   ├── resources/
│   │   └── application.properties
│   └── webapp/
│       ├── resources/css/       # CSS files
│       └── WEB-INF/view/        # JSP templates
└── test/
    └── java/                    # Unit tests
```

## Cài đặt và chạy

### Yêu cầu hệ thống
- Java 17 hoặc cao hơn
- Maven 3.6+
- MySQL 8.0+

### Hướng dẫn chạy

1. **Clone repository**
   ```bash
   git clone <repository-url>
   cd Spring-MVC
   ```

2. **Cấu hình database**
   - Tạo database MySQL với tên `laptopshop`
   - Cập nhật thông tin kết nối trong `src/main/resources/application.properties`

3. **Chạy ứng dụng**
   ```bash
   # Sử dụng Maven wrapper
   ./mvnw spring-boot:run
   
   # Hoặc sử dụng Maven
   mvn spring-boot:run
   ```

4. **Truy cập ứng dụng**
   - Mở trình duyệt và truy cập: `http://localhost:8080`

## Cấu hình Database

Cập nhật file `application.properties`:

```properties
# Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/laptopshop
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## API Endpoints

### User Management
- `GET /` - Trang chủ
- `GET /admin/user` - Danh sách người dùng
- `GET /admin/user/create` - Form tạo người dùng mới
- `POST /admin/user/create` - Xử lý tạo người dùng
- `GET /admin/user/{id}` - Chi tiết người dùng

## Đóng góp

1. Fork repository
2. Tạo feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Tạo Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Liên hệ

Project Link: [https://github.com/yourusername/Spring-MVC](https://github.com/yourusername/Spring-MVC)

