package algorithm.SWEA;

import java.util.*;

public class SWEA_1948_날짜계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int mon[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int t = 1; t <= T; t++) {
			int M1 = sc.nextInt();
			int D1 = sc.nextInt();
			int M2 = sc.nextInt();
			int D2 = sc.nextInt();
			
			int sum = 0;
			for(int i=M1 + 1; i<M2; i++) {
				sum = sum + mon[i];
			}
			
			if(M1 != M2) {
				int day1 = mon[M1] - D1;
				sum = sum + day1 + D2;
			} else {
				sum = (D1 > D2)? sum + (D1 - D2) : sum + (D2 - D1);
			}
			
			System.out.println("#" + t + " " + (sum + 1));
		}
	}
}
