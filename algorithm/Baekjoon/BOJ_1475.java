package algorithm.Baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		scan.close();
		
		//문자열 길이
		int nLen = N.length();
		int[] setArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int res=0;
		
		//charAt index는 0부터 시작
		for(int i=0; i<nLen; i++) {
			int num = N.charAt(i) - 48;
			
			if(num==6 || num==9) {
				res++;
			}
			setArr[num]++;
		}
		
		if(res > 1) {
			res = (int) Math.ceil((double)res/2);
			setArr[6] = setArr[9] = res;
		}
		
		//최대값 출력
		Arrays.sort(setArr);
		System.out.println(setArr[setArr.length-1]);
	}
}