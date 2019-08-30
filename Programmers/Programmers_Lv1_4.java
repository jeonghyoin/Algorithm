package algorithm.Programmers;

public class Programmers_Lv1_4 {
    public static void main(String[] args) {
        String s = "abcde"; //qwerty

        int size = s.length();
        int mid = s.length() / 2;

        if(size % 2 != 0) {
            System.out.println(s.charAt(mid));
        } else {
            System.out.println(s.charAt(mid-2)+""+s.charAt(mid-1));
        }
    }
}