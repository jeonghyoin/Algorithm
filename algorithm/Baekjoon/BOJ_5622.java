package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dial = scan.next();
		scan.close();
		
		int[] numbers = {67, 70, 73, 76, 79, 83, 86, 90};
		int[] time= {3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		for(int i=0; i<dial.length(); i++) {
			for(int j=0; j<numbers.length; j++) {
				int ascii = dial.charAt(i);
				if(numbers[j] >= ascii) {
					sum = sum + time[j];
					break;
				}
			}
		}
		System.out.println(sum);
	}
}