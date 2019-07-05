package algorithm.Baekjoon;

import java.util.Scanner;

public class BOJ_10250 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int t=0; t<T; t++) {
			int H = scan.nextInt();
			int N = scan.nextInt();
			
			int XX = (N - 1) / H;
			int YY = (N - 1) % H;
			
			int resXX = XX + 1;
			int resYY = (YY + 1)*100;
			
			System.out.println(resYY+resXX);
		}
		scan.close();
	}
}