# lowerBound, upperBound (하한과 상한 찾기)

```java
// 하한 찾기
public static int lowerBound(int l, int r, int key) {
    int m;
    while (l < r) {
        m = (l + r) / 2;
        if (key <= cards[m])
            r = m;
        else
            l = m + 1;
    }
    return r;
}

// 상한 찾기
public static int upperBound(int l, int r, int key) {
    int m;
    while (l < r) {
        m = (l + r) / 2;
        if (key < cards[m])
            r = m;
        else
            l = m + 1;
    }
    return r;
}
```
