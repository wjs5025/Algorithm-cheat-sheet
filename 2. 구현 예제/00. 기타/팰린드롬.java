/* # 배열 팰린드롬 검사 */

public static boolean isPalindrome (int[] arr) {
    int start = 0;
    int end = arr.length-1;

    while(start <= end) {
        if(arr[start++] != arr[end--]) return false;
    }
    return true;
}
