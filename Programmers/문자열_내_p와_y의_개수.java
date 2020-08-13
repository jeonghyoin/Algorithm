package algorithm.Programmers.Lv1;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";

        solution(s);
    }

    public static boolean solution(String s) {
        boolean answer = false;

        int pn = 0;
        int yn = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                pn++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                yn++;
        }

        if(pn == yn)
            answer = true;

        return answer;
    }
}
