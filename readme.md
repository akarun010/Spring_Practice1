# Spring Boot Project — Initial Setup

This project was created as the starting point for learning **Spring Framework and Spring Boot**.

The purpose of this project is to understand how to initialize a Spring Boot application, configure the project using Maven, and run the application using the embedded server.

## 🚀 Technologies Used

* Java 17
* Spring Boot
* Spring Framework
* Maven
* IntelliJ IDEA
* Embedded Tomcat

## 📌 Project Setup

The project was initialized using **Spring Initializr**.

### Project Configuration

```text
Project      : Maven
Language     : Java
Java Version : 17
Packaging    : Jar
```

## 📁 Project Structure

```text
spring-project/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── arun/
│   │   │           └── springproject/
│   │   │               └── SpringProjectApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

## ⚙️ Main Application Class

The Spring Boot application starts from the main application class.

```java
@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }
}
```

### `@SpringBootApplication`

This is the main annotation used to start a Spring Boot application.

It combines important Spring annotations and enables:

* Spring Boot configuration
* Component scanning
* Auto-configuration

## 🌐 Embedded Tomcat

Spring Boot provides an embedded Tomcat server, so an external Tomcat installation is not required to run the application.

By default, the application runs on:

```text
http://localhost:8080
```

## 📦 Maven

Maven is used to:

* Manage dependencies
* Build the project
* Package the application
* Run the application

The project configuration and dependencies are managed inside:

```text
pom.xml
```

## 📝 Learning Progress

* [x] Create Spring Boot project
* [x] Configure Java version
* [x] Understand Maven project structure
* [x] Understand `pom.xml`
* [x] Understand `@SpringBootApplication`
* [x] Run Spring Boot application
* [x] Understand embedded Tomcat
* [ ] Spring IoC
* [ ] Dependency Injection
* [ ] Spring Beans
* [ ] Spring Configuration
* [ ] Spring REST API
* [ ] Spring Data JPA
* [ ] Spring Security
* [ ] JWT

## 🎯 Next Step

The next step is to learn the **Spring Framework fundamentals**, especially:

```text
IoC
 ↓
Dependency Injection
 ↓
Spring Beans
 ↓
Component Scanning
 ↓
Spring Configuration
```

---

## 📚 Course

**Spring Framework & Spring Boot**

This project is part of my learning journey toward becoming a **Java Full Stack Developer**.
