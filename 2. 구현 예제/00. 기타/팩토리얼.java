factorial[0] = 1;

for (int i = 1; i <= 1000000; i++) {
    factorial[i] = factorial[i - 1] * i % MOD;
}
