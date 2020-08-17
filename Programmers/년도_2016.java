package algorithm.Programmers.Lv1;

public class 년도_2016 {
    public static void main(String[] args) {
        // 2016년 월, 일 (윤년)
        int a = 5, b = 24;

        solution(a, b);
    }

    public static String solution(int a, int b) {
        String answer = "";

        String weekArr[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int monthArr[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // month 계산
        int month = 0;
        for(int i=0; i<a - 1; i++) {
            System.out.println(i+1 + "월");
            month = month + (monthArr[i] % 7);
        }
        // day 계산
        int day = (b - 1) % 7;

        // 합계
        int sum = month + day;
        while(sum >= 7) {
            sum = sum % 7;
        }

        // 금요일(5) 부터 시작
        answer = weekArr[(5 + sum) % 7];

        return answer;
    }
}
