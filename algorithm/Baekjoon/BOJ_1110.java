package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		scan.close();
        
		int cnt = 0;
		String[] plusNum;
		String first = null;
        
        //처음 생성 수(first) 만들기
		if(Integer.valueOf(N) < 10) {
			N = "0" + N;
		}
		String[] num = N.split("");
		String plusVal = String.valueOf(Integer.valueOf(num[0]) + Integer.valueOf(num[1]));
		if(Integer.valueOf(plusVal) < 10) {
			plusVal = "0" + plusVal;
		}
		plusNum = plusVal.split("");
		N = num[1] + plusNum[1];
		first = N;
		cnt++;
        
        //first와 같아질 때 까지 cnt++하면서 계속 반복문 돌리기
		while(true) {
			num = N.split("");
			plusVal = String.valueOf(Integer.valueOf(num[0]) + Integer.valueOf(num[1]));
			if(Integer.valueOf(plusVal) < 10) {
				plusVal = "0" + plusVal;
			}
			plusNum = plusVal.split("");
			N = num[1] + plusNum[1];
			//first와 다를 경우 계속 반복문
            if(!first.equals(N)) {
				cnt++;
			}
            //같을 경우에는 반복문 벗어나기
			else {
				break;
			}
		}
		System.out.println(cnt);
	}
}