package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split("");

        int isPalindrome = 1;
        int start = 0, end = array.length-1;
        for(int i=0; i<=Math.ceil(array.length/2); i++, start++, end--) {
            if(!array[start].equals(array[end])) {
                isPalindrome = 0; break;
            }
        }

        System.out.println(isPalindrome);
    }
}