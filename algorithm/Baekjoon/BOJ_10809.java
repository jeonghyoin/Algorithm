package algorithm.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		
		int [] arr = new int[26];
		Arrays.fill(arr, -1);
		
		for(int i=0; i<S.length(); i++) {
			int ascii = S.charAt(i);
			if(arr[ascii-97] == -1) {
				arr[ascii-97] = i;
			}
		}

		for(int val : arr){
		    System.out.print(val+" ");
		}
	}
}