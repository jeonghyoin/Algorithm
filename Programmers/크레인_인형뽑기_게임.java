package algorithm.Programmers.Lv1;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        // 게임 화면의 격자의 상태
        int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        // 크레인을 작동시킨 위치
        int moves[] = {1,5,3,5,1,2,1,4};

        solution(board, moves);
    }

    static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int index, target;
        for(int i=0; i<moves.length; i++) {
            index = 0;
            while(index < board.length) {
                target = board[index][moves[i]-1];
                if(target != 0) {
                    if(stack.peek() == target) {
                        stack.pop();
                        answer++;
                    } else {
                        stack.push(target);
                    }
                    board[index][moves[i]-1] = 0;
                    break;
                }
                index++;
            }
        }

        return answer * 2;
    }
}
