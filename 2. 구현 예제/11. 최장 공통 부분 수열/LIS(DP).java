import java.util.Arrays;
import java.util.Scanner;

public class list_dp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		int[] C = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = s.nextInt();

		int size = 0;
		for (int i = 0; i < N; i++) {
			int temp = Arrays.binarySearch(C, 0, size, arr[i]); // 리턴값 : -insertPoint -1
			temp = Math.abs(temp) - 1;// 삽입위치
			C[temp] = arr[i];

			if (size == temp) { 
				size++;
			}
		}
		System.out.println(size);
	}
}