package algorithm.Baekjoon;
import java.util.*;

public class BOJ_2448 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        
        int K = (int) (Math.log(N / 3) / Math.log(2));
        String[] star = new String[N];
 
        star[0] = "  *  ";
        star[1] = " * * ";
        star[2] = "*****";
 
        int copy = 3;
 
        for (int  i = 1; i <= K; i++) {
            for (int j = 0; j < copy; j++) {
                star[copy + j] = star[j] + " " + star[j];
                for (int k = 0; k < copy / 3; k++) {
                    star[j] = "   " + star[j] + "   ";
                }
            }
            copy *= 2;
        }
 
        for(int i=0; i<copy; i++) {
            System.out.println(star[i]);
        }
    }
}