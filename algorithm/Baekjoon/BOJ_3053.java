package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_3053 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		double R = Integer.parseInt(rd.readLine());
		/* 
		 * 정사각형 대각선의 길이 = 2R이라고 했을 때, 피타고라스의 정리에 의해 2R^2 = 1a^2 + 1a^2가 된다.
		 * (a는 정사각형 한 변의 길이)
		 * 이를 정리하면 2R^2 = 2a^2이다.
		 * 택시 기하학에서의 원은 정사각형이다. 정사각형의 넓이는 가로*세로임.
		 * 
		 * 따라서 2R*2가 택시 기하학에서의 원의 넓이에 해당한다.
		 */
		
		System.out.println(String.format("%6f", Math.PI*(R*R)));
		System.out.println(String.format("%6f", 2*R*R));
	}
}