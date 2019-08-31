package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9461 {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(rd.readLine());

        long arr[] = new long[101];
        arr[0] = 0;
        arr[1] = arr[2] = arr[3] = 1;
        arr[4] = arr[5] = 2;
        for(int i=6; i<=100; i++) {
            arr[i] = arr[i-1] + arr[i-5];
        }

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(rd.readLine());
            System.out.println(arr[N]);
        }
    }
}