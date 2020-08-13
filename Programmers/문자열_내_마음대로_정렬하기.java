package algorithm.Programmers.Lv1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        // Test case
        String strings[] = {"abce", "abcd", "cdx"};
        int n = 2;

        solution(strings, n);
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 같으면 사전순 정렬
                // o1이 o2보다 작으면 음수, 같으면 0, 크면 양수 반환
                if(o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                // 다르면 먼저 오는 순으로 정렬
                // 0, 음수이면 자리바꿈을 하지 않고, 양수이면(o1이 더 크면) 자리바꿈을 수행
                else
                    return o1.charAt(n) - o2.charAt(n);
            }
        });

        return strings;
    }
}
