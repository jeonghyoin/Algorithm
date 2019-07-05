package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		scan.close();
		
		int [] arr = new int[26];
		
		for(int i=0; i<word.length(); i++) {
			int ascii = word.charAt(i);
			if(ascii < 97) {
				ascii = ascii + 32;
			}
			arr[ascii-97]++;
		}
		
		int max = 0, maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			} else if(arr[i] == max) {
				maxIndex = -2;
			}
		}
		
		int res = maxIndex + 65;
		System.out.print((char)res);
	}
}
