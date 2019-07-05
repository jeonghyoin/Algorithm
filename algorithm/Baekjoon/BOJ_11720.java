package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_11720 {
	public static void main(String[] args) {
		//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		//숫자 갯수
		int N = scan.nextInt();
		//더할 숫자
		String plusNum = scan.next();
		scan.close();
		//더한 결과
		int res = 0;
		
		if(N == 1) {
			System.out.println(plusNum);
		}
		else {
			String[] number = plusNum.split("");
			for(int i=0; i<number.length; i++) {
				res = res + Integer.parseInt(number[i]);
			}
			System.out.println(res);
		}
	} 
}