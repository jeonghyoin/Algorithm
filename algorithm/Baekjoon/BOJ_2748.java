package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2748 {
    public static void main(String[] args) throws Exception {
        //n은 90보다 작거나 같은 자연수이므로 int가 아닌 long으로 선언해야 함에 주의
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());

        //메모이제이션
        long[] fiboArr = new long[n+1];
        Arrays.fill(fiboArr, -1);

        long result = fibo(n, fiboArr);
        System.out.println(result);
    }

    static long fibo(int n, long fiboArr[]) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        if(fiboArr[n] != -1) {
            //배열에 저장된 값이 있을 경우
            return fiboArr[n];
        }
        //배열에 저장된 값이 없을 경우
        fiboArr[n] = fibo(n-1, fiboArr) + fibo(n-2, fiboArr);
        return fiboArr[n];
    }
}