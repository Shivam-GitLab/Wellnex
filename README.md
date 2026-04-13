# 🚀 Wellnex - Fitness & Wellness Platform

> A backend-driven fitness and wellness platform designed to help users track workouts, health metrics, and lifestyle progress.

[![Java](https://img.shields.io/badge/Java-100%25-orange?style=flat-square&logo=java)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Latest-green?style=flat-square&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)](README.md)

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Project Structure](#project-structure)
- [API Documentation](#api-documentation)
- [Learning Path](#learning-path)
- [Architecture](#architecture)
- [Security](#security)
- [Deployment](#deployment)
- [Course Content](#course-content)
- [Contributing](#contributing)
- [License](#license)

---

## ⭐ Features

### Core Functionality
- ✅ **User Authentication & Authorization** - Secure JWT-based authentication with role-based access control
- ✅ **Activity Tracking** - Track multiple fitness activities and workouts
- ✅ **Health Metrics** - Monitor key health indicators and progress
- ✅ **AI-Powered Recommendations** - Get personalized fitness suggestions based on activities
- ✅ **Secure REST APIs** - Production-ready API endpoints with comprehensive documentation
- ✅ **Role-Based Access Control (RBAC)** - Different access levels for users, trainers, and admins

### Security Features
- ✅ Spring Security framework integration
- ✅ JWT Token-based authentication
- ✅ BCrypt password encryption
- ✅ Input validation and sanitization
- ✅ Method-level security annotations
- ✅ CORS configuration

### Developer Features
- ✅ API documentation with Swagger/OpenAPI
- ✅ Clean code with Lombok annotations
- ✅ Docker containerization
- ✅ Cloud-ready deployment
- ✅ Comprehensive logging and error handling

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| **Language** | Java 11+ |
| **Framework** | Spring Boot 2.x+ |
| **Database** | MySQL 8.0+ |
| **ORM** | JPA & Hibernate |
| **Authentication** | Spring Security + JWT |
| **Validation** | Spring Boot Bean Validation |
| **Documentation** | Swagger 3.0 (OpenAPI) |
| **Build Tool** | Maven |
| **Containerization** | Docker & Docker Compose |
| **Code Quality** | Lombok, SLF4J |

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** - 11 or higher
  ```bash
  java -version
  ```
- **Maven** - 3.6.0 or higher
  ```bash
  mvn -version
  ```
- **MySQL Server** - 8.0 or higher
  ```bash
  mysql --version
  ```
- **Docker** (Optional) - For containerization
  ```bash
  docker --version
  ```
- **Git** - For version control
  ```bash
  git --version
  ```

---

## 🚀 Installation

### Step 1: Clone the Repository
```bash
git clone https://github.com/Shivam-GitLab/Wellnex.git
cd Wellnex
```

### Step 2: Create MySQL Database
```bash
mysql -u root -p
CREATE DATABASE wellnex;
USE wellnex;
```

### Step 3: Configure Application Properties
Create or update `src/main/resources/application.properties`:
```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/api

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/wellnex
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true

# JWT Configuration
jwt.secret=your_jwt_secret_key_here_minimum_32_characters
jwt.expiration=86400000

# Logging
logging.level.root=INFO
logging.level.com.wellnex=DEBUG

# Swagger/OpenAPI
springdoc.swagger-ui.enabled=true
```

### Step 4: Build the Project
```bash
mvn clean install
```

### Step 5: Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

---

## ⚙️ Configuration

### JWT Configuration
Ensure you set a strong JWT secret in your `application.properties`:
```properties
jwt.secret=your_super_secret_key_minimum_32_characters_long
jwt.expiration=86400000  # 24 hours in milliseconds
```

### Database Connection Pool
```properties
spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.minimum-idle=5
```

### Security Headers
CORS and security headers are configured to allow safe cross-origin requests.

---

## 📁 Project Structure

```
Wellnex/
├── src/
│   ├── main/
│   │   ├── java/com/wellnex/
│   │   │   ├── controller/          # REST API Endpoints
│   │   │   ├── service/             # Business Logic
│   │   │   ├── repository/          # Data Access Layer (JPA)
│   │   │   ├── entity/              # JPA Entities
│   │   │   ├── dto/                 # Data Transfer Objects
│   │   │   ├── security/            # Security Filters & JWT
│   │   │   ├── exception/           # Custom Exceptions
│   │   │   ├── config/              # Spring Configuration
│   │   │   └── WellnexApplication.java  # Main Entry Point
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application-prod.properties
│   └── test/                        # Unit & Integration Tests
├── Dockerfile                       # Docker Configuration
├── docker-compose.yml              # Multi-container Setup
├── pom.xml                         # Maven Dependencies
└── README.md                       # This File

```

---

## 📚 API Documentation

Once the application is running, access the Swagger UI at:
```
http://localhost:8080/api/swagger-ui.html
```

### Key API Endpoints

#### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - User login (returns JWT token)
- `POST /api/auth/refresh` - Refresh JWT token

#### User Management
- `GET /api/users/profile` - Get current user profile
- `PUT /api/users/profile` - Update user profile
- `GET /api/users/{id}` - Get user by ID

#### Activity Tracking
- `POST /api/activities` - Log a new activity
- `GET /api/activities` - Get all user activities
- `GET /api/activities/{id}` - Get activity by ID
- `PUT /api/activities/{id}` - Update activity
- `DELETE /api/activities/{id}` - Delete activity

#### Recommendations
- `GET /api/recommendations` - Get AI-powered recommendations
- `GET /api/recommendations/activity/{activityId}` - Get recommendations for specific activity

For detailed request/response schemas, refer to Swagger documentation.

---

## 🎓 Learning Path

This project is structured as a comprehensive learning resource for Spring Boot and backend development:

### Level 1: Fundamentals
- Spring Boot project setup and configuration
- Database design with JPA & Hibernate
- REST API basics

### Level 2: Intermediate
- DTO Pattern for clean API contracts
- Builder Pattern for complex object creation
- Spring Data JPA with custom queries
- Service layer architecture

### Level 3: Advanced
- Spring Security framework
- JWT authentication and authorization
- Role-Based Access Control (RBAC)
- Method-level security

### Level 4: Production
- Input validation and error handling
- API documentation with Swagger
- Logging and monitoring
- Docker containerization
- Cloud deployment

---

## 🏗️ Architecture

### Layered Architecture
```
┌─────────────────────────────────────┐
│     REST API Controllers            │
├─────────────────────────────────────┤
│     Service Layer (Business Logic)  │
├─────────────────────────────────────┤
│     Repository Layer (Data Access)  │
├─────────────────────────────────────┤
│     Entity & Database Layer         │
└─────────────────────────────────────┘
```

### Security Architecture
```
┌─────────────────────────────────────┐
│     Incoming HTTP Request           │
├─────────────────────────────────────┤
│     Spring Security Filters         │
│     ├─ JWT Validation Filter        │
│     ├─ Authentication Filter        │
│     └─ Authorization Filter         │
├─────────────────────────────────────┤
│     Controller & Service            │
└─────────────────────────────────────┘
```

---

## 🔒 Security

### Authentication Flow
1. User registers with email and password
2. Password is encrypted using BCrypt
3. User logs in and receives JWT token
4. Token is sent with each API request in Authorization header
5. Server validates token and processes request

### Authorization
- Role-based access control (USER, TRAINER, ADMIN)
- Method-level security annotations
- Endpoint-level security rules

### Best Practices Implemented
- ✅ Passwords never stored in plain text
- ✅ JWT tokens have expiration time
- ✅ CORS properly configured
- ✅ Input validation on all endpoints
- ✅ SQL injection prevention via JPA
- ✅ Error responses don't leak sensitive info

---

## 🐳 Docker Deployment

### Build Docker Image
```bash
docker build -t wellnex:latest .
```

### Run with Docker Compose
```bash
docker-compose up -d
```

This will start:
- Wellnex Spring Boot application on port 8080
- MySQL database on port 3306

### Docker Compose Configuration
```yaml
version: '3.8'
services:
  mysql:
    image: mysql:8.0
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: wellnex
    ports:
      - "3306:3306"
  
  wellnex:
    build: .
    ports:
      - "8080:8080"
    depends_on:
      - mysql
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/wellnex
```

---

## ☁️ Cloud Deployment

### Deploy to Popular Platforms
- **Heroku** - Use Procfile and buildpacks
- **AWS** - Deploy via Elastic Beanstalk or EC2
- **Azure** - App Service or Container Instances
- **Google Cloud** - Cloud Run or App Engine
- **DigitalOcean** - App Platform or Droplets

---

## 📖 Course Content

This project is built alongside a comprehensive 10+ hour Spring Boot course covering:

- Database design and ER diagrams
- Spring Boot project structure
- REST API development
- DTO and Builder patterns
- Spring Data JPA
- AI-powered recommendations
- Spring Security fundamentals
- JWT authentication
- Role-based access control
- Password encryption with BCrypt
- Input validation
- Swagger documentation
- Docker containerization
- Cloud deployment

---

## 🧪 Testing

### Run Unit Tests
```bash
mvn test
```

### Run Integration Tests
```bash
mvn verify
```

### Code Coverage
```bash
mvn test jacoco:report
```

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Guidelines
- Follow Java naming conventions
- Write clean, documented code
- Add tests for new features
- Update README if necessary

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 📞 Support & Community

- 🐛 Found a bug? [Create an issue](https://github.com/Shivam-GitLab/Wellnex/issues)
- 💡 Have a suggestion? [Start a discussion](https://github.com/Shivam-GitLab/Wellnex/discussions)

---

## 🎯 Roadmap

- [ ] Mobile app integration
- [ ] Advanced analytics dashboard
- [ ] Social features (friend challenges, leaderboards)
- [ ] Integration with wearable devices
- [ ] Machine learning for personalized recommendations
- [ ] Multi-language support
- [ ] Payment integration for premium features

---

## 👏 Acknowledgments

- Spring Boot and Spring Security documentation
- Java community and best practices
- All contributors and users

---

**Last Updated:** 2026-04-13 18:20:58  
**Version:** 1.0.0  
**Status:** Active Development ✅

Made with ❤️ by [Shivam-GitLab](https://github.com/Shivam-GitLab)
