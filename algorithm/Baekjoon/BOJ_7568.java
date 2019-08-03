package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_7568 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());
		
		int arrX[] = new int[N];
		int arrY[] = new int[N];
		
		for(int i=0; i<N; i++) {
			String input[] = rd.readLine().split(" ");
			arrX[i] = Integer.parseInt(input[0]);
			arrY[i] = Integer.parseInt(input[1]);
		}
		
		int ranking;
		for(int j=0; j<N; j++) {
			ranking = 1;
			for(int k=0; k<N; k++) { //모든 사람을 전부 검사하기
				if(arrX[j]<arrX[k] && arrY[j]<arrY[k])
					ranking++;
			}
			System.out.print(ranking+" ");
		}
	}
}