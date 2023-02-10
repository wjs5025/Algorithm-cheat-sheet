# Arrays.sort vs Collections.sort

- **Collections.sort는 빠르다.**
- Arrays.sort : DualPivotQuicksort / 평균 O(nlog(n)), 최악 O(n^2)
- Collections.sort : TimeSort (삽입정렬과 합병정렬을 결합한 정렬) / 평균,최악 모두 nlog(n)
