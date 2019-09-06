package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10844 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][11];

        //한 자리일 경우 미리 초기화 - 앞자리 0이 올 수 없기 때문
        dp[1][0] = 0;
        for(int i=1; i<=9; i++) {
            dp[1][i] = 1;
        }
        for(int i=2; i<=N; i++) {
            for(int j=0; j<=9; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][j+1] % 1000000000;
                } else if(j == 9) {
                    dp[i][j] = dp[i-1][j-1] % 1000000000;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
                }
            }
        }

        long sum = 0;
        for(int i=0; i<=9; i++) {
            sum += dp[N][i];
        }
        System.out.print(sum % 1000000000);
    }
}
