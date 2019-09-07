package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] result = new int[N];
        for(int i=0; i<N; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(result);
        int sum = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<=i; j++) {
                sum += result[j];
            }
        }

        System.out.print(sum);
    }
}
