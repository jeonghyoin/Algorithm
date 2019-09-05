package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int tri[][] = new int[N+1][N+1];

        for(int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=i; j++) {
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                if(j == 0) { //왼쪽 테두리
                    tri[i][j] = tri[i][j] + tri[i-1][j];
                } else if(j == i) {//오른쪽 테두리
                    tri[i][j] = tri[i][j] + tri[i-1][j-1];
                } else {
                    tri[i][j] = Math.max(tri[i-1][j-1], tri[i-1][j]) + tri[i][j];
                }
                //최대값 저장
                if (max < tri[i][j])
                    max = tri[i][j];
            }
        }
        System.out.print(max);
        br.close();
    }
}
