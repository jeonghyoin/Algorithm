package algorithm.SWEA;

import java.util.*;

public class SWEA_1284_수도요금경쟁 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int P = sc.nextInt(); // 1리터당 요금(A)
			int Q = sc.nextInt(); // B 기본 요금
			int R = sc.nextInt(); // B 기본요금 기준
			int S = sc.nextInt(); // 1리터당 요금(B)
			int W = sc.nextInt(); // 사용량
			
			int A = P * W;
			int B = (R >= W) ? Q : Q + ((W - R) * S);
			int result = (A >= B) ? B : A;
			
			System.out.println("#" + t + " " + result);
		}
	}
}
