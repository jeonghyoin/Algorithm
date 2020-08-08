package algorithm.Programmers.Lv1;

import java.util.Arrays;

public class 행렬의_덧셈 {
    public static void main(String[] args) {
        // Test case
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        solution(arr1, arr2);
    }

    static int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[1].length;
        int[][] answer = new int[row][col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        /* for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println(answer[i][j]);
            }
        } */

        // 2차원 배열 문자열로 출력하기
        // System.out.println(Arrays.deepToString(answer));

        return answer;
    }
}
