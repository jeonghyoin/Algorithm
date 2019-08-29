package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1003 {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(rd.readLine());

        long[] fiboArr = new long[41];
        Arrays.fill(fiboArr, -1);

        int n;
        for(int i=0; i<T; i++) {
            n = Integer.parseInt(rd.readLine());
            if(n == 0) {
                System.out.println("1 0");
            } else {
                System.out.println(fibo(n-1, fiboArr)+" "+fibo(n, fiboArr));
            }
        }
    }

    static long fibo(int n, long fiboArr[]) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(fiboArr[n] != -1) {
            return fiboArr[n];
        }
        fiboArr[n] = fibo(n-1, fiboArr) + fibo(n-2, fiboArr);
        return fiboArr[n];
    }
}
