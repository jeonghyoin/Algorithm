package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			int R = scan.nextInt();
			String S = scan.next();
			
			String str = "";
			for(int m=0; m<S.length(); m++) {
				for(int n=0; n<R; n++) {
					str = str + S.charAt(m);
				}
			}
			System.out.println(str);
		}
		scan.close();
	}
}