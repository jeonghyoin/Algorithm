package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		//m:분모, n:분자
		int m = 0, n = 0, count = 0;
		boolean flag = false;
        for (int i=1; i<N; i++) {
            for (int j=0; j<i; j++) {
                if (i % 2 != 0) { //홀수
                    m = i - j;
                    n = j + 1;
                }else { //짝수
                    m = j + 1;
                    n = i - j;
                }
                count++;
                if (count == N) {
                    System.out.print(m+"/"+n);
                    flag = true;
                    break;
                }
            }
            if(flag)
            	break;
        }
	}
}