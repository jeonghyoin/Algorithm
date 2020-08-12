package algorithm.Programmers.Lv1;

import java.util.Arrays;

public class 소수_찾기 {
    public static void main(String[] args) {
        int n = 10;

        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;

        // 소수 판별할 수를 나열
        boolean[] prime = new boolean[1000001];
        Arrays.fill(prime, true);
        // 0, 1은 소수 아님
        prime[0] = prime[1] = false;

        // 에라토스테네스의 체
        for(int i=2; i<=(int)Math.sqrt(n); i++) {
            if(prime[i]) {
                // sqrt(n)까지 배수를 지운다
                for(int j=i+i; j<=n; j+=i) {
                    prime[j] = false;
                }
            }
        }

        // 위 과정을 반복하는 동안 걸리지 않은 숫자는 소수
        for(int k=2; k<=n; k++) {
            if(prime[k])
                answer++;
        }

        return answer;
    }
}
