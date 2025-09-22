# ConsoleCalc

## Task 1: Console Calculator

## Description
This is a **Java console-based calculator** demonstrating key programming concepts such as **Object-Oriented Programming (OOP)**, **methods**, **loops**, **conditionals**, and **input/output (I/O)**.  

The calculator supports the following operations:  

- **Addition (+)** – Sum of two numbers  
- **Subtraction (-)** – Difference of two numbers  
- **Multiplication (*)** – Product of two numbers  
- **Division (/)** – Quotient of two numbers (handles division by zero)  
- **Modulus (%)** – Remainder of division  
- **Square Root** – Calculates the square root of a number (handles negative inputs)  
- **Power (a ^ b)** – Calculates a number raised to the power of another  

The program provides **friendly, descriptive output** and rounds numerical results to **2 decimal places** for readability.  

---

## Key Concepts Demonstrated

1. **Object-Oriented Programming (OOP)**  
   - `Calculator` class encapsulates all operations as methods.  

2. **Methods**  
   - Each operation is implemented as a separate method in the `Calculator` class.  

3. **Conditionals**  
   - Handles invalid inputs, such as division by zero and negative square roots.  

4. **Loops**  
   - `do-while` loop allows the user to perform multiple calculations until they choose to exit.  

5. **Input/Output (I/O)**  
   - Uses `Scanner` to take user input.  
   - Prints results in a user-friendly format using `System.out.printf`.  

---
## Folder Structure
📁 Elevate-Labs/
└─ 📂 src/
   └─ 📂 task1_calculator/
      ├─ 📄 Calculator.java
      └─ 📄 Main.java

      
---

## How to Run

1. Navigate to the `src` folder of the task.  
2. Compile the Java files:  
```bash
javac Calculator.java Main.java
java Main

