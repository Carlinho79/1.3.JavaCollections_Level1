# 1.3 – Java Collections – Level 1

---

## 📄 Description

This project is part of **Sprint 1 (Java)** in **IT Academy**.  
It focuses on learning how to use **Java Collections Framework**, such as `ArrayList`, `HashMap`, and file manipulation, through three progressive exercises.

The main goal is to **get familiar with Java Collections** and understand how to store, manage, and retrieve data efficiently.

---

## 🧩 Project Structure

1.3.JavaCollections/
└── Level1/
├── Exercise1/
│ ├── App/
│ │ └── Main.java
│ └── Model/
│ └── Month.java
│
├── Exercise2/
│ ├── App/
│ │ └── Main.java
│ └── Model/
│ └── ListManager.java
│
└── Exercise3/
├── App/
│ └── Main.java
├── Model/
│ ├── CountryGame.java
│ └── FileManager.java
├── Data/
│ └── scores.txt
└── Resources/
└── countries.txt


---

## 💻 Technologies Used

- Java 17
- IntelliJ IDEA Community Edition
- macOS (development environment)
- Java I/O API (`BufferedReader`, `FileReader`, `FileWriter`)
- Java Collections (`ArrayList`, `HashMap`)

---

## 📋 Requirements

- The code must be written in **English**.
- The project must compile and run **without errors**.
- Use of a proper **`.gitignore`** file is mandatory.
- No commented or unused code in the repository.
- Commit messages must be **clear and descriptive**.
- The repository must contain this `README.md` file.

---

## 🧠 Exercises Overview

### Exercise 1 – Months of the Year
Stores the twelve months in an `ArrayList` and displays them in order.  
It introduces the concept of Java lists and iteration.

**Key Class:** `Month.java`

---

### Exercise 2 – List Manager
Implements a `ListManager` class capable of adding, removing, and sorting elements.  
It demonstrates how to manipulate and organize data inside collections.

**Key Class:** `ListManager.java`

---

### Exercise 3 – Countries and Capitals Game
A small quiz game using a `HashMap<String, String>` to map countries to their capitals.  
The program:
1. Reads data from `countries.txt`.
2. Asks the user for their name.
3. Displays ten random countries.
4. Prompts for their capitals and scores correct answers.
5. Saves the final score to `scores.txt`.

**Key Classes:** `CountryGame.java`, `FileManager.java`

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/carlinho79/1.3-JavaCollections-Nivell1.git

2. Open the project in IntelliJ IDEA (Community Edition).
3. Ensure each exercise directory (Exercise1, Exercise2, Exercise3) is marked as a Java source root.
4. Mark the Resources folder (in Exercise 3) as Resources Root.

---

## ▶️ Execution
Each exercise contains its own Main.java entry point:
* Exercise 1: Level1/Exercise1/App/Main.java
* Exercise 2: Level1/Exercise2/App/Main.java
* Exercise 3: Level1/Exercise3/App/Main.java
Run each file individually to test the corresponding program.
Example (Exercise 3):
  Enter your name: Beto
  What is the capital of France? → Paris
  ✅ Correct!
  ...
  Game over – Final Score: 8/10
  Your result has been saved in scores.txt.

---

## 🌐 Deployment
This project is not intended for production deployment.
All programs are console-based and designed for local execution inside an IDE.

---

## 🤝 Contributions
This repository is part of an educational exercise and is not open for public contributions.
However, improvements and refactors are encouraged for personal learning:
Create a new branch:
```bash
git checkout -b refactor/improvements
````
2. Commit your changes:
```bash
git commit -m "Refactor CountryGame class"
````
3. Push the branch to your forked repository.

---

## 👩‍💻 Autor
Nom: Carlos Alberto Garzón Bedoya.
Curs: Java Backend - IT Academy.
Sprint: 1. Tasca 3 — Java Collections.

