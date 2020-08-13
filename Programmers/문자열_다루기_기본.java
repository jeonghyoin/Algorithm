package algorithm.Programmers.Lv1;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        String s = "123h";

        solution(s);
    }

    public static boolean solution(String s) {
        boolean answer = false;

        if(s.length() == 4 || s.length() == 6)
            answer = true;

        if(answer) {
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
