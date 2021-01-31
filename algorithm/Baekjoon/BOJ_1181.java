package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 중복 제거 : Set 자료구조 사용
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // 1. 길이가 짧은 것부터
        // 2. 길이가 같으면 사전 순으로
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 길이순 정렬 (긴 순으로 정렬하고 싶을 경우 *1)
                int len = o1.length() - o2.length();
                if(len == 0) { // 길이가 같은 경우 사전순 정렬
                    return o1.compareTo(o2); // 문자열 정렬: compareTo()
                } else {
                    return len;
                }
            }
        });

        for(String s : list) {
            System.out.println(s);
        }
    }
}
