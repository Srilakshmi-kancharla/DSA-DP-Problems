# Longest Common Subsequence (LCS) – Dynamic Programming

This repository contains important **Longest Common Subsequence (LCS) based Dynamic Programming problems** implemented in Java.

LCS is one of the most important DP patterns and is frequently asked in:
- Coding interviews
- Placement exams
- Competitive programming

These problems help in understanding:
- String DP
- Sequence matching
- Palindrome DP
- Transformation problems

---

# 📌 What is Longest Common Subsequence?

A **subsequence** is a sequence that appears in the same relative order but not necessarily contiguous.

The **Longest Common Subsequence (LCS)** problem finds the longest subsequence common to two strings.

---

# ✅ Example

```text
String A = "abcde"
String B = "ace"

LCS = "ace"
Length = 3
```

---

# 🧠 LCS DP Idea

For every character:
- If characters match:
```text
1 + dp[i-1][j-1]
```

- Else:
```text
max(dp[i-1][j], dp[i][j-1])
```

---

# 📚 Problems Covered

## 1️⃣ Finding Length of LCS

### Problem Statement
Find the length of the longest common subsequence between two strings.

### Example
```text
Input:
A = "abcdgh"
B = "abedfhr"

Output:
4
```

### LCS
```text
abdh
```

---

## 2️⃣ Printing Longest Common Subsequence

### Problem Statement
Print the actual LCS string instead of only its length.

### Example
```text
Input:
A = "abcde"
B = "ace"

Output:
ace
```

### Approach
- Build DP table
- Backtrack from last cell
- Construct the subsequence

---

## 3️⃣ Shortest Common Supersequence (SCS)

### Problem Statement
Find the shortest string that contains both strings as subsequences.

### Formula
```text
Length of SCS =
Length(A) + Length(B) - Length(LCS)
```

### Example
```text
Input:
A = "geek"
B = "eke"

Output:
geeke
```

---

## 4️⃣ Minimum Number of Insertions and Deletions to Convert String A to String B

### Problem Statement
Convert string A into string B using minimum insertions and deletions.

### Formula
```text
Deletions = Length(A) - LCS
Insertions = Length(B) - LCS
```

### Example
```text
Input:
A = "heap"
B = "pea"

Output:
Deletions = 2
Insertions = 1
```

---

## 5️⃣ Longest Palindromic Subsequence (LPS)

### Problem Statement
Find the longest subsequence of a string that is also a palindrome.

### Key Idea
```text
LPS = LCS(string, reverse(string))
```

### Example
```text
Input:
"agbcba"

Output:
5
```

### LPS
```text
abcba
```

---

## 6️⃣ Minimum Number of Deletions to Make a String Palindrome

### Formula
```text
Minimum Deletions =
Length(string) - Length(LPS)
```

### Example
```text
Input:
"agbcba"

Output:
1
```

---

## 7️⃣ Minimum Number of Insertions to Make a String Palindrome

### Formula
```text
Minimum Insertions =
Length(string) - Length(LPS)
```

### Example
```text
Input:
"abcda"

Output:
2
```

---

## 8️⃣ Longest Repeating Subsequence

### Problem Statement
Find the longest subsequence that appears more than once in the string.

### Key Idea
- Apply LCS on same string
- Indices must be different

### Condition
```text
i != j
```

### Example
```text
Input:
"AABEBCDD"

Output:
3
```

### Longest Repeating Subsequence
```text
ABD
```

---

## 9️⃣ Sequence Pattern Matching

### Problem Statement
Check whether one string is a subsequence of another string.

### Key Idea
If:
```text
Length(LCS) == Length(smallerString)
```

Then:
```text
Pattern exists
```

### Example
```text
Input:
A = "AXY"
B = "ADXCPY"

Output:
true
```

---

# 🧠 Concepts Used

- Dynamic Programming
- String DP
- LCS Pattern
- Memoization
- Tabulation
- Backtracking
- Palindrome Problems
- Sequence Matching

---

# ⚡ Time Complexity

| Problem | Time Complexity |
|---|---|
| LCS Length | O(N × M) |
| Printing LCS | O(N × M) |
| SCS | O(N × M) |
| Insertions & Deletions | O(N × M) |
| Longest Palindromic Subsequence | O(N × N) |
| Minimum Deletions for Palindrome | O(N × N) |
| Minimum Insertions for Palindrome | O(N × N) |
| Longest Repeating Subsequence | O(N × N) |
| Sequence Pattern Matching | O(N × M) |

Where:
- `N` = length of first string
- `M` = length of second string

---

# 📂 Repository Structure

```text
Longest-Common-Subsequence/
│
├── LCSLength.java
├── PrintLCS.java
├── ShortestCommonSupersequence.java
├── MinInsertionsDeletions.java
├── LongestPalindromicSubsequence.java
├── MinDeletionPalindrome.java
├── MinInsertionPalindrome.java
├── LongestRepeatingSubsequence.java
├── SequencePatternMatching.java
└── README.md
```

---

# 🚀 Purpose of This Repository

- Master LCS pattern
- Learn String Dynamic Programming
- Practice interview-level DP problems
- Improve DP state transition understanding
- Build strong problem-solving skills

---

# 🛠️ Language Used

- Java

---

# 📖 Learning Outcome

After completing these problems, you will understand:
- How string DP works
- How to build DP tables
- Backtracking techniques
- Palindrome transformations
- Sequence matching concepts
- Optimization using LCS

---

# 🔥 Interview Preparation

Common interview questions:
- Difference between substring and subsequence?
- Why use reverse string in palindrome problems?
- How to print actual LCS?
- How to optimize space complexity?
- Why does LCS use 2D DP?

These problems are frequently asked in:
- Infosys
- TCS
- Accenture
- Amazon
- Microsoft
- Product-based companies

---

# ⭐ Conclusion

Longest Common Subsequence (LCS) is one of the most important Dynamic Programming patterns.

Mastering these problems helps in solving:
- String transformation problems
- Edit distance problems
- Palindrome problems
- Sequence matching problems
- Advanced String DP concepts
