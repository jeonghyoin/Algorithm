package algorithm.Programmers.Lv2;

import java.util.Arrays;

public class _2xn_타일링 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 4;

        int dp[] = new int[60000];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        // 점화식 : fibo[i] = fibo[i-1] + fibo[i-2]
        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }

        System.out.println(dp[n]);
        //return dp[n];
    }
}