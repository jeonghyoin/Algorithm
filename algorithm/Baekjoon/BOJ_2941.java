package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2941 {
	public static void main(String[] args) {
		String array[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		for(int i=0; i<array.length; i++) {
			str = str.replace(array[i], "*");
		}
		
		System.out.println(str.length());
	}
}