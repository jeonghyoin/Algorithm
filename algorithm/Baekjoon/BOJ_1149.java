package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1149 {
    static int R = 0;
    static int G = 1;
    static int B = 2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int color[][] = new int[N][3];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            color[i][R] = Integer.parseInt(st.nextToken());
            color[i][G] = Integer.parseInt(st.nextToken());
            color[i][B] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++) {
            color[i][R] = color[i][R] + Math.min(color[i-1][G], color[i-1][B]); //red 선택
            color[i][G] = color[i][G] + Math.min(color[i-1][R], color[i-1][B]); //green 선택
            color[i][B] = color[i][B] + Math.min(color[i-1][R], color[i-1][G]); //blue 선택
        }

        System.out.print(Math.min(color[N-1][R], Math.min(color[N-1][B], color[N-1][G])));
    }
}