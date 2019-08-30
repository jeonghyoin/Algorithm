package algorithm.Programmers;

import java.util.Arrays;

public class Programmers_Lv1_2 {
    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int answer = 0;

        //1부터 시작
        int student[] = new int[n+1];
        Arrays.fill(student, 1);

        //체육복 잃어버린 학생
        for(int i=0; i<lost.length; i++) {
            int index = lost[i];
            student[index]--;
        }
        //여분 체육복을 가지고 있는 학생
        for(int i=0; i<reserve.length; i++) {
            int index = reserve[i];
            student[index]++;
        }
        //체육복 빌려주기
        for(int i=1; i<=n; i++) {
            if(student[i] == 0) {
                if(i < n && student[i+1] > 1) {
                    student[i+1]--; student[i]++;
                } else if(i > 1 && student[i-1] > 1) {
                    student[i-1]--; student[i]++;
                }
            }
        }
        //최대 학생 수
        for(int i=1; i<=n; i++) {
            if(student[i] > 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
