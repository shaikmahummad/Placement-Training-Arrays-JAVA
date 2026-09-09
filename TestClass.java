import java.util.Scanner;

public class TestClass {

    static int printClicks(int N, int X, int L, int[] C) {

        boolean[][] dp = new boolean[X + 1][L];
        dp[0][0] = true;

        for (int val : C) {
            for (int cnt = X - 1; cnt >= 0; cnt--) {
                for (int sum = 0; sum + val < L; sum++) {
                    if (dp[cnt][sum]) {
                        dp[cnt + 1][sum + val] = true;
                    }
                }
            }
        }

        int ans = 0;

        for (int cnt = 0; cnt <= X; cnt++) {
            for (int sum = 0; sum < L; sum++) {
                if (dp[cnt][sum]) {
                    ans = Math.max(ans, sum);
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int L = sc.nextInt();

        int[] C = new int[N];

        for (int i = 0; i < N; i++)
            C[i] = sc.nextInt();

        System.out.print(printClicks(N, X, L, C));
    }
}