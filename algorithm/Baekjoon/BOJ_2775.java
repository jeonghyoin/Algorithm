package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2775 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			
			int result = recursion(k, n);
			
			System.out.println(result);
		}
		scan.close();
	}
	
	public static int recursion(int k, int n) {
		if(k==0)
			return n;
		if(n<=1)
			return 1;
		 else
			 return recursion(k, n-1) + recursion(k-1, n);
	}
}