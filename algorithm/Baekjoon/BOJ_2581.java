package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2581 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(rd.readLine());
		int N = Integer.parseInt(rd.readLine());
		rd.close();

        ArrayList<Integer> sosu = new ArrayList<Integer>();
        int cnt, sum=0;
        
        for(int i=M; i<=N; i++) {
        	cnt = 0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) cnt++;
        		if(cnt>2) break;
        	}
        	if(cnt==2) sosu.add(i);
        }
        
        int size = sosu.size();
        if(size > 0) {
	        for(int i=0; i<size; i++) 
	            sum += sosu.get(i);
	        System.out.println(sum);
	        System.out.println(sosu.get(0));
        } else
        	System.out.println("-1");
	}
}