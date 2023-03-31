import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] LIS = new int[N]; // 최장 길이 수열

    	for (int i = 0; i < N; i++) {
    		arr[i] = sc.nextInt();
    	}

    	int max = 0;

    	for (int i = 0; i < N; i++) {
    		LIS[i] = 1; // 자신만 끝에 세웠을 경우 1의 길이
    		for (int j = 0; j < i; j++) { // 직전까지 돌려야 하므로 i보다 작을 때 까지 돌려야 한다.
    			// 나(arr[i]를) 끝으로 하는 증가수열이 가능한 상황.
    			if (arr[j] < arr[i]) {
    				LIS[i] = Math.max(LIS[i], LIS[j] + 1);
    			}
    		}
    		max = Math.max(LIS[i], max);
    	}
    	System.out.println(max);
    }
}