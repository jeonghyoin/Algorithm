package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2750_bubble {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());
		
		//수 입력
		int number[] = new int[N];
		for(int i=0; i<N; i++) {
			number[i] = (Integer.parseInt(rd.readLine()));
		}
		
		int tmp;
		for(int i=N-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(number[j+1] < number[j]) {
					tmp = number[j+1];
					number[j+1] = number[j];
					number[j] = tmp;
				}
			}
		}
		
		//출력
		for(int i=0; i<N; i++) {
			System.out.println(number[i]);
		}
	}
}
