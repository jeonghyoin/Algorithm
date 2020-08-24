package algorithm.Programmers.Lv2;

public class 일이사_나라의_숫자 {
    public static void main(String[] args) {
        int n = 18;

        solution(n);
    }

    public static String solution(int n) {
        String answer = "";

        int pattern[] = {4, 1, 2};
        int remainder;

        while(n > 0) {
            remainder = n % 3;
            answer = pattern[remainder] + answer;

            if(remainder == 0)
                n--;
            n = n / 3;
        }

        return answer;
    }
}
