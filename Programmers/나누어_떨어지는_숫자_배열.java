package algorithm.Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 6};
        int divisor = 10;

        solution(arr, divisor);
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                temp.add(arr[i]);
            }
        }

        if(temp.size() == 0) {
            temp.add(-1);
        } else {
            Collections.sort(temp);
        }

        int answer[] = new int[temp.size()];
        for(int i=0; i<temp.size(); i++) {
            answer[i] = temp.get(i).intValue();
        }

        return answer;
    }
}
