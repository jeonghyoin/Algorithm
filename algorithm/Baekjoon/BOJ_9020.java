package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_9020 {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(rd.readLine());
		
		boolean[] arr = new boolean[5082];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;
		//소수
		for(int i=2; i<=72; i++) {
			for(int j=i+i; j<=5081; j+=i) {
				arr[j] = false;
			}
		}
		//골드바흐 파티션
		for(int t=0; t<T; t++) {
			int n = Integer.parseInt(rd.readLine());
			int left = n/2, right = n/2;
			
			while(true) {
				if(arr[left] && arr[right])
					break;
				left--; right++;
			}
			System.out.println(left+" "+right);
		}
	}
}