package algorithm.Programmers.Lv2;

import java.util.*;

public class 소수찾기 {
    static HashSet<Integer> set;

    public static void main(String[] args) {
        String numbers = "17";

        // 정수 배열로 치환
        set = new HashSet<>();
        String[] temp = numbers.split("");
        int[] array = new int[temp.length];
        for(int i=0; i<temp.length; i++) {
            array[i] = Integer.parseInt(temp[i]);
        }

        // n개에서 순서를 고려하여 r개를 뽑아 나열하기 (순열)
        // nPr : 3P3, 3P2, 3P1 반복
        for(int i=1; i<=array.length; i++) {
            permutation(array, 0, i);
        }

        // 소수 찾기
        int i, num1, num2;
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            num1 = iter.next();
            num2 = num1;
            i = 2;
            if(num1 == 1 || num1 == 0) {
                iter.remove(); continue;
            }
            while(i < num2) {
                if(num1 % i == 0) {
                    iter.remove(); break;
                }
                i++;
            }
        }

        System.out.println("answer: " + set.size());
        // return set.size();
    }

    // swap을 통해 순열을 구하는 함수
    public static void permutation(int[] array, int depth, int r) {
        if(depth == r) {
            int result = 0;
            for(int i=0; i<r; i++) {
                result = Integer.parseInt(result +""+ array[i]);
            }
            set.add(result);

            return;
        }

        for(int i=depth; i<array.length; i++) {
            // swap
            int temp = array[depth];
            array[depth] = array[i];
            array[i] = temp;

            // 재귀적으로 호출
            permutation(array, depth + 1, r);

            // swap 전으로 돌아가기
            array[i] = array[depth];
            array[depth] = temp;
        }
    }
}
