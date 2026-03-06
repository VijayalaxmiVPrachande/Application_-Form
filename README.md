# Application Form System (Spring Boot + MySQL)

## 📌 Project Overview

This project is a simple **Application Form Management System** built using **Spring Boot** and **MySQL**.
Users can fill out an application form through a web interface, and the submitted data is sent to a **Spring Boot REST API** and stored in a **MySQL database** using **JPA/Hibernate**.

This project demonstrates how frontend form data is processed by a backend server and saved into a relational database.

---

## 🚀 Features

* Application form submission
* REST API built with Spring Boot
* MySQL database integration
* Data storage using JPA / Hibernate
* Backend built using Maven
* Input validation on the frontend

---

## 🛠 Technologies Used

* Java
* Spring Boot
* Maven
* MySQL
* JPA / Hibernate
* HTML
* CSS
* JavaScript (Fetch API)

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/application-form-system.git
```

### 2️⃣ Open the project

Open the project in **VS Code / IntelliJ / Eclipse**.

### 3️⃣ Configure MySQL

Create a database in MySQL:

```
CREATE DATABASE applicationdb;
```

Update your `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/applicationdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Run the project

Run using Maven:

```
mvn spring-boot:run
```

Server will start on:

```
http://localhost:8081
```

---

## 🔗 API Endpoints

### Get all applicants

```
GET /api/applicants
```

### Submit application

```
POST /api/applicants
```

Example JSON request:

```
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john@example.com",
  "phone": "9876543210",
  "address": "New York"
}
```

---

## 🎯 Learning Outcomes

* Understanding **Spring Boot REST APIs**
* Connecting **Spring Boot with MySQL**
* Using **JPA/Hibernate for database operations**
* Handling **HTTP requests from frontend to backend**
* Building a simple **full-stack form submission system**

---

