package algorithm.Goorm.Lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 근묵자흑 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        String array[] = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int answer = 0, i = 0;
        while(i < N) {
            if(i == 0) {
                i = i + K;
            } else {
                i = i + K - 1;
            }
            answer++;
        }

        System.out.println(answer);
    }
}
