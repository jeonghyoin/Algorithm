package algorithm.Programmers;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        //test case
        String s = "abcde";

        int size = s.length();
        int mid = s.length() / 2;

        if(size % 2 != 0) {
            System.out.println(s.charAt(mid));
        } else {
            System.out.println(s.charAt(mid-2)+""+s.charAt(mid-1));
        }
    }
}