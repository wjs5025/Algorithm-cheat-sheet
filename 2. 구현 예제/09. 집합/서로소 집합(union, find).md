# 서로소집합

```java
	static int N;
	static int[] parents;

	// 1. makeSet() : 최소 단위 집합 생성
	static void makeSet() {
		// 자신의 부모노드를 자신의 값으로 세팅
		for (int i = 0; i < N; i++) {
			parents[i] = i; // 자신의 부모를 자신으로 지정

		}
	}

	// 2. findSet() : 속한 집합 찾기
	static int findSet(int a) {
		if (parents[a] == a)
			return a;
		return parents[a] = findSet(parents[a]);
	}

	// 3. unionSet() : 두 집합 합치
	static void unionSet(int a, int b) {
		a = findSet(a);
		b = findSet(b);

		if (a < b)
			parents[b] = a;
		else
			parents[a] = b;
	}
```
