package algorithm.SWEA;

import java.util.*;

class SWEA_1945_간단한소인수분해 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] array = {2, 3, 5, 7, 11};
		
		for (int i = 1; i <= T; i++) {
			int n = sc.nextInt();
			int index = 0;
			int[] count = new int[5];
			
			while(true) {
				if (n <= 1 || index >= 5) break;
				
				if(n % array[index] == 0) {
					count[index]++;
					n = n / array[index];
				} else {
					index++;
				}
			}
			
			String result = "#" + i + " ";
				for(int j = 0; j < 5; j++) {
					result = result + count[j] + " ";
				}
			System.out.println(result);
		}
	}
}