package algorithm.SWEA;

import java.util.*;

public class SWEA_1989_초심자의회문검사 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t = 1; t <= T; t++) {
			String str = sc.next();
			int start = 0;
			int end = str.length() - 1;
			int result = 1;
			
			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(start) != str.charAt(end)) {
					result = 0; break;
				}
				start++; end--;
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
