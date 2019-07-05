package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		String[] splitStr = str.split("");
		int enter = 0;
		
		for(int i=0; i<splitStr.length; i++) {
			System.out.print(splitStr[i]);
			++enter;
			if(enter % 10 == 0) {
				System.out.println();
			}
		}
	} 
}