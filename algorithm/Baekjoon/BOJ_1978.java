package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1978 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());
		String[] input = rd.readLine().split(" ");
		rd.close();
		int cnt, cnt2 = 0, tmp;
		
		for(int n=0; n<N; n++) {
			tmp = Integer.parseInt(input[n]);
			cnt = 0;
			for(int i=1; i<=tmp; i++) {
				if(tmp%i==0) cnt++;
				if(cnt>2) break;
			}
			if(cnt==2) cnt2++;
		}
		System.out.println(cnt2);
	}
}