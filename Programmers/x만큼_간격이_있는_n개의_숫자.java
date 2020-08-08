package algorithm.Programmers.Lv1;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        // Test case
        int x = -4, n = 2;

        solution(x, n);
    }

    static void solution(int x, int n) {
        long[] answer = new long[n];

        long sum = 0;
        for(int i=0; i<n; i++) {
            sum += x;
            answer[i] = sum;
        }

        for(long i: answer)
            System.out.print(i+" ");
    }
}