package algorithm.Baekjoon;

import java.util.*;

public class BOJ_9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        // 점화식 : dp[n] = dp[n-3] + dp[n-2] + dp[n-1]
        // N의 최대값이 11이므로 배열의 범위는 0~11
        int[] dp = new int[12];
        Arrays.fill(dp, 0);
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int t=0 ; t<T ; t++) {
            int N = scanner.nextInt();
            for(int i = 4; i <= N; i++) {
                if(dp[i] == 0) { // 수행한 적이 없을 때만
                    dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
                }
            }
            System.out.println(dp[N]);
        }
    }
}
