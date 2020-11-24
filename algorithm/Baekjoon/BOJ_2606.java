package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2606 {
    static ArrayList<ArrayList<Integer>> adj;
    static ArrayList<Integer> result = new ArrayList<>();
    static boolean visit[];

    public static void dfs(int v) {
        visit[v] = true;
        result.add(v);

        for(int i : adj.get(v)) {
            if(!visit[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 컴퓨터의 수 (정점)
        int M = Integer.parseInt(br.readLine()); // 연결되어 있는 컴퓨터 쌍의 수 (간선의 수)

        visit = new boolean[N+1];
        adj = new ArrayList<>();
        for(int i=0; i<N+1; i++){ // 인접 리스트 속의 리스트 초기화
            adj.add(new ArrayList());
        }

        // 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍 (정점 연결)
        for(int i=0; i<M; i++) { // 간선 설정
            String[] in = br.readLine().split(" ");
            int t1 = Integer.parseInt(in[0]);
            int t2 = Integer.parseInt(in[1]);

            // 무방향 그래프의 경우 간선을 양쪽에서 지정해주어야 한다.
            adj.get(t1).add(t2);
            adj.get(t2).add(t1);
        }

        // System.out.println(adj.toString());

        // 1번 컴퓨터부터 시작
        dfs(1);

        System.out.println(result.size()-1);
    }
}
