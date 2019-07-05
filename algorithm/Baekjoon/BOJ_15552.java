package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15552 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int readNum = Integer.parseInt(br.readLine());
			for(int i=1; i<=readNum; i++) {
				String[] resArr = br.readLine().split(" ");
                bw.write(Integer.parseInt(resArr[0]) + Integer.parseInt(resArr[1]) + "\n");
			}
			bw.flush();//남아있는 데이터를 모두 출력시킴
			bw.close();//스트림을 닫음
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}