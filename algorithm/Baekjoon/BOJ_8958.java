package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int result[] = new int[num];
		for(int i=0; i<num; i++) {
			int count = 0, sum = 0;
			String score = scan.next();
			for(int j=0; j<score.length(); j++) {
				if(score.charAt(j) == 'X') {
					count = 0;
				} else count++;
				sum = sum + count;
			}
			result[i] = sum;
		}
		scan.close();
        
		for(int i=0; i<num; i++) {
			System.out.println(result[i]);
		}
	}
}