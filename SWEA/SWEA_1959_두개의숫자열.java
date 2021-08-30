package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1959_두개의숫자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt(); // A의 길이 (큼)
			int M = sc.nextInt(); // B의 길이 (작음)
			int[] Aj = new int[N]; // 큰 배열
			int[] Bj = new int[M]; // 작은 배열
			
			for(int i = 0; i < N; i++) Aj[i] = sc.nextInt();
			for(int i = 0; i < M; i++) Bj[i] = sc.nextInt();
			
			int max = 0;
			if(N > M) {
				for(int i=0; i<=N-M; i++) {
					int sum = 0;
					for(int j=0; j<M; j++) {
						sum = sum + (Aj[j+i] * Bj[j]);
						// System.out.println(Aj[j+i] + " * " + Bj[j] + " = " + sum);
					}
					max = (sum > max) ? sum : max;
				}
			} else {
				for(int i=0; i<=M-N; i++) {
					int sum = 0;
					for(int j=0; j<N; j++) {
						sum = sum + (Bj[j+i] * Aj[j]);
						// System.out.println(Aj[j+i] + " * " + Bj[j] + " = " + sum);
					}
					max = (sum > max) ? sum : max;
				}
			}
			
			System.out.println("#" + t + " " + max);
		}
	}
}
