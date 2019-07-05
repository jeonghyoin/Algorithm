package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		scan.close();
		
		String newA="", newB="";
		for(int i=2; i>=0; i--) {
			newA = newA + A.charAt(i);
			newB = newB + B.charAt(i);
		}
		
		int max = Math.max(Integer.parseInt(newA), Integer.parseInt(newB));
		System.out.print(max);
	}
}
