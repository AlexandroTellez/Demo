# 🌟 Demo

**Demo** is a foundational project designed to practice and showcase backend development skills using **Spring Boot** and creating a student database. It serves as a starting point to explore essential concepts such as entity management, REST controllers, and database connectivity.

## 🛠️ Technologies Used

- **Java 21**
- **Spring Boot**
- **Maven**
- **PostgreSQL**
- **VS Code**

---

## 📋 Features

- Backend setup using **Spring Boot**.
- Basic entity and relationship management.
- RESTful APIs for CRUD (Create, Read, Update, Delete) operations.
- Database connectivity to store and retrieve information.
- Scalable and extendable project structure for further enhancements.

---

## ⚙️ Project Setup

### 1. Clone the Repository 📂

* Run the following commands to clone the repository and navigate to the project directory:

```bash
git clone https://github.com/AlexandroTellez/Demo.git
cd Demo
```
### 2. Configure the Database 🗄️

* Ensure PostgreSQL is installed and running. Then, configure the database as follows:

1. Create a database named *student*.
2. Update the credentials in the *application.properties file*:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=alext
spring.datasource.password=**********
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true

```
### 3. Run the project ▶️

1. Open the project in VS Code or your preferred IDE.
2. Start the application using the following command:
```
mvn spring-boot:run
```
### 4. Project Structure 🗂️
```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── entity/
│   │   │   └── Student.java             # Entity class mapping the Student table in the database
│   │   ├── config/
│   │   │   └── StudentConfig.java       # Configuration class for initializing data or defining beans
│   │   ├── controller/
│   │   │   └── StudentController.java   # REST controller handling API endpoints for Student operations
│   │   ├── repository/
│   │   │   └── StudentRepository.java   # JPA repository for CRUD operations on Student entities
│   │   ├── service/
│   │   │   └── StudentService.java      # Service class encapsulating business logic for Student management
│   │
│   ├── DemoApplication.java             # Main class to bootstrap and run the Spring Boot application
│   └── resources/
│       ├── application.properties       # Configuration file for database connection and other settings
└── test/
    ├── java/com/example/demo/
    │   └── DemoApplicationTest.java     # Unit tests for validating application functionality


```
### 5. Contributions 🙌

* Contributions are welcome! If you have ideas or improvements for this project, feel free to open an issue or submit a pull request.

---
### 6. Contact me 📧

* Author: Alexandro Tellez
* Email: alextellezyanes@gmail.com
* LinkedIn: [Alexandro Tellez](https://www.linkedin.com/in/alex-tellez-y/)
---
