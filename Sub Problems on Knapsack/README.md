# 0/1 Knapsack Subproblems – Dynamic Programming

This repository contains important **0/1 Knapsack based Dynamic Programming problems** implemented in Java.

These problems are derived from the classic **0/1 Knapsack** pattern and are frequently asked in coding interviews and placement exams.

---

# 📌 Topics Covered

## 1️⃣ Subset Sum
Determine whether a subset exists whose sum is equal to a given target.

### Problem Statement
Given an array and a target sum, check if there exists a subset whose sum equals the target value.

### Example
```text
Input:
arr = [2,3,7,8,10]
sum = 11

Output:
true
```

---

## 2️⃣ Equal Sum Partition
Check whether the array can be divided into two subsets having equal sum.

### Key Idea
- Total sum must be even
- Find subset with sum = totalSum / 2

### Example
```text
Input:
[1,5,11,5]

Output:
true
```

---

## 3️⃣ Count of Subset Sum
Count the number of subsets whose sum equals a given target.

### Example
```text
Input:
arr = [2,3,5,6,8,10]
sum = 10

Output:
3
```

---

## 4️⃣ Minimum Subset Sum Difference
Partition the array into two subsets such that the difference between their sums is minimum.

### Example
```text
Input:
[1,6,11,5]

Output:
1
```

---

## 5️⃣ Target Sum
Find the number of ways to assign `+` and `-` signs to make the target sum.

### Example
```text
Input:
nums = [1,1,1,1,1]
target = 3

Output:
5
```

---

## 6️⃣ Count the Number of Subsets with Given Difference
Count subsets whose difference between two subset sums equals a given value.

### Example
```text
Input:
arr = [1,1,2,3]
difference = 1

Output:
3
```

---

# 🧠 Concepts Used

- Recursion
- Memoization
- Tabulation
- Dynamic Programming
- 0/1 Knapsack Pattern
- Boolean DP
- Count DP

---

# ⚡ Time Complexity

Most problems are optimized using Dynamic Programming.

| Problem | Time Complexity |
|---|---|
| Subset Sum | O(N × Sum) |
| Equal Sum Partition | O(N × Sum) |
| Count of Subset Sum | O(N × Sum) |
| Minimum Subset Sum Difference | O(N × Sum) |
| Target Sum | O(N × Sum) |
| Count Subsets with Given Difference | O(N × Sum) |

Where:
- `N` = number of elements
- `Sum` = target sum

---

# 📂 Repository Structure

```text
0-1-Knapsack/
│
├── SubsetSum.java
├── EqualSumPartition.java
├── CountSubsetSum.java
├── MinimumSubsetSumDifference.java
├── TargetSum.java
├── CountSubsetWithGivenDifference.java
└── README.md
```

---

# 🚀 Purpose of This Repository

- Strengthen Dynamic Programming concepts
- Master 0/1 Knapsack pattern
- Prepare for coding interviews
- Improve problem-solving skills
- Practice DP state transition problems

---

# 🛠️ Language Used

- Java

---

# 📖 Learning Outcome

After completing these problems, you will understand:
- How to convert recursion into DP
- State transition logic
- DP table construction
- Optimization techniques
- Variations of 0/1 Knapsack

---

# ⭐ Contributing

Contributions are welcome.  
Feel free to add:
- Optimized solutions
- Space optimized DP
- Recursive + Memoized approaches
- Additional knapsack variations

---

# 📌 Conclusion

These problems form the foundation of many advanced Dynamic Programming concepts.  
Mastering these subproblems makes it easier to solve:
- DP on Strings
- DP on Trees
- Matrix Chain Multiplication
- Advanced Partition DP problems
