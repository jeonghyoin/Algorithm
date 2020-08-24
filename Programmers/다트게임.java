package algorithm.Programmers.Lv1;

import java.util.ArrayList;

public class 다트게임 {
    public static void main(String[] args) {
        String dartResult = "1D2S3T*";

        solution(dartResult);
    }

    static int solution(String dartResult) {
        int answer = 0;

        int j = -1;
        char dart[] = dartResult.toCharArray();
        ArrayList<Integer> score = new ArrayList<>();

        for(int i=0; i<dart.length; i++) {
            String digit= "";
            while(Character.isDigit(dart[i])) {
                digit = digit + dart[i];
                i++;
            }
            switch(dart[i]) {
                case 'S':
                    score.add((int) Math.pow(Integer.parseInt(digit), 1));
                    j++; break;
                case 'D' :
                    score.add((int) Math.pow(Integer.parseInt(digit), 2));
                    j++; break;
                case 'T' :
                    score.add((int) Math.pow(Integer.parseInt(digit), 3));
                    j++; break;
                case '*' :
                    score.set(j, score.get(j) * 2);
                    if(j > 0)
                        score.set(j - 1, score.get(j - 1) * 2);
                    break;
                case '#' :
                    score.set(j, score.get(j) * (-1));
                    break;
            }
        }

        for(int s : score)
            answer = answer + s;

        return answer;
    }
}

