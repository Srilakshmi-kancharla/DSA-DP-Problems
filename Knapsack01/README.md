# Knapsack Problem in Dynamic Programming

The **Knapsack Problem** is one of the most important and classic problems in **Dynamic Programming (DP)**.  
It is widely used to understand optimization techniques in DSA and is commonly asked in coding interviews.

---

# 📌 What is the Knapsack Problem?

The knapsack problem is based on selecting items with given:

- **Weight**
- **Value/Profit**

such that the total value is maximized without exceeding the capacity of the knapsack (bag).

## Real-Life Example
Imagine you have a bag with limited capacity and several items with different weights and profits.

Your goal is:
- Put items into the bag
- Do not exceed the bag capacity
- Maximize the total profit

---

# 🎯 Formula Representation

Given:
- `N` items
- `weight[i]` → weight of item
- `value[i]` → profit/value of item
- `W` → maximum capacity of knapsack

Find:
- Maximum total value that can be obtained.

---

# 📚 Types of Knapsack Problems

## 1️⃣ 0/1 Knapsack
- Each item can either:
  - Be selected once (`1`)
  - Or not selected (`0`)
- Cannot take fractional items
- Most common DP problem

### Example
If an item exists:
- You either take it completely
- Or leave it completely

---

## 2️⃣ Fractional Knapsack
- Items can be divided into fractions
- Uses **Greedy Algorithm**
- Select items based on value/weight ratio

### Example
You can take:
- Half of an item
- Quarter of an item

---

## 3️⃣ Unbounded Knapsack
- An item can be selected multiple times
- Used in:
  - Coin Change
  - Rod Cutting
  - Integer Break

---

## 4️⃣ Multiple Knapsack
- Limited quantity of each item is available

---

## 5️⃣ Subset Sum Problem
- Special case of 0/1 Knapsack
- Determine whether a subset exists with a given sum

---

# 🔥 Introduction to 0/1 Knapsack

The **0/1 Knapsack** problem is a classic Dynamic Programming problem.

## Problem Statement
Given:
- Weights of items
- Values of items
- A bag with limited capacity

Find the maximum value possible without exceeding the capacity.

---

# 🧠 Key Idea

For every item, we have two choices:

1. Include the item
2. Exclude the item

We choose the option that gives maximum profit.

---

# 📌 Recursive Decision

For each item:

```text
max(
    include current item,
    exclude current item
) 
