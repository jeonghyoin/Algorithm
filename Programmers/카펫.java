package algorithm.Programmers.Lv2;

public class 카펫 {
    public static void main(String[] args) {
        int brown = 10, yellow = 2;
        int[] answer = new int[2];

        int sum = brown + yellow;
        int center = (int)Math.sqrt(sum);

        // 최소 갯수가 9이므로 3부터 반복 시작
        for(int i=3; i<=center; i++) {
            // 총 합의 약수를 모두 탐색
            if(sum % i == 0) {
                int col = sum / i;
                // 가장 위, 아래 / 왼쪽, 오른쪽을 빼고 곱해주면 가운데 yellow가 나옴
                if((col - 2) * (i - 2) == yellow) {
                    answer[0] = col;
                    answer[1] = i;
                    break;
                }
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}
// 테스트 케이스 4, 5, 6,, 7, 9, 10 실패
/*
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        double center = Math.sqrt(sum);
        int row = (int)center;
        int col = (int)Math.ceil(center);

        while(true) {
            if(row * col == sum) break;
            col++;
        }

        answer[0] = col;
        answer[1] = row;

        return answer;
    }
}
 */