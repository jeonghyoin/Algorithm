package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2750_selection {

	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());
		
		//수 입력
		int number[] = new int[N];
		for(int i=0; i<N; i++) {
			number[i] = (Integer.parseInt(rd.readLine()));
		}
		
		//선택 정렬
		int tmp;
		for(int i=0; i<N-1; i++) {
			for(int j=i; j<N; j++) {
				if(number[j] < number[i]) {
					tmp = number[j];
					number[j] = number[i];
					number[i] = tmp;
				}
			}
		}
		
		//출력
		for(int i=0; i<N; i++) {
			System.out.println(number[i]);
		}
	}
}