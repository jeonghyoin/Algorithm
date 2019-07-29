package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_3009 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int listX[] = new int[3];
		int listY[] = new int[3];
		
		String[] input1 = rd.readLine().split(" ");
		listX[0] = Integer.parseInt(input1[0]);
		listY[0] = Integer.parseInt(input1[1]);
		
		String[] input2 = rd.readLine().split(" ");
		listX[1] = Integer.parseInt(input2[0]);
		listY[1] = Integer.parseInt(input2[1]);
		
		String[] input3 = rd.readLine().split(" ");
		listX[2] = Integer.parseInt(input3[0]);
		listY[2] = Integer.parseInt(input3[1]);
		
		int newX = findNumber(listX);
		int newY = findNumber(listY);
		
		System.out.println(newX+" "+newY);
	}
	
	private static int findNumber(int[] list) {
		for(int i=0; i<2; i++) {
			for(int j=i+1; j<=2; j++) {
				if(list[i] == list[j]) {
					list[i] = list[j] = -1; break;
				}
			}
		}
		int res = 0;
		for(int i=0; i<3; i++) {
			if(list[i] > 0)
				res = list[i];
		}
		
		return res;
	}
}