# Cryptography Project: Caesar and Scytale Ciphers

## Project Goal

This project focuses on implementing two classical cryptographic techniques: the **Caesar Cipher** and the **Scytale Cipher**. These methods demonstrate the fundamentals of encryption and decryption, showcasing how historical cryptography secured messages through substitution and transposition.

The primary goal is to understand the mechanics of these ciphers and build modular, reusable code that can encrypt and decrypt messages efficiently.

---

## Ciphers Implemented

### 1. **Caesar Cipher**
   - A substitution cipher that shifts each letter in the plaintext by a fixed number of positions in the alphabet.
   - **Key Features**:
     - Supports encryption and decryption with a user-specified shift value.
     - Handles both uppercase and lowercase letters.
     - Ensures non-alphabetic characters (e.g., punctuation, numbers) remain unaffected.

### 2. **Scytale Cipher**
   - A transposition cipher based on wrapping a message around a cylindrical rod and reading it in rows.
   - **Key Features**:
     - Encrypts by arranging the plaintext in a grid based on a given key (number of rows).
     - Decrypts by reconstructing the grid and reading the characters in order.

---

## Skills Involved

### 1. **Cryptographic Fundamentals**
   - Understanding substitution (Caesar Cipher) and transposition (Scytale Cipher) techniques.
   - Exploring how these methods manipulate plaintext to produce ciphertext.

### 2. **Algorithm Design**
   - Developing encryption and decryption algorithms for both ciphers.
   - Handling edge cases, such as plaintext lengths that don't fit perfectly in a grid for the Scytale Cipher.

### 3. **Programming Constructs**
   - Writing modular functions for clean and reusable code.
   - Using loops for string manipulation and array/grid traversal.

### 4. **String Manipulation**
   - Shifting characters in the alphabet for the Caesar Cipher.
   - Constructing and parsing grids for the Scytale Cipher.

### 5. **Problem-Solving**
   - Debugging cipher implementations to ensure accurate encryption and decryption.
   - Adapting algorithms to handle real-world constraints, like mixed-case inputs or non-alphabetic characters.

---
