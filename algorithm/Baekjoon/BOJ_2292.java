package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();

		int count = 1, six = 6, index = 1;
		while(true) {
			if(N > index) {
				index += six;
				six += 6;
				count++;
			} else
				break;
		}
		System.out.println(count);
	}
}