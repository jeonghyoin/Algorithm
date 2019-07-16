package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1085 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(x);
        list.add(y);
        list.add(w - x);
        list.add(h - y);
        
        Collections.sort(list);
        System.out.println(list.get(0));
	}
}