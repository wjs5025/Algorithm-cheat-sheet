// 일반 재귀 거듭제곱
private static long exp1(long x, long n) {
    callCnt1++;
    if (n == 1)
        return x;

    return x * exp1(x, n - 1);
}

// 분할 정복 거듭제곱
private static long exp2(long x, long n) {
    callCnt2++;

    if (n == 1)
        return x;

    long y = exp2(x, n / 2);

    return n % 2 == 0 ? y * y : y * y * x;
}