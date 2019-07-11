package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1929 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] input = rd.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		rd.close();
		
		boolean[] arr = new boolean[1000001];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;
		
		for(int i=2; i<=(int)Math.sqrt(N); i++) {
			if(arr[i]) {
				for(int j=i+i; j<=N; j+=i) {
					arr[j] = false;
				}
			}
		}
		for(int k=M; k<=N; k++) {
			if(arr[k])
				System.out.println(k);
		}
	}
}
