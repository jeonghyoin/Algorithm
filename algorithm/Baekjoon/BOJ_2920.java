package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2920 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[8];
		int tmp,  count = 0;
		
		for(int i=0; i<8; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();

		for(int i=0; i<7; i++) {
			for(int j=i; j<8; j++) {
				if(num[i] > num[j]) {
					tmp = num[i]; num[i] = num[j]; num[j] = tmp;
					count++;
				}
			}
		}
		
		if(count==0)
			System.out.println("ascending");
		else if(count==28)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}