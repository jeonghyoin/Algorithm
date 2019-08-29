package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1904 {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(rd.readLine());

        int dp[] = new int[1000000];
        dp[0] = 0; dp[1] = 1; dp[2] = 2;

        for(int i=3; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }

        System.out.println(dp[N]);
    }
}