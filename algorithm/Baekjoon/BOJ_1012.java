package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1012 {
    static int M; // 배열 가로 길이
    static int N; // 배열 세로 길이
    static int K; // 배추 개수
    static int vegetable[][]; // 배추밭
    // static boolean visited[][]; // 방문 여부
    static int result; // 지렁이 갯수

    // 네 방향으로 이등(상, 하, 좌, 우)
    static int x[] = {-1, 1, 0, 0};
    static int y[] = {0, 0, -1, 1};

    public static void dfs(int i, int j) {
        for(int k=0; k<4; k++) { // 상, 하, 좌, 우 탐색
            vegetable[i][j] = -1; // 방문한 곳 표시 (visited 배열 주석)
            int ix = i + x[k];
            int jy = j + y[k];

            if(ix >=0 && ix < M) { // 가로 범위 지정
                if(jy >= 0 && jy < N) { // 세로 범위 지정
                    if(vegetable[ix][jy] == 1 /* && !visited[ix][jy] */) {
                        dfs(ix, jy); // 연결 되어있는 배추밭 탐색
                    }
                    // System.out.println(ix + " " + jy);
                }
            }
        }
    }

    public static void earthworms(int[][] vegetable) {
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(vegetable[i][j] == 1 /* && !visited[i][j] */) {
                    // visited[i][j] = true; // 방문 여부 체크
                    result++; // 필요한 지렁이 갯수 증가
                    dfs(i, j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        for(int t=0; t<T; t++) {
            String input[] = br.readLine().split(" ");
            M = Integer.parseInt(input[0]); // 배추밭의 가로길이
            N = Integer.parseInt(input[1]); // 배추밭의 세로길이
            K = Integer.parseInt(input[2]); // 배추가 심어져 있는 위치의 개수

            // 초기화
            result = 0;
            vegetable = new int[M][N];
            // visited = new boolean[M][N];

            for(int i=0; i<K; i++) { // 배추 심기
                String XY[] = br.readLine().split(" ");
                int X = Integer.parseInt(XY[0]);
                int Y = Integer.parseInt(XY[1]);
                vegetable[X][Y] = 1;
            }

            // 필요한 흰 지렁이의 수
            earthworms(vegetable);
            System.out.println(result);
        }
    }
}