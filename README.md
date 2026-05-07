# 🎓 Student Manager — Java Console Application

A lightweight, menu-driven **Student Management System** implemented in Java.  
The application demonstrates core programming concepts by providing a clean interface to perform **CRUD operations** on student records stored in memory.

---

## 📌 Overview

This project is designed as a foundational exercise in:

* Object-Oriented Programming (OOP)
* Data structures using `ArrayList`
* User interaction via console input
* Basic input validation and control flow
* Report card generation and student performance evaluation

It is suitable for beginners and as a base for extending into more advanced systems (GUI, database-backed apps, or REST APIs).

---

## ✨ Key Features

* **List Students** — Display all available student records
* **Add Student** — Insert a new student with validation checks
* **Search Students** — Case-insensitive name-based search
* **Update Student** — Modify existing student details by ID
* **Delete Student** — Remove a student with confirmation prompt
* **Generate Report Card** — Create a detailed student report card using student ID
* **Performance Evaluation** — Automatically classify student performance
* **Result Status** — Display PASS or FAIL based on grade
* **Unique ID Generation** — Auto-incremented identifier for each record

---

## 🛠️ Technology Stack

* **Language:** Java
* **Core Libraries:**
  * `java.util.ArrayList`
  * `java.util.Scanner`

---

## 🏗️ Project Structure

```plaintext
.
├── Main.java        # Entry point and application logic
├── Student.java     # Data model representing a student
```

---

## ⚙️ Application Flow

Upon execution, the program initializes with sample data and presents a menu-driven interface:

```plaintext
===== MENU =====
1. Show all students
2. Add student
3. Search student by name
4. Update student
5. Delete student
6. Generate report card
7. Exit
```

Users interact by entering the corresponding numeric option.

---

## 📄 Report Card Feature

The application includes a **Student Report Card Generator** that allows users to generate a detailed report card for any student using their unique ID.

The generated report card includes:

* Student ID
* Name
* Age
* Course
* Grade
* Result Status (PASS / FAIL)
* Performance Level

### 📊 Performance Classification

| Grade Range | Performance |
| ------------ | ------------ |
| 90 – 100     | Excellent    |
| 75 – 89      | Good         |
| 50 – 74      | Average      |
| Below 50     | Poor         |

### ✅ Result Criteria

| Grade | Result |
| ----- | ------ |
| 40+   | PASS   |
| < 40  | FAIL   |

---

## ▶️ Getting Started

### 1. Compile the Source Files

```bash
javac Main.java Student.java
```

### 2. Run the Application

```bash
java Main
```

---

## 🧪 Sample Data

The system is preloaded with a small dataset to demonstrate functionality and avoid an empty initial state.

---

## ✅ Validation Rules

To maintain data integrity, the following constraints are enforced:

* **Name:** Must not be empty
* **Age:** Must be within the range of 15 to 60
* **Grade:** Must be within the range of 0 to 100

---

## 🔧 Design Highlights

* **Separation of Concerns:**  
  `Student.java` encapsulates the data model, while `Main.java` handles application logic and user interaction.

* **In-Memory Storage:**  
  Uses `ArrayList` for simplicity and fast iteration.

* **Report Card System:**  
  Dynamically generates report cards with performance evaluation and result status.

* **User-Friendly Interaction:**  
  Clear prompts and confirmation messages enhance usability.

* **Clean and Modular Design:**  
  The project structure is simple, readable, and easy to extend with new features.

---

## 🚀 Future Enhancements

* Persistent storage using files or a database (e.g., MySQL, SQLite)
* GUI implementation using Java Swing or JavaFX
* RESTful API using Spring Boot
* Advanced features such as sorting, filtering, and pagination
* Export report cards as PDF or text files
* Input mismatch handling and improved validation

---

## 📄 License

This project is intended for **educational and personal use**.  
You are free to modify and extend it as needed.

---

## ⭐ Acknowledgment

This project is a practical implementation of core Java concepts and serves as a stepping stone toward building real-world applications. It reflects a strong understanding of programming fundamentals, data handling, and problem-solving techniques.
