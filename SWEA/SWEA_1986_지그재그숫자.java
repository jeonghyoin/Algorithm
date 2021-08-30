package algorithm.SWEA;

import java.util.*;

public class SWEA_1986_지그재그숫자 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int sum;
		// 1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			sum = 0;
			
			for(int i=1; i<=N; i++) {
				if(i % 2 == 0) {
					sum = sum - i;
				} else {
					sum = sum + i;
				}
			}
			
			System.out.println("#" + t + " " + sum);
		}
	}
}
