# Arrays

## Arrays.toString()

## Arrays.deepToString();

## 2차원 배열 정렬
```java
Arrays.sort(arr, (o1, o2) -> {
		    return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순
		});
```
# List

## list.stream().mapToInt(Integer::intValue).toArray();
