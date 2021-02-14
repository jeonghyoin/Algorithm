package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1541 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split("-");

        for (int i=0; i<array.length; i++) {
            if (array[i].contains("+")) {
                int plus_sum = 0;
                String[] plus_array = array[i].split("\\+");
                for (String s : plus_array) {
                    plus_sum = plus_sum + Integer.parseInt(s);
                }
                array[i] = Integer.toString(plus_sum);
            }
        }

        int result = Integer.parseInt(array[0]);
        for(int i=1; i<array.length; i++) {
            result = result - Integer.parseInt(array[i]);
        }

        System.out.println(result);
    }
}