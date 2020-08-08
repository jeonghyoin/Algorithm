package algorithm.Programmers.Lv1;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        // Test case
        long num = 626331;

        solution(num);
    }

    public static int solution(long num) {
        int answer = 0;

        while(num != 1) {
            if(answer >= 500){
                answer = -1;
                break;
            }

            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
        }

        return answer;
    }
}
