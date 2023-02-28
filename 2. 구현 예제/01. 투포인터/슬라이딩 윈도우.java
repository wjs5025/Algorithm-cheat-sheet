static void slidingWindow() {
    int end = primes.length - 1;
    int intervalSum = 0;

    for (int start = primes.length - 1; start >= 0; start--) {
        while (intervalSum < N && end >= 0) {
            intervalSum += primes[end];
            end--;
        }
        if (intervalSum == N) cnt++;
        intervalSum -= primes[start];
    }
        
}