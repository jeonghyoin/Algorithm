package algorithm.Programmers.Lv1;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        int n = 4;

        solution(n);
    }

    public static String solution(int n) {
        String answer = "";

        for(int i=0; i<n; i++) {
            if(i % 2 ==0) {
                answer = answer + "수";
            } else {
                answer = answer + "박";
            }
        }

        return answer;
    }
}
