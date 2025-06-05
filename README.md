# 🎓 Java OOP Exercises – Inheritance, Polymorphism & Interfaces

**👨‍💻 Author**: Lucy Castro  
**🧠 Learning Focus**: Object-Oriented Programming (OOP) in Java  
**🛠️ IDE**: IntelliJ IDEA  
**💡 Java SDK**: 21  

## 📄 Description
This repository contains structured Java OOP exercises focused on:
- Inheritance
- Polymorphism
- Interfaces
- Abstract classes
- Static/final field usage
- Method overriding and object interaction

The exercises are organized by level and demonstrate progressive mastery of key OOP concepts.

---

## 📚 Exercise Catalog

### 📘 Level 1
<details>
<summary><strong>🎸 Exercise 1 – Musical Instruments</strong></summary>

### 📝 Description
A music band uses various types of instruments: wind, string, and percussion.

### 🎯 Requirements
- All instruments share `name` and `price` attributes
- An abstract method `play()` must be implemented in each subclass
- Output should vary depending on the instrument type being played
- Demonstrate class loading occurs only once (triggered by first instance or static member access)
- Research Java's initialization blocks and static blocks

### 💡 Key Concepts
- Abstract classes
- Method overriding
- Static initialization



### 💻 Technologies Used
- ☕ Java 21

- 🧠 IntelliJ IDEA

- 🗃️ Git & GitHub

### 📋 Requirements
- ✅ Java JDK 21
- ✅ IntelliJ IDEA
- ✅ Git
- ✅ Internet connection

### 🛠️ Installation

git clone https://github.com/Lucy-SD/S1T1_InheritanceAndPolimorfism

Open in IntelliJ: File > Open > [select folder]

Set SDK: File > Project Structure > Project SDK > JDK 21


### ▶️ Execution
Navigate to the desired exercise package

Open the corresponding Main class

Right-click → Run


### 🌐 Deployment
For educational purposes only.

### 🤝 Contributions
- ⭐ Star the repo

- 🪄 Fork it

- 🛠️ Submit issues

### 🎯 Learning Goals
Class hierarchies

Interface implementation

Static vs instance context

Method overriding

Encapsulation

Thanks for visiting! 🚀

```java
// Example structure
abstract class Instrument {
    String name;
    double price;
    abstract void play();
}
