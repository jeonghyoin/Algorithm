package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2579 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        int result[] = new int[N+1];

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i] = Integer.parseInt(st.nextToken());
        }

        result[1] = dp[1];
        result[2] = dp[1] + dp[2];
        for(int i=3; i<=N; i++) {
            result[i] = Math.max(dp[i-1] + dp[i] + result[i-3], dp[i] + result[i-2]); //한 칸, 두 칸
        }

        System.out.print(result[N]);
    }
}
