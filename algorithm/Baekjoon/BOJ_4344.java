package algorithm.Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_4344 {
	public static void main(String[] args) {
        List<Float> per = new ArrayList<Float>();
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		scan.close();
		
		for(int i=0; i<C; i++) {
			int N = scan.nextInt();
			int sum = 0, cnt = 0;
			float avg = 0;
			int[] score = new int[N];
			
			for(int j=0; j<N; j++) {
				score[j] = scan.nextInt();
				sum = sum + score[j];
			}
			avg = (float) sum / N;
			for(int k=0; k<N; k++) {
				if(score[k] > avg) {
					cnt++;
				}
			}
			float result = ((float)cnt/N)*100;
			per.add(result);
		}
		
		for(int i=0; i<per.size(); i++) {
			System.out.println(String.format("%.3f", per.get(i)) + "%");
		}
	}
}