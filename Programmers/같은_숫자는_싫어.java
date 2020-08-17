package algorithm.Programmers.Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int arr[] = {4, 4, 4, 3, 3};

        solution(arr);
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        int prev = -1;
        for(int i=0; i< arr.length; i++) {
            if(prev != arr[i]) {
                arraylist.add(arr[i]);
                prev = arr[i];
            }
        }

        int[] answer = new int[arraylist.size()];
        for(int i=0; i<arraylist.size(); i++) {
            answer[i] = arraylist.get(i).intValue();
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
