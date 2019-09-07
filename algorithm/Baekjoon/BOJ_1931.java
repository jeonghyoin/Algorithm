package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1931 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            time[i][0] = Integer.parseInt(input[0]);
            time[i][1] = Integer.parseInt(input[1]);
        }

        //끝나는 시간 순 정렬
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //0: 시작 시간, 1: 종료 시간
                //끝시간이 같을 경우 시작 시간 정렬
                if(o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                //종료 시간 정렬
                return Integer.compare(o1[1], o2[1]);
            }
        });

        //회의 배정하기
        int cnt = 0, end = -1;
        for(int i=0; i<N; i++) {
            if(time[i][0] >= end) {
                end = time[i][1];
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
