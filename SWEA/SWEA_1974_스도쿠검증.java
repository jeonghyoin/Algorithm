package algorithm.SWEA;

import java.util.Scanner;

public class SWEA_1974_스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		/*
		 * 9x9 스도쿠에서 겹치는 숫자가 없을 경우 1, 그렇지 않을 경우 0 출력
		 *	1) 3x3 배열 내에서 겹치는 숫자가 없어야 함
		 *	2) 9x9 배열의 가로 세로에서 겹치는 숫자가 없어야 함
		*/
		for(int t = 1; t <= T; t++) {
			int[][] arr = new int[9][9];
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 3x3 배열 탐색
			int a = 1;
			Loop1 : for(int i=0; i<7; i+=3) {
				int col = i + 3;
				for(int j=0; j<7; j+=3) {
					int row = j + 3;
					int check[] = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
					for(int c=i; c<col; c++) {
						for(int r=j; r<row; r++) {
							// System.out.print("arr["+c+"]["+r+"] = " + arr[c][r] + " ");
							if(check[arr[c][r]] == 1) {
								a = 0;
								break Loop1;
							} else {
								check[arr[c][r]]++;
							}
						}
						// System.out.println();
					}
				}
			}
			// System.out.println("A : " + a);
			
			// 9x9 배열 가로 탐색
			int b = 1;
			Loop2: for(int i=0; i<9; i++) {
				int check[] = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				for(int j=0; j<9; j++) {
					// System.out.print("arr["+i+"]["+j+"] = " + arr[i][j] + " ");
					if(check[arr[i][j]] == 1) {
						b = 0;
						break Loop2;
					} else {
						check[arr[i][j]]++;
					}
				}
				// System.out.println();
			}
			// System.out.println("B : " + b);
			
			// 9x9 배열 세로 탐색
			int c = 1;
			Loop3 : for(int i=0; i<9; i++) {
				int check[] = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				for(int j=0; j<9; j++) {
					// System.out.print("arr["+j+"]["+i+"] = " + arr[j][i] + " ");
					if(check[arr[j][i]] == 1) {
						c = 0;
						break Loop3;
					} else {
						check[arr[j][i]]++;
					}
				}
				// System.out.println();
			}
			// System.out.println("C : " + c);
			
			if(a + b + c == 3) {
				System.out.println("#" + t + " " + 1);
			} else {
				System.out.println("#" + t + " " + 0);
			}
		}
	}
}
