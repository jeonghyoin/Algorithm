package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String N = rd.readLine();
		int N2 = Integer.parseInt(N);
		
		String str;
		int hap;
		boolean flag = true;
		
		for(int i=1; i<=N2; i++) {
			hap=i;
			str = Integer.toString(i);
			for(int j=0; j<str.length(); j++) {
				hap += str.charAt(j)-48;
			}
			
			if(hap==N2) {
				System.out.println(i);
				flag = false; break;
			}
		}
		
		if(flag) System.out.println("0");
	}
}