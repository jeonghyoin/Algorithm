package algorithm.Programmers.Lv1;

import java.util.Arrays;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        // Test case
        String seoul[] = {"Jane", "Kim"};

        solution(seoul);
    }

    public static String solution(String[] seoul) {
        String answer = "";

        // Kim의 위치 찾기
        int index = 0;
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        answer = "김서방은 " + index + "에 있다";

        return answer;
    }
}
