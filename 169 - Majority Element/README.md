# 🧠 169. Majority Element

## 🔗 LeetCode Problem
**Difficulty:** Easy  
**Topic:** Array  
**Constraint:** Majority element always exists  

---

## 📌 Problem Statement

Given an integer array `nums` of size `n`, return the majority element.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.

---

## 🧪 Example

### Example 1
Input:
```
nums = [3,2,3]
```
Output:
```
3
```

### Example 2
Input:
```
nums = [2,2,1,1,1,2,2]
```
Output:
```
2
```

---

## 🚀 Optimal Approach: Boyer–Moore Voting Algorithm

### 💡 Idea

- Ek `candidate` maintain karte hain  
- Ek `count` maintain karte hain  
- Agar `count` 0 ho jaye, to naya candidate choose kar lete hain  
- Agar current element candidate ke barabar hai → `count++`  
- Agar alag hai → `count--`  

Kyuki majority element `n/2` se zyada baar aata hai,  
isliye use completely cancel nahi kiya ja sakta.  
End me wahi element final candidate ke roop me bachta hai.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n)   |
| Space      | O(1)   |