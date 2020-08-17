package algorithm.Programmers.Lv1;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        int a = -3, b = 3;

        solution(a, b);
    }

    public static long solution(int a, int b) {
        long answer = 0;

        int tmp;
        if(a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for(int i=a; i<=b; i++) {
            answer = answer + i;
        }

        return answer;
    }
}
