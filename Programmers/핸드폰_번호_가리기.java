package algorithm.Programmers.Lv1;

import java.util.Collections;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        // Test case
        String phone_number = "01033334444";

        solution(phone_number);
    }

    static String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length() - 4;

        // 문자열 자르기
        String sub_phone_number = phone_number.substring(0, length);

        // 대치할 문자 만들기
        String asterisk = "*";
        asterisk = String.join("", Collections.nCopies(sub_phone_number.length(), asterisk));

        // 문자열 바꾸기
        answer = phone_number.replace(sub_phone_number, asterisk);

        return answer;
    }
}
