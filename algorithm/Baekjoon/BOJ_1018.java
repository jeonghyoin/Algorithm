package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1018 {
	static char[][] whiteChess = new char[][] {
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'}
	};
	static char[][] blackChess = new char[][] {
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'}
	};
	
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String XY[] = rd.readLine().split(" ");
		int X = Integer.parseInt(XY[1]);
		int Y = Integer.parseInt(XY[0]);
		
		//2차원 배열에 넣기
		char array[][] = new char[X][Y];
		for(int y=0; y<Y; y++) {
			String input =  rd.readLine();
			for(int x=0; x<X; x++) {
				array[x][y] = input.charAt(x);
			}
		}
		
		int indexX = X-7, indexY = Y-7;
		int res1 = getDif(array, whiteChess, indexX, indexY);
		int res2 = getDif(array, blackChess, indexX, indexY);

		System.out.println(Math.min(res1, res2));
	}
	
	public static int getDif(char[][] array, char[][] targetChess, int indexX, int indexY) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int dif = 0;
		for(int i=0; i<indexY; i++) {
			for(int j=0; j<indexX; j++) {
				dif = 0;
				for(int m=0; m<8; m++) {
					for(int n=0; n<8; n++) {
						//비교하기
						if(targetChess[n][m] != array[n+j][m+i])
							dif++;
					}
				}
				result.add(dif);
			}
		}
		Collections.sort(result);
		
		return result.get(0);
	}
}
