package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_4153 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<Integer>();
		int a, b, c;
		
		while(true) {
			String[] input = rd.readLine().split(" ");
			list.add(Integer.parseInt(input[0]));
			list.add(Integer.parseInt(input[1]));
			list.add(Integer.parseInt(input[2]));
			
			if(list.get(0) == 0)
				break;
			
			Collections.sort(list);
			a = list.get(0);
			b = list.get(1);
			c = list.get(2);
			
			//직각삼각형 확인 - c = √a^2+b^2
			int sum = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
			int res = (int)Math.sqrt(sum);
			
			if(c == res) System.out.println("right");
			else System.out.println("wrong");
			
			list.clear();
		}
	}
}