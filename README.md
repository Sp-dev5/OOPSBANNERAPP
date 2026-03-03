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

### **UC4: Fourth Use Case** ⭐ (LATEST)
- **File**: `uc4.java`
- **Branch**: `feature/uc4`
- **Status**: Implemented ✓

---

## 🌿 Branch Architecture

### **main** (Production Branch)
- Contains **only this README.md** file
- Serves as the stable baseline
- All other branches originate from this branch

### **dev** (Development - Latest Version) ⭐
- Contains the **latest working code** (currently UC4)
- Integrated version of all completed features
- Use this for testing the latest version

### **feature/uc1, feature/uc2, feature/uc3, feature/uc4**
- Individual feature branches
- Each contains **only its respective UC file**
- Used for isolated development and testing

---

## 📦 Latest Version Information

**Current Latest Version**: UC4
- **File**: `uc4.java`
- **Branch**: `feature/uc4` and `dev`
- **Status**: Ready to use

The `dev` branch currently contains only the UC4 implementation, representing the latest production-ready code.

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
└── dev
    ├── uc4.java              (Latest version)
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
| v4 (Latest) | UC4 | feature/uc4, dev | ✓ Current |

---

## 📌 Notes

- **Main branch** is kept clean with only this documentation
- **Feature branches** maintain isolation - each contains only its own UC code
- **Dev branch** reflects the latest working implementation
- When new UCs are added, create `feature/uc<n>` and update `dev` accordingly

---

## 👨‍💻 Author
Developed as an Object-Oriented Programming implementation example.

---

**Last Updated**: March 3, 2026
