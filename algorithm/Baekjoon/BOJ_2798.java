package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2798 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		String[] input = rd.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		//정수 배열로 저장
		int[] card = new int[N];
		String[] input2 = rd.readLine().split(" ");
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(input2[i]);
		}
		
		//오름차순 정렬
		Arrays.sort(card);
		int sum = 0, res = 0;
		for(int j=N-1; j>=2; j--) {
			for(int k=j-1; k>=1; k--) {
				for(int l=k-1; l>=0; l--) {
					sum = card[j]+card[k]+card[l];
					if(sum <= M)
						res = Math.max(sum, res);
				}
			}
		}
		
		System.out.println(res);
	}
}