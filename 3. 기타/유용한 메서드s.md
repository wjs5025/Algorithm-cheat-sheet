# Arrays

## 1. Arrays.toString()

## 2. Arrays.deepToString();

## 3. int 배열 역정렬

```java
Integer[] numInt = Arrays.stream(nums).boxed().toArray(Integer[]::new);
Arrays.sort(numInt, Collections.reverseOrder());
```

## 4. 2차원 배열 정렬

```java
Arrays.sort(arr, (o1, o2) -> {
		    return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순
		});
```

# List

## list.stream().mapToInt(Integer::intValue).toArray();

# Integer

## 1. 16진수 -> 10진수 변환

```java
Integer.decode("0x1F7")
```


# ArrayList
## ArrayList 합집합
```java
ArrayList1.addAll(ArrayList2);
```

## ArrayList 교집합
```java
ArrayList1.retainAll(ArrayList2);
```

## ArrayLIst 부분집합
```JAVA
ArrayList1.containsAll(ArrayList2);
```

## ArrayList 차집합
```java
ArrayList1.removeAll(arrayList2);
```