package algorithm.Programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class 기능개발 {
    public static void main(String[] args) {
        // 작업의 진도(먼저 배포되어야 하는 순서)
        int progresses[] = {20, 99, 93, 30, 55, 10};
        // 각 작업의 개발 속도
        int speeds[] = {5, 10, 1, 1, 30, 5};

        solution(progresses, speeds);

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        for(int i=0; i<progresses.length; i++) {
            progresses[i] = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        }

        boolean flag = false;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<progresses.length; i++) {
            int num = 0;
            for(int j=i; j<progresses.length; j++) {
                if(j == progresses.length - 1)
                    flag = true;
                if(progresses[i] >= progresses[j]) {
                    num++;
                } else if(progresses[i] < progresses[j]) {
                    i = j - 1; break;
                }
            }
            al.add(num);
            if(flag) break;
        }

        int[] answer = new int[al.size()];
        for(int k=0; k<al.size(); k++)
            answer[k] = al.get(k);

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
