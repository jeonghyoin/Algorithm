package algorithm.Programmers.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        // Test case
        long n = 118372;

        solution(n);
    }

    public static long solution(long n) {
        long answer = 0;

        // 문자열 배열로 나누기
        String[] sarr = Long.toString(n).split("");

        // 내림차순으로 정렬하기
        // way 1
        Arrays.sort(sarr, Collections.reverseOrder());

        // way 2
        // Arrays.sort(sarr);
        // Collections.reverse(Arrays.asList(sarr));

        // way 3
        /* Arrays.sort(sarr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        }); */

        // 문자열로 합치기
        answer = Long.parseLong(String.join("", sarr));

        return answer;
    }
}
