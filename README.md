# JavaShop - E-commerce Platform

JavaShop is a modern e-commerce platform built with Spring Boot, offering a robust and secure shopping experience. The platform features a clean, responsive design and implements industry-standard security practices.

## 🚀 Features

- **User Authentication & Authorization**
  - Secure login system
  - OAuth2 integration with GitHub
  - Role-based access control

- **Product Management**
  - Product catalog with categories
  - Detailed product views
  - Search functionality

- **Shopping Experience**
  - Shopping cart functionality
  - Secure checkout process
  - Order tracking

- **Security**
  - Spring Security integration
  - Encrypted data storage
  - Secure payment processing

## 🛠️ Technology Stack

- **Backend**
  - Java 21
  - Spring Boot 2.7.18
  - Spring Security
  - Spring Data JPA
  - Hibernate 5.6.15
  - MySQL 8.0

- **Frontend**
  - Thymeleaf
  - Bootstrap
  - JavaScript
  - CSS3

## 📋 Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher
- Git

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone [repository-url]
   cd javashop-pro
   ```

2. **Configure the database**
   - Create a MySQL database
   - Update `application-dev.properties` with your database credentials

3. **Build the project**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the application**
   - Open your browser and navigate to `http://localhost:8080`

## 🔧 Configuration

The application uses different profiles for development and production environments:

- **Development**: `mvn spring-boot:run -Pdev`
- **Production**: `mvn spring-boot:run -Pproduction`

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── se/systementor/supershoppen/
│   │       ├── controllers/
│   │       ├── models/
│   │       ├── repositories/
│   │       ├── services/
│   │       └── security/
│   └── resources/
│       ├── static/
│       ├── templates/
│       └── application-*.properties
└── test/
```

## 🔒 Security

- OAuth2 authentication with GitHub
- Spring Security for authorization
- Encrypted password storage
- CSRF protection
- Secure session management

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👥 Authors

- @aspcodenet
- @metetrkn
- @eliascaws
- @Elijah71176
- @Mim4033
- @bit92