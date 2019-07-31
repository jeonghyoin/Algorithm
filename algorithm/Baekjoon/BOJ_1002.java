package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1002 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(rd.readLine());
		
		for(int i=0; i<T; i++) {
			String[] input = rd.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int r1 = Integer.parseInt(input[2]);
			int x2 = Integer.parseInt(input[3]);
			int y2 = Integer.parseInt(input[4]);
			int r2 = Integer.parseInt(input[5]);
			
			int rpr = r1+r2;
			int rmr = Math.abs(r1-r2);
			double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

			if(x1==x2 && y1==y2) {
				if(r1==r2) System.out.println("-1");
				if(r1!=r2) System.out.println("0");
			} else {
				if(d==rpr || d==rmr) System.out.println("1");
				if(d<rpr && d>rmr) System.out.println("2");
				if(d>rpr || d<rmr) System.out.println("0");
			}
		}
	}
}