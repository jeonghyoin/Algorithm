package algorithm.Programmers.Lv1;

import java.util.Arrays;
import java.util.Collections;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        // Test case
        long n = 12345;

        solution(n);
    }

    public static int[] solution(long n) {
        int len = Long.toString(n).length();
        int[] answer = new int[len];

        int index = 0;
        while(n > 0) {
            // 괄호 필수
            answer[index] = (int)(n % 10);
            n = n / 10;

            index++;
        }

        return answer;
    }
}
