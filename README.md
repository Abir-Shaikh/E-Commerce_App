# 🛒 Layered E-Commerce Application (Spring Core)

This project is a **simple E-Commerce application** built using **Spring Core** that demonstrates:

- Layered architecture
- Dependency Injection using `@Autowired`
- Multiple service implementations
- Bean ambiguity handling using `@Qualifier`

It is designed for **learning Spring Core fundamentals**, not for production use.

---

## 📌 Features

- Add & order products
- Process payment using **multiple payment methods**
- Clean separation of concerns
- Dependency Injection using annotations
- Ambiguity handling in Spring beans

---

## 🧱 Architecture Overview

The application follows a **layered architecture**:

MainApp
↓
ProductController (@Controller)
↓
ProductService (@Service)
↓
PaymentService (@Service Interface)
↓
ProductRepository (@Repository)

yaml
Copy code

---

## 📁 Project Structure

Ecommerce_App
├── controller
│ └── ProductController.java
├── service
│ ├── ProductService.java
│ ├── PaymentService.java
│ ├── CardPaymentService.java
│ └── UPIPaymentService.java
├── repository
│ └── ProductRepository.java
├── config
│ └── AppConfig.java
└── MainApp.java

yaml
Copy code

---

## 🔧 Technologies Used

- Java
- Spring Core (Annotations)
- Maven / Gradle (optional)
- Git & GitHub

---

## 💳 Payment Methods (Ambiguity Handling)

The application supports **two payment methods**:

- Card Payment
- UPI Payment

Since both implement the same interface (`PaymentService`), Spring faces **bean ambiguity**.

This is resolved using:

```java
@Qualifier("upiPayment")
or

java
Copy code
@Qualifier("cardPayment")
▶️ How It Works
MainApp starts the Spring container

ProductController receives the request

ProductService handles business logic

PaymentService processes the payment

ProductRepository simulates database storage

▶️ Sample Output
pgsql
Copy code
Product saved in database: Laptop
Payment of ₹55000 done using UPI
Order placed successfully for Laptop
🧠 Key Concepts Practiced
Spring Core Annotations

@Controller, @Service, @Repository

Dependency Injection with @Autowired

Interface-based design

Bean ambiguity resolution using @Qualifier

Clean layered architecture

🚀 How to Run
Clone the repository

bash
Copy code
git clone https://github.com/Abir-Shaikh/springcore.git
Open the project in IntelliJ / Eclipse

Run MainApp.java
