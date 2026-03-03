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

### **UC5: Render OOPS as Banner using Inline Array Initialization** ⭐ (LATEST)
- **File**: `uc5.java`
- **Branch**: `feature/uc5`
- **Status**: Implemented ✓
- **Enhancement**: Uses String.join() for inline array initialization and concise code

---

## 🌿 Branch Architecture

### **main** (Production Branch)
- Contains **only this README.md** file
- Serves as the stable baseline
- All other branches originate from this branch

### **dev** (Development - Latest Version) ⭐
- Contains the **latest working code** (currently UC5)
- Integrated version of all completed features
- Use this for testing the latest version

### **feature/uc1, feature/uc2, feature/uc3, feature/uc4, feature/uc5**
- Individual feature branches
- Each contains **only its respective UC file**
- Used for isolated development and testing

---

## 📦 Latest Version Information

**Current Latest Version**: UC5
- **File**: `uc5.java`
- **Branch**: `feature/uc5` and `dev`
- **Status**: Ready to use
- **Key Feature**: Inline array initialization with String.join()

The `dev` branch currently contains only the UC5 implementation, representing the latest production-ready code.

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
└── dev
    ├── uc5.java              (Latest version)
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
| v5 (Latest) | UC5 - Inline Array Init | feature/uc5, dev | ✓ Current |

---

## 📌 Notes

- **Main branch** is kept clean with only this documentation
- **Feature branches** maintain isolation - each contains only its own UC code
- **Dev branch** reflects the latest working implementation
- When new UCs are added, create `feature/uc<n>` and update `dev` accordingly

---

## 🎯 UC5 Details

**Render OOPS as Banner using Inline Array Initialization**

### Concept:
Extends UC4 by combining array declaration and initialization with `String.join()` method calls in a single statement, making the code more concise and readable.

### Key Improvements:
- **Inline Initialization**: Declare and initialize the String array in one statement
- **Method Invocation**: Use String.join() directly within array initialization
- **Code Conciseness**: Reduces code volume without sacrificing clarity
- **Enhanced Readability**: All banner lines visible in one compact structure

### Key Concepts Used:
- Array Initialization with array literal syntax
- Inline method calls (String.join())
- Enhanced For Loop for iteration
- String concatenation techniques

---

## 👨‍💻 Author
Developed as an Object-Oriented Programming implementation example.

---

**Last Updated**: March 3, 2026
