package algorithm.Baekjoon;

import java.util.Scanner;

public class BOJ_4811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[][] dp = new long[31][31];
        // W가 0일 경우는 h만 고르는 한 가지의 경우밖에 없음
        for(int i=0; i<=30; i++){
            dp[0][i] = 1;
        }

        for(int i=1; i<=N; i++) {
            for(int j=0; j<=N; j++) {
                if(j == 0) { // h가 없는 경우 : (w-1, h+1)
                    dp[i][j] = dp[i - 1][1];
                } else { // w, h가 있는 경우 : (w-1, h+1) or (w, h-1) 두 가지의 경우의 수를 더해줌
                    dp[i][j] = dp[i - 1][j + 1] + dp[i][j - 1];
                }
            }
        }

        // TODO : 출력 수정
        // 처음에는 무조건 W를 고르므로 dp[N-1][1]를 출력한다.
        // 0일 경우는 출력하지 않음
        while(N != 0) {
            N = scanner.nextInt();
        }
        System.out.println(dp[N-1][1]);
    }
}