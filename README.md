## 排序

### 选择排序

`i` ~ `n-1` 范围，找到最小值放在 `i` 位置，然后继续往后遍历

```java
for (int minIndex, i = 0; i < arr.length - 1; i++) {
  minIndex  = i;
  for (int j = i; j < arr.length; j++) {
    if (arr[j] < arr[minIndex]) {
      minIndex = j;
    }
  }
  swap(arr, i, minIndex);
}
```



### 冒泡

两两对比，谁大谁往后。

```java
for (int i = arr.length - 1; i > 0; i--) {
  for (int j = 0; j < i; j++) {
    if (arr[j] > arr[j + 1]) {
      swap(arr, j, j + 1);
    }
  } 
}
```



### 插入排序

