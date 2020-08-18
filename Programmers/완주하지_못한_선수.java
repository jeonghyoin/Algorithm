package algorithm.Programmers.Lv1;

import java.util.Arrays;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        String participant[] = {"leo", "kiki", "eden"};
        String completion[] = {"eden", "kiki"};

        solution(participant, completion);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        // 효율성을 위해 배열을 정렬시키고 시작
        // ArrayList의 remove를 사용하면 O(n^2)가 되므로 효율성 통과 불가능
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        answer = participant[i];

        return answer;
    }
}