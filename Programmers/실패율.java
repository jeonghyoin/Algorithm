package algorithm.Programmers.Lv1;

import java.util.Arrays;

public class 실패율 {
    public static void main(String[] args) {
        // Test case
        int N = 5; // 500 이상
        int stages[] = {2, 1, 2, 6, 2, 4, 3, 3}; // 200000 이상

        solution(N, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] index = new int[500+2]; // 0 ~ 501

        // 실패율을 계산할 실수형 배열
        double[] arr = new double[N];
        Arrays.fill(arr, 0);

        // 배열 요소 카운트
        int stagesLen = stages.length;
        for(int i=0; i<stagesLen; i++) {
            index[stages[i]]++;
        }

        // 실패율 계산
        double fail = 0;
        for(int i=0; i<N; i++) {
            if(stagesLen == 0) break; // NaN

            fail = (double)index[i+1] / stagesLen;
            arr[i] = fail;

            // 사용자 수 감소
            stagesLen = stagesLen - index[i+1];
        }

        // 실패율의 내림차순 정렬
        // 실패율이 같으면 작은 번호(index)의 스테이지가 먼저 옴
        int maxIndex = 0, answerIndex = 0;
        while(answerIndex < N) {
            for (int i = 0; i < N; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            answer[answerIndex] = maxIndex + 1;
            arr[maxIndex] = -1;
            answerIndex++;
        }

        System.out.println("answer : " + Arrays.toString(answer));

        return answer;
    }

}
