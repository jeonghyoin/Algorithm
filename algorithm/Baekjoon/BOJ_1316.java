package algorithm.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
	
		boolean [] checker = new boolean[26];
		int groupCnt = 0;
		for(int i=0; i<N; i++) {
			String word = scan.next();
            
			int flag = 0;
			Arrays.fill(checker, false);
			
			for(int j=0; j<word.length()-1; j++) {
				int beforeAscii = word.charAt(j);
				int afterAscii = word.charAt(j+1);
				
				if(beforeAscii == afterAscii) { //같은 경우
					checker[afterAscii-97] = true; //둘 중 하나 after만 담는다.
				} else { //다른 경우
					//after가 이미 true(앞에 있던 수)인지 체크하고 이미 있던 알파벳이면 false로 바꾼다.
					if(checker[afterAscii-97] == true) {
						checker[afterAscii-97] = false;
						flag += 1;
					} else {
						checker[beforeAscii-97] = true;
						checker[afterAscii-97] = true;
					}
				}
			}
			if(flag == 0) {
				groupCnt++;
			}
		}
		scan.close();
		System.out.println(groupCnt);
	}
}
