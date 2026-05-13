# Unbounded Knapsack – Dynamic Programming

This repository contains important **Unbounded Knapsack based Dynamic Programming problems** implemented in Java.

These problems are widely used to understand:
- Repetition-based DP
- Optimization problems
- Counting combinations
- Resource maximization

Unlike **0/1 Knapsack**, in Unbounded Knapsack we can use the same item multiple times.

---

# 📌 What is Unbounded Knapsack?

In the **Unbounded Knapsack** problem:

- Each item has:
  - Weight
  - Value/Profit
- We can take an item:
  - Unlimited number of times
- Goal:
  - Maximize profit without exceeding capacity

---

# 🧠 Difference Between 0/1 and Unbounded Knapsack

| Feature | 0/1 Knapsack | Unbounded Knapsack |
|---|---|---|
| Item Usage | Only once | Multiple times |
| Choice | Include or exclude | Include multiple times |
| DP Transition | Move to previous row | Stay in same row after inclusion |

---

# 📚 Problems Covered

## 1️⃣ Unbounded Knapsack

### Problem Statement
Given:
- Weights of items
- Values of items
- Capacity of knapsack

Find the maximum profit when items can be selected multiple times.

### Example
```text
Input:
weights = [1,3,4,5]
values = [1,4,5,7]
capacity = 8

Output:
11
```

---

## 2️⃣ Coin Change – 1 (Maximum Number of Ways)

### Problem Statement
Count the total number of ways to make a target sum using given coin denominations.

Each coin can be used unlimited times.

### Example
```text
Input:
coins = [1,2,3]
sum = 4

Output:
4
```

### Possible Ways
```text
1+1+1+1
1+1+2
1+3
2+2
```

---

## 3️⃣ Coin Change – 2 (Minimum Number of Coins)

### Problem Statement
Find the minimum number of coins required to make a target sum.

If not possible, return:
```text
-1
```

### Example
```text
Input:
coins = [1,2,3]
sum = 5

Output:
2
```

### Explanation
```text
2 + 3 = 5
```

---

## 4️⃣ Rod Cutting Problem

### Problem Statement
Given:
- Lengths of rod pieces
- Prices of pieces
- Total rod length

Find the maximum obtainable profit by cutting the rod into pieces.

### Example
```text
Input:
length = [1,2,3,4]
price  = [2,5,7,8]
rodLength = 5

Output:
12
```

---

# 🧠 Concepts Used

- Dynamic Programming
- Tabulation
- Memoization
- Unbounded Knapsack Pattern
- Include/Exclude Decision Making
- Optimization Techniques

---

# ⚡ DP Transition Idea

## 0/1 Knapsack
```text
dp[i][j] =
max(
    value[i-1] + dp[i-1][j-weight[i-1]],
    dp[i-1][j]
)
```

---

## Unbounded Knapsack
```text
dp[i][j] =
max(
    value[i-1] + dp[i][j-weight[i-1]],
    dp[i-1][j]
)
```

### Key Difference
After including an item:
- We stay in the same row
- Because item can be reused

---

# 📊 Time Complexity

| Problem | Time Complexity |
|---|---|
| Unbounded Knapsack | O(N × W) |
| Coin Change – 1 | O(N × Sum) |
| Coin Change – 2 | O(N × Sum) |
| Rod Cutting | O(N × Length) |

Where:
- `N` = number of items/coins
- `W` = capacity
- `Sum` = target sum

---

# 📂 Repository Structure

```text
Unbounded-Knapsack/
│
├── UnboundedKnapsack.java
├── CoinChange1.java
├── CoinChange2.java
├── RodCutting.java
└── README.md
```

---

# 🚀 Purpose of This Repository

- Learn Unbounded Knapsack pattern
- Understand reusable-item DP problems
- Prepare for coding interviews
- Improve Dynamic Programming skills
- Practice optimization and counting problems

---

# 🛠️ Language Used

- Java

---

# 📖 Learning Outcome

After completing these problems, you will understand:
- Difference between 0/1 and Unbounded Knapsack
- DP table construction
- State transition optimization
- Counting and minimization DP
- Reusable item problems

---

# 🔥 Interview Preparation

These problems are frequently asked in:
- Product-based companies
- Placement interviews
- Competitive programming contests

Common interview questions:
- Why does Unbounded Knapsack stay in same row?
- Difference between Coin Change 1 and Coin Change 2?
- How to optimize space complexity?
- How to identify unbounded DP problems?

---

# ⭐ Conclusion

Unbounded Knapsack is one of the most important Dynamic Programming patterns.

Mastering these problems helps in solving:
- Resource allocation problems
- Optimization problems
- Combination counting problems
- Advanced Dynamic Programming variations
