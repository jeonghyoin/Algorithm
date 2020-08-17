package algorithm.Programmers.Lv1;

public class 키패드_누르기 {
    public static void main(String[] args) {
        int numbers[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        solution(numbers, hand);
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10, right = 12; // 현재 사용중인 손의 위치
        int LDis, RDis; // 거리 차이

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {  // 1, 4, 7 (왼손)
                answer = answer + "L";
                left = numbers[i];
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { // 3, 6, 9 (오른손)
                answer = answer + "R";
                right = numbers[i];
            } else { // 2, 5, 8, 0
                // 0은 11로 두고 구함
                if(numbers[i] == 0)  numbers[i] = 11;

                // 좌표간 차이
                LDis = getLocation(numbers[i], left);
                RDis = getLocation(numbers[i], right);

                if(LDis < RDis) {
                    answer = answer + "L";
                    left = numbers[i];
                } else if(LDis > RDis) {
                    answer = answer + "R";
                    right = numbers[i];
                } else {
                    if(hand.equals("left")) {
                        answer = answer + "L";
                        left = numbers[i];
                    } else {
                        answer = answer + "R";
                        right = numbers[i];
                    }
                }
            }
        }

        return answer;
    }

    // 좌표 구하기
    // x = (위치 - 1) / 3, y = (위치 - 1) % 3
    static int getLocation(int number, int hand) {
        int nlocationX, nlocationY;
        int hlocationX, hlocationY;

        // 입력받은 수의 좌표
        nlocationX = (number - 1) / 3;
        nlocationY = (number - 1) % 3;

        // 현재 위치한 손의 좌표
        hlocationX = (hand - 1) / 3;
        hlocationY = (hand - 1) % 3;

        // 좌표의 차이를 리턴
        return Math.abs(nlocationX - hlocationX) + Math.abs(nlocationY - hlocationY);
    }
}