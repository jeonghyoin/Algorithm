package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_10039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = new int[5];
		
		for(int i=0; i<5; i++) {
			int input = scan.nextInt();
			if(input < 40) {
				score[i] = 40;
			} else
				score[i] = input;
		}
		scan.close();
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + score[i];
		}
		
		System.out.println(sum/5);
	}
}