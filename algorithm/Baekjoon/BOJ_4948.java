package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[246913];
		arr[0] = arr[1] = false;
		
		while(true) {
			int n = Integer.parseInt(rd.readLine());
			if(n==0) break;
			int n2 = 2*n;
			Arrays.fill(arr, true);

			int sqrt = (int)Math.sqrt(n2);
			for(int i=2; i<=sqrt; i++) {
				if(arr[i]) {
					for(int j=i+i; j<=n2; j+=i) {
						arr[j] = false;
					}
				}
			}
			
			int sum = 0;
			for(int k=n+1; k<=n2; k++) {
				if(arr[k])
					sum++;
			}
			System.out.println(sum);
		}
	}
}
