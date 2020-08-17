package algorithm.Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class k번째수 {
    public static void main(String[] args) {
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때 k번째에 있는 수
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int row = commands.length;
        int[] answer = new int[row];

        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i<row; i++) {
            int index = commands[i][0] - 1;
            int cnt = commands[i][1] - commands[i][0];

            while(cnt >= 0) {
                arrList.add(array[index]);
                index++; cnt--;
            }

            // 정렬
            Collections.sort(arrList);
            // 추출
            answer[i] = arrList.get(commands[i][2] - 1);
            // 초기화
            arrList.clear();
        }

        return answer;
    }
}
