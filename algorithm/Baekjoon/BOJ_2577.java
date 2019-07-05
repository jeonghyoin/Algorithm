package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		
		String res = String.valueOf(num1*num2*num3);
		int su[] = new int[10]; //카운트할 배열

		//0을 빼주는 이유는 정수로 변환해야 하므로
		for(int i=0; i<res.length(); i++) {
			su[res.charAt(i) - '0']++;
		}
		for(int i=0; i<su.length; i++) {
			System.out.println(su[i]);
		}
	}
}