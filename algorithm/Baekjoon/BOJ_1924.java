package algorithm.Baekjoon;
import java.util.Scanner;

public class BOJ_1924 {
	public static void main(String[] args) {	
		//2007년
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		
		int totalDate = 0;
		
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		//총 날짜를 구한
		for(int i=0; i<x; i++) {
			totalDate = totalDate + month[i];
		}
		totalDate = totalDate + y;
		//7로 나누어 요일을 구한다 -> 그 나머지를 index로 해서 출력
		int resIndex = totalDate % 7;
		System.out.println(week[resIndex]);
	} 
}