package algorithm.Programmers.Lv1;

import java.util.ArrayList;

public class 모의고사 {
    public static void main(String[] args) {
        int answers[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        solution(answers);
    }

    public static int[] solution(int[] answers) {
        int one[] = {1, 2, 3, 4, 5};
        int two[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int three[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int oneCnt = 0, twoCnt = 0, threeCnt = 0;

        for(int i=0; i<answers.length; i++) {
            if(one[i % 5] == answers[i])
                oneCnt++;
            if(two[i % 8] == answers[i])
                twoCnt++;
            if(three[i % 10] == answers[i])
                threeCnt++;
        }

        int max = Math.max(oneCnt, Math.max(twoCnt, threeCnt));
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(oneCnt == max)
            arrayList.add(1);
        if(twoCnt == max)
            arrayList.add(2);
        if(threeCnt == max)
            arrayList.add(3);

        int[] answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i).intValue();
        }

        return answer;
    }
}
