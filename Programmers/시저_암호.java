package algorithm.Programmers.Lv1;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Arrays;

public class 시저_암호 {
    public static void main(String[] args) {
        String s = "Z";
        int n = 25;

        solution(s, n);
    }

    public static String solution(String s, int n) {
        String answer = "";

        int tmp = 0;
        char[] ch = s.toCharArray();

        // % 26으로 풀 수 있음
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == 32) continue; // 공백인 경우
            if(Character.isLowerCase(ch[i])) { // 소문자인 경우
                tmp = ch[i] + n;
                if(tmp > 122)
                    tmp = tmp - 26;
            } else if(Character.isUpperCase(ch[i])) { // 대문자인 경우
                tmp = ch[i] + n;
                if(tmp > 90)
                    tmp = tmp - 26;
            }
            ch[i] = (char) tmp;
        }

        answer = String.valueOf(ch);

        return answer;
    }
}
