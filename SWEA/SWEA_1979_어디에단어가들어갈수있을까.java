package algorithm.SWEA;

import java.util.Scanner;

public class SWEA_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int result = 0;
			
			// 가로 탐색 [0,0], [0,1], [0,2] ...
			for(int i=0; i<N; i++) {
				int count_c = 0;
				for(int j=0; j<N; j++) {
					// 검정색을 만나면 카운트 초기화
					if(arr[i][j] == 0) {
						// 단어 3개가 들어갈 수 있는 경우
						if(count_c == M) result++;
						count_c = 0;
					} else count_c++;
				}
				if(count_c == M) result++;
			}
			
			
			// 세로 탐색 [0,0], [1,0], [2,0]...
			for(int i=0; i<N; i++) {
				int count_r = 0;				
				for(int j=0; j<N; j++) {
					// 검정색을 만나면 카운트 초기화
					if(arr[j][i] == 0) {
						// 단어 3개가 들어갈 수 있는 경우
						if(count_r == M) result++;
						count_r = 0;
					} else count_r++;
				}
				if(count_r == M) result++;
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
