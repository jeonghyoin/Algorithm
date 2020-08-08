package algorithm.Programmers.Lv1;

public class 하샤드_수 {
    public static void main(String[] args) {
        // Test case
        int arr = 12;

        solution(arr);
    }

    public static boolean solution(int x) {
        boolean answer = true;

        // 각 자리수 더하기
        int sum = 0, tmp = x;
        while(tmp > 0) {
            sum = sum + (tmp % 10);
            tmp = tmp / 10;
        }

        if(x % sum == 0)
            answer = true;
        else
            answer = false;

        return answer;
    }
}
