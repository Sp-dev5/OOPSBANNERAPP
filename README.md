# OOPSBANNERAPP - Object-Oriented Programming Banner System

## Overview
This repository contains the implementation of an Object-Oriented Programming (OOPS) Banner Application with multiple use cases (UCs). Each use case is developed and maintained in separate feature branches, with the latest version aggregated in the `dev` branch.

---

## 📋 Use Cases

### **UC1: First Use Case**
- **File**: `uc1.java`
- **Branch**: `feature/uc1`
- **Status**: Implemented ✓

### **UC2: Second Use Case**
- **File**: `uc2.java`
- **Branch**: `feature/uc2`
- **Status**: Implemented ✓

### **UC3: Third Use Case**
- **File**: `uc3.java`
- **Branch**: `feature/uc3`
- **Status**: Implemented ✓

### **UC4: Fourth Use Case**
- **File**: `uc4.java`
- **Branch**: `feature/uc4`
- **Status**: Implemented ✓

### **UC5: Render OOPS as Banner using Inline Array Initialization**
- **File**: `uc5.java`
- **Branch**: `feature/uc5`
- **Status**: Implemented ✓
- **Enhancement**: Uses String.join() for inline array initialization and concise code

### **UC6: Refactor Banner Logic into Functions** ⭐ (LATEST)
- **File**: `uc6.java`
- **Branch**: `feature/uc6`
- **Status**: Implemented ✓
- **Enhancement**: Modular approach using static helper methods (getOPattern(), getPPattern(), getSPattern())

---

## 🌿 Branch Architecture

### **main** (Production Branch)
- Contains **only this README.md** file
- Serves as the stable baseline
- All other branches originate from this branch

### **dev** (Development - Latest Version) ⭐
- Contains the **latest working code** (currently UC6)
- Integrated version of all completed features
- Use this for testing the latest version

### **feature/uc1, feature/uc2, feature/uc3, feature/uc4, feature/uc5, feature/uc6**
- Individual feature branches
- Each contains **only its respective UC file**
- Used for isolated development and testing

---

## 📦 Latest Version Information

**Current Latest Version**: UC6
- **File**: `uc6.java`
- **Branch**: `feature/uc6` and `dev`
- **Status**: Ready to use
- **Key Feature**: Modular functions using static helper methods

The `dev` branch currently contains only the UC6 implementation, representing the latest production-ready code.

---

## 🔄 Development Workflow

1. **For working on a specific UC**:
   ```
   git checkout feature/uc<number>
   ```

2. **For testing the latest version**:
   ```
   git checkout dev
   ```

3. **To see all files and history**:
   ```
   git checkout main
   ```

4. **To compare branches**:
   ```
   git diff feature/uc1 feature/uc2
   ```

---

## 📂 Repository Structure

```
OOPSBANNERAPP/
├── README.md                 (This file - on main branch)
├── feature/uc1
│   ├── uc1.java
│   └── .gitignore
├── feature/uc2
│   ├── uc2.java
│   └── .gitignore
├── feature/uc3
│   ├── uc3.java
│   └── .gitignore
├── feature/uc4
│   ├── uc4.java
│   └── .gitignore
├── feature/uc5
│   ├── uc5.java
│   └── .gitignore
├── feature/uc6
│   ├── uc6.java
│   └── .gitignore
└── dev
    ├── uc6.java              (Latest version)
    └── .gitignore
```

---

## 🚀 Getting Started

### Clone the repository
```bash
git clone https://github.com/Sp-dev5/OOPSBANNERAPP.git
cd OOPSBANNERAPP
```

### View available branches
```bash
git branch -a
```

### Switch to development branch (latest version)
```bash
git checkout dev
```

### View specific UC implementation
```bash
git checkout feature/uc<number>
```

---

## 📝 Version History

| Version | UC | Branch | Status |
|---------|-----|--------|--------|
| v1 | UC1 | feature/uc1 | ✓ Complete |
| v2 | UC2 | feature/uc2 | ✓ Complete |
| v3 | UC3 | feature/uc3 | ✓ Complete |
| v4 | UC4 | feature/uc4 | ✓ Complete |
| v5 | UC5 - Inline Array Init | feature/uc5 | ✓ Complete |
| v6 (Latest) | UC6 - Modular Functions | feature/uc6, dev | ✓ Current |

---

## 📌 Notes

- **Main branch** is kept clean with only this documentation
- **Feature branches** maintain isolation - each contains only its own UC code
- **Dev branch** reflects the latest working implementation
- When new UCs are added, create `feature/uc<n>` and update `dev` accordingly

---

## 🎯 UC6 Details

**Refactor Banner Logic into Functions**

### Concept:
Extends UC5 by implementing a modular approach to generate each letter's pattern through dedicated static methods. This enhances code reusability and maintainability by separating pattern generation logic from the main display logic.

### Key Methods:
- **getOPattern()**: Generates 7-line pattern for letter 'O'
- **getPPattern()**: Generates 7-line pattern for letter 'P'
- **getSPattern()**: Generates 7-line pattern for letter 'S'

### Key Improvements:
- **Static Methods**: Utility functions that don't require object instantiation
- **Helper Methods**: Dedicated methods for each character pattern
- **Method Abstraction**: Encapsulates pattern creation logic for clarity and reuse
- **DRY Principle**: Eliminates code duplication by centralizing pattern definitions
- **Modularity**: Separates concerns by creating individual methods for each letter
- **Reusability**: Same methods can serve other words or characters
- **Code Composition**: Assembles multiple letter patterns into a complete banner

### Key Concepts Used:
- Static Methods for utility functions
- Helper Methods for pattern generation
- Method Abstraction and Encapsulation
- DRY Principle (Don't Repeat Yourself)
- Array Initialization via Method Calls
- Enhanced For Loop for iteration

---

## 👨‍💻 Author
Developed as an Object-Oriented Programming implementation example.

---

**Last Updated**: March 3, 2026
