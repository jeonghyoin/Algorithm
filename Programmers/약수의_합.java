package algorithm.Programmers.Lv1;

public class 약수의_합 {
    public static void main(String[] args) {
        // Test case
        int n = 12;

        solution(n);
    }

    // n의 약수를 모두 더한 값을 리턴
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(n % i == 0)
                answer = answer + i;
        }

        return answer;
    }
}
