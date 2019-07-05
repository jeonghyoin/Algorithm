package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int distance = y - x;
			int sqrt = (int) Math.sqrt(distance);
			int count = 0;
			
			distance -= (sqrt*sqrt);
			count = sqrt+(sqrt-1);
			
			int j = sqrt;
			if(distance > 0) {
				while(distance != 0) {
					distance -= j;
					if(distance >= 0) {
						count++;
					} else {
						distance += j;
						j--;
					}
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}