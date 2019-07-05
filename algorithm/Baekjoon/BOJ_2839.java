package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_2839 {
	public static void main(String[] args) {
		//6. 설탕 배달
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		scan.close();
		
		//아무것도 넣을 수 없을 경우 -1을 출력하기 위해서
		int num5 = 0;
		int num3 = 0;
		int res = 0;
	    
	    //5로 나누어 떨어질 때
	    if(N % 5 == 0) {
	        num5 = N / 5;
	        System.out.println(num5);
	    }
	    //5로 나누어 떨어지지 않을 때
	    //5kg이 최대로 들어갈 수 있는 갯수부터 줄여가면서 3kg를 넣는다
	    else {
	        for(int i = N/5; i>=0; i--) {
	            if((N - (5 * i)) % 3 == 0) {
	                num5 = i;
	                num3 = (N - (5 * i)) / 3;
	                break;
	            }
	        }
	        res = num5 + num3;
	        if(res > 0)
	        	System.out.println(res);
	        else
	        	System.out.println(-1);
	    }
	}
}
