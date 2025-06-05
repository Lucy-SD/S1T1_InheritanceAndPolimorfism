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
[... previous content ...]
</details>

<details>
<summary><strong>🚗 Exercise 2 – Car Attributes & Methods</strong></summary>
[... previous content ...]
</details>

### 📘 Level 2
<details>
<summary><strong>📱 Exercise 1 – Smartphone Class</strong></summary>
[... previous content ...]
</details>

### 📘 Level 3
<details>
<summary><strong>📰 Exercise 1 – Sports News Editorial System</strong></summary>

### 📝 Description
A sports news editorial system with journalists and categorized news articles (football, basketball, tennis, F1, and motorcycling).

### 🎯 Requirements

#### 🧑‍💼 Journalist Class
- Attributes:
  - `name` (String)
  - `dni` (final String)
  - `salary` (static double, initial value 1500€)
- Multiple journalists can work on multiple news articles

#### 📰 News Article Structure
- Base attributes:
  - `headline` (String)
  - `text` (String, empty at creation)
  - `rating` (int)
  - `price` (double)
- Sport-specific attributes:
  - **Football**: competition, club, player
  - **Basketball**: competition, club
  - **Tennis**: competition, players
  - **F1**: team
  - **Motorcycling**: team

#### 💰 Price Calculation
Implement `calculateNewsPrice()` method with sport-specific rules:
- **Football**:
  - Base: 300€
  - Champions League: +100€
  - Barça/Madrid: +100€
  - Ferran Torres/Benzema: +50€
  
- **Basketball**:
  - Base: 250€
  - Euroleague: +75€
  - Barça/Madrid: +75€

- **Tennis**:
  - Base: 150€
  - Federer/Nadal/Djokovic: +100€

- **F1**:
  - Base: 100€
  - Ferrari/Mercedes: +50€

- **Motorcycling**:
  - Base: 100€
  - Honda/Yamaha: +50€

#### ⭐ Rating Calculation
Sport-specific rating systems:
- **Football**:
  - Base: 5 points
  - Champions League: +3
  - League: +2
  - Barça/Madrid: +1
  - Ferran Torres/Benzema: +1

- **Basketball**:
  - Base: 4 points
  - Euroleague: +3
  - ACB: +2
  - Barça/Madrid: +1

- **Tennis**:
  - Base: 4 points
  - Federer/Nadal/Djokovic: +3

- **F1**:
  - Base: 4 points
  - Ferrari/Mercedes: +2

- **Motorcycling**:
  - Base: 3 points
  - Honda/Yamaha: +3

#### 🖥️ Menu System
The main class must implement:
1. Add journalist
2. Remove journalist
3. Add news to journalist
4. Remove news (requires journalist and headline)
5. Show all news by journalist
6. Calculate news rating
7. Calculate news price

### 💡 Key Concepts
- Static vs instance members
- Complex inheritance hierarchies
- Polymorphic behavior
- Encapsulation
- Menu-driven systems
