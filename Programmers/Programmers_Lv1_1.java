package algorithm.Programmers;

import java.util.Arrays;

public class Programmers_Lv1_1 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";

        int size = s.length();
        char arr[] = new char[size];

        char temp;
        for(int i=0; i<size; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);

        for(int i=size-1; i>=0; i--) {
            answer = answer + arr[i];
        }
        System.out.println(answer);
    }
}
