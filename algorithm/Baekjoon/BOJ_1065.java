package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		int num1, num2, num3, com1, com2;
		
		if (num < 99) {
			System.out.println(num);
		} else {
			int cnt = 99;
			for(int i=100; i<=num; i++) {
				num1 = i/100;
				num2 = (i%100)/10;
				num3 = ((i%100)%10);
				
				com1 = num1-num2;
				com2 = num2-num3;
				
				if(com1==com2) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}