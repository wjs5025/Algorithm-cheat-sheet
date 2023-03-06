import java.util.Arrays;

public class 순조부 {
    static boolean[] visited;
    static int[] permutation;

    // 순열
    static void getPermutation(int idx) {
        if (idx == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(permutation[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= 5; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            permutation[idx] = i;
            getPermutation(idx + 1);
            visited[i] = false;
        }
    }

    // 중복 순열
    static void getDuplicationPermutation(int idx) {
        if (idx == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(permutation[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= 5; i++) {
            permutation[idx] = i;
            getDuplicationPermutation(idx + 1);
        }
    }

    // 조합
    static void getCombination(int idx, int start) {
        if (idx == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(permutation[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= 5; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            permutation[idx] = i;
            getCombination(idx + 1, i);
            visited[i] = false;
        }
    }

    // 조합
    static void getDuplicationCombination(int idx, int start) {
        if (idx == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(permutation[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= 5; i++) {
            permutation[idx] = i;
            getDuplicationCombination(idx + 1, i);
        }
    }

    static void getSubSet(int idx) {
        if (idx == 6) {
            for (int i = 1; i < 6; i++) {
                if (visited[i])
                    System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        visited[idx] = true;
        getSubSet(idx + 1);
        visited[idx] = false;
        getSubSet(idx + 1);
    }

    public static void main(String[] args) {
        // 5명의 학생 중 3등까지 뽑아서 나열하는 경우의 수
        System.out.println("====일반 순열====");
        visited = new boolean[6];
        permutation = new int[3];
        getPermutation(0);

        // 5명의 학생 중 3등까지 중복있게 뽑아서 나열하는 경우의 수
        System.out.println("====중복 순열====");
        permutation = new int[3];
        getDuplicationPermutation(0);

        // 5명의 학생 중 3명을 뽑는 경우의 수
        System.out.println("====조합====");
        permutation = new int[3];
        visited = new boolean[6];
        getCombination(0, 1);

        // 5명의 학생 중 3명을 뽑는 경우의 수
        System.out.println("====중복 조합====");
        permutation = new int[3];
        getDuplicationCombination(0, 1);

        // 5명의 학생을 뽑는 모든 경우의 수
        System.out.println("====부분 집합====");
        permutation = new int[3];
        visited = new boolean[6];
        getSubSet(1);
    }
}