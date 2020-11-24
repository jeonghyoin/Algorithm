package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260 {
    static ArrayList<ArrayList<Integer>> ad;
    static boolean[] visit;

    public static void dfs(int v) {
        visit[v] = true;
        System.out.print(v+ " ");

        // 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
        Collections.sort(ad.get(v));
        for(int i : ad.get(v)) {
            if(!visit[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>(); // 방문 경로
        HashMap<Integer, Boolean> map = new HashMap<>(); // Queue 중복 데이터 방지

        queue.offer(v); // 큐에 노드 삽입

        while(!queue.isEmpty()) { // 큐가 빌 때 까지 반복
            int first = queue.poll();
            visit[first] = true; // 방문 표시

            System.out.print(first + " ");

            Collections.sort(ad.get(first));
            for(int j : ad.get(first)) {
                if(!visit[j] && !map.containsKey(j)) {
                    queue.offer(j);
                    map.put(j, true);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 정점의 갯수 (Node)
        int M = Integer.parseInt(input[1]); // 간선의 갯수 (Edge)
        int V = Integer.parseInt(input[2]); // 탐색을 시작할 정점

        ad = new ArrayList(V+1);
        visit = new boolean[N+1];

        for(int i=0; i<N+1; i++){ // 인접 리스트 속의 리스트 초기화
            ad.add(new ArrayList());
        }

        for(int i=0; i<M; i++) { // 간선 설정
            String[] in = br.readLine().split(" ");
            int t1 = Integer.parseInt(in[0]);
            int t2 = Integer.parseInt(in[1]);

            // 무방향 그래프의 경우 간선을 양쪽에서 지정해주어야 한다.
            ad.get(t1).add(t2);
            ad.get(t2).add(t1);
        }

        dfs(V);
        System.out.println();
        Arrays.fill(visit, false); // 초기화
        bfs(V);
    }
}
