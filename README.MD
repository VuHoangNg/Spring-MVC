# LaptopShop - Spring MVC Application

A web application for laptop store management built with Spring Boot and Spring MVC.

## Project Description

LaptopShop is a full-stack web application developed with Spring Boot framework, utilizing:
- **Spring MVC** for web layer handling
- **Spring Data JPA** for data access layer  
- **Spring Security** for authentication and authorization
- **JSP** for view templates
- **MySQL** for database
- **Bootstrap** for UI styling

## Key Features

- 🔐 User Management
- 📊 Admin Dashboard
- 🛒 Laptop Product Management
- 👥 Role-based Authorization System
- 📱 Responsive UI with Bootstrap

## Technologies Used

- **Java 17**
- **Spring Boot 3.2.2**
- **Spring MVC**
- **Spring Data JPA**
- **Spring Security**
- **MySQL Connector**
- **JSP & JSTL**
- **Bootstrap**
- **Maven**

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── vn/vproject/laptopshop/
│   │       ├── config/          # Spring Configuration
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

## Installation and Setup

### System Requirements
- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+

### Getting Started

1. **Clone repository**
   ```bash
   git clone <repository-url>
   cd Spring-MVC
   ```

2. **Database Configuration**
   - Create a MySQL database named `laptopshop`
   - Update connection details in `src/main/resources/application.properties`

3. **Run the application**
   ```bash
   # Using Maven wrapper
   ./mvnw spring-boot:run
   
   # Or using Maven
   mvn spring-boot:run
   ```

4. **Access the application**
   - Open your browser and navigate to: `http://localhost:8080`

## Database Configuration

Update the `application.properties` file:

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
- `GET /` - Home page
- `GET /admin/user` - User list
- `GET /admin/user/create` - Create user form
- `POST /admin/user/create` - Process user creation
- `GET /admin/user/{id}` - User details

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Create a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.


