static void twoPointerSearch() {
		int start = 0;
		int end = n - 1;

		while (start < end) {
			int tmp = nums[start] + nums[end];
			
			if (tmp == x) cnt++;

			if (tmp > x) end--;
			else start++;

		}
}