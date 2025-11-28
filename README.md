<div align="center">

# ✨ OOP QUEST: The Seven Relics of Programming  
## **Final Project in CS 2101 — Object-Oriented Programming**

### Developed by  
**Renz Mariz Carilo**  
**Ivy Emerald Julongbayan**  
**Eden Zhaira Resaba**

<br/>

## 🏰 *“A journey across kingdoms to master the core of OOP.”*

---

</div>

## ⭐ Introduction
This project, **OOP Quest**, was created as our final requirement in **CS 2101 (Object-Oriented Programming)**. Our goal was to design a system that showcases a clear, meaningful, and fully functional application of the major OOP principles.  

Instead of a traditional demonstration, we developed a **text-based adventure game** that transforms OOP concepts into interactive challenges — making the learning experience more engaging, memorable, and enjoyable.

---

## ⭐ Overview
**OOP Quest** is a Java-based, text-driven adventure game where the player travels across seven kingdoms to collect the **Seven Relics of OOP**. Each relic represents a core Object-Oriented Programming concept, and players must complete **Easy**, **Medium**, and **Hard** puzzles to obtain each one.

This project is designed to make OOP learning more interactive, fun, and easier to understand.

---

## 📂 Project Structure
```
/src
 ├── Hintable.java
 ├── Relic.java
 ├── Player.java
 ├── ClassesRelic.java
 ├── ObjectsRelic.java
 ├── InheritanceRelic.java
 ├── PolymorphismRelic.java
 ├── AbstractionRelic.java
 ├── EncapsulationRelic.java
 ├── InterfacesRelic.java
 └── Main.java
```

---

## 🖥️ How to Run the Program

### Requirements
Any terminal or IDE (VSCode, IntelliJ, BlueJ, Command Prompt)

### Steps
1. Place all `.java` files in one folder  
2. Open terminal in that folder  
3. Compile:

```
javac Main.java
```

4. Run the game:

```
java Main
```

### Optional: Online Compiler  
- https://onecompiler.com/java  
- https://www.programiz.com/java-programming/online-compiler  

---

## ✨ Key Features

### 🔹 Full OOP Implementation
- Abstraction  
- Encapsulation  
- Inheritance  
- Polymorphism  
- Interfaces  

### 🔹 Three-Level Puzzle System
- **Easy** — recall / multiple choice  
- **Medium** — T/F or keyword input  
- **Hard** — conceptual understanding  

### 🔹 Hint System
Some relics implement the `Hintable` interface.

### 🔹 Randomized Relic Order
```
Collections.shuffle()
```
Every playthrough is unique.

### 🔹 Player Inventory System
- Tracks collected relics  
- Shows progression  
- Displays final results  

---

## 💡 OOP Concepts Demonstrated

### 🟦 Encapsulation
- Private fields  
- Getters for controlled access  
- Unmodifiable inventory  

### 🟧 Abstraction
Abstract class `Relic` forces consistent puzzle structure:
- `easy()`  
- `medium()`  
- `hard()`  

### 🟪 Inheritance
Relic classes inherit from `Relic`.

### 🟩 Polymorphism
All relics stored in:
```
List<Relic>
```

### 🟨 Interfaces
Some relics implement `Hintable`.

---

## 📸 Sample Gameplay

```
===============================================
     OOP QUEST: The Seven Relics of Programming
===============================================

Enter your name: Baby

Welcome, Baby. Your quest begins.

--- Entering the Kingdom of Abstraction ---

===== EASY =====
Question: Which keyword creates an abstract class?
Your answer: abstract
Correct!

===== MEDIUM =====
Question: True or False — Abstract classes may contain abstract methods.
Your answer: true
Correct!

===== HARD =====
Question: Which provides 100% abstraction?
Your answer: B
Correct!

You have collected the Relic of Shadows.
Continue? (Y/n):
```

---

## 🧩 Answer Key (Quick Reference)
| Relic | Easy | Medium | Hard |
|-------|-------|---------|--------|
| Classes | B | class | true |
| Objects | 1 | true | B |
| Inheritance | extends | true | A |
| Polymorphism | B | true | B |
| Abstraction | abstract | true | B |
| Encapsulation | 1 | true | C |
| Interfaces | implements | true | B |

---

## 👥 Contributors

| Name | Role |
|------|------|
| **Renz Mariz Carilo** | ? |
| **Ivy Emerald Julongbayan** | ? |
| **Eden Zhaira Resaba** | ? |

---

## 🙌 Acknowledgments
We thank our OOP instructor for guiding us throughout the semester and our blockmates for participating in playtesting and giving constructive feedback.  

This project demonstrates our understanding of OOP concepts and our commitment to applying them creatively and effectively.

---

