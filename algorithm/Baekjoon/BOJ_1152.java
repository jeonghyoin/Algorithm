package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String word[] = str.split(" ");
		int cnt = 0;
		for(int i=0; i<word.length; i++) {
			if(!word[i].equals("")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}