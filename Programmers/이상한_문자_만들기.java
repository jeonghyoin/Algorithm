package algorithm.Programmers.Lv1;

import java.util.Arrays;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        // Test case
        String s = "try hello world";

        solution(s);
    }

    public static String solution(String s) {
        String answer = "";
        String st[] = s.split("");

        int count = 0;
        boolean space = false;
        for(int i=0; i<st.length; i++) {
            // 공백으로 단어를 분리해야 하므로, 공백을 만나면 count를 0으로 초기화
            if(st[i].equals(" ")) {
                count = 0;
            } else if (count % 2 == 0) {
                // 소문자 -> 대문자 (-32)
                st[i] = st[i].toUpperCase();
                count++;
            } else {
                // 대문자 -> 소문자 (+32)
                st[i] = st[i].toLowerCase();
                count++;
            }
            answer = answer + st[i];
        }

        return answer;
    }
}
