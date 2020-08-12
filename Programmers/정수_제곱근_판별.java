package algorithm.Programmers.Lv1;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        long n = 121;

        solution(n);
    }

    public static long solution(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n);

        // 실수, 정수 판별(%1)
        if(sqrt % 1 == 0)
            answer = (long) Math.pow(sqrt+1, 2);
        else
            answer = -1;

        return answer;
    }
}
