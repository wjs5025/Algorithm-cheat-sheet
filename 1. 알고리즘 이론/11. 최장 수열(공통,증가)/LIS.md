# LIS (Longest Increasing Subsequence)

- 최장 증가 수열
- ex. 3, 2, 6, 4, 5, 1

- 배열 순서를 유지하면서 크기가 점진적으로 커지는 가장 긴 부분수열의 길이.
- 어떤 수열이 왼쪽에서 오른쪽으로 나열되어 있으면, 그 배열 순서를 유지하면서 크기가 점진적으로 커지는 가장 긴 부분 수열을 추출하는 문제.

# Brute-force 접근 방법.

- 수열의 모든 부분집합을 구해서, 그 부분 집합이 증가수열인지를 판별함.
- 증가 수열 중 가장 길이가 긴 값을 구함.
- 부분집합의 개수를 2^n.
- 즉, 원소가 6개면 64개의 부분집합.
- O(2^n)

# dp 접근

**LIS(i)를 LIS(1), ..., LIS(2), ... LIS(I-1) 와의 관계로 표현할 수 있을까?**

- case1 : LIS(i)가 ai를 부분수열의 마지막으로 포함하지 않는다면?, LIS(i) = LIS(i-1)
- case2 : LIS(i)가 ai를 부분 수열의 마지막으로 포함한다면, LIS(i) = ?

# ase2 : LIS(i)가 ai를 부분 수열의 마지막으로 **포함**한다면, LIS(i) = ?

- 증가 수열의 관계인 aj < ai 인 aj를 찾는다.
- j값을 알 수 없으므로 모두 검색해야 한다.
- 그 중 최대값을 찾아 1증가시켜 LIS(i)에 저장한다.

```
LIS(i) = 1 + max LIS(j)
    j < i and aj < ai
```

- LIS(i) 중에서 최대값을 찾는다. (i : 1 ~ n)
- LIS[i]의 정의 : i를 끝으로 하는 최장 증가 수열

# DP 접근 알고리즘

LIS[i] = i 원소를 부분수열의 마지막으로 하는 부분 수열의 최장 길이 값.

```
// O(n^2)
FOR i in 1 -> n
    LIS[i] = 1 // 최장길이 갱신(가능한 가장 작은 값)
    FOR j in 1 -> i - 1
            if aj < ai AND LIS[i] < LIS[j] + 1
                    LIS[i] = LIS[j]  +1
RETURN max LIS[]
```

{3, 2, 6, 4, 5, 1}

```
LIS[1]      LIS[2]      LIS[3]      LIS[4]      LIS[5]      LIS[6]
1           1           {3,6}:2     {3,4}:2     {3,4,5}:3   1
```

# 최종 코드

```java
package com.ssafy.live25;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] LIS = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;

		for (int i = 0; i < N; i++) {
			LIS[i] = 1; // 자신만 끝에 세웠을 경우 1의 길이
			for (int j = 0; j < i; j++) { // 직전까지 돌려야 하므로 i보다 작을 때 까지 돌려야 한다.
				// 나(arr[i]를) 끝으로 하는 증가수열이 가능한 상황.
				if (arr[j] < arr[i] && LIS[i] < LIS[j] + 1) {
					LIS[i] = LIS[j] + 1;
				}
			}
			max = Math.max(LIS[i], max);
		}
		System.out.println(max);

	}
}

```

# 이진 검색을 이용한 보다 효율적인 방법

- C[k] : 길이 k의 증가수열에 대하여 길이 k자리에 올 수 있는 가능한 값 중 가장 작은 값을 C[k]에 저장
- 각 원소마다 C[]를 갱신하기 위해 이진 검색을 수행
- O(nlogn)
