package algorithm.Programmers;

public class 예산 {
    public static void main(String[] args) {
        //test case
        int d[] = {2,2,3,3};
        int budget = 10;

        int answer = solution(d, budget);
        System.out.println(answer);
    }

    static int solution(int[] d, int budget) {
        int answer = 0;
        int size = d.length;

        //정렬
        int temp;
        for(int i=0; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                if(d[i] > d[j]) {
                    temp = d[i]; d[i] = d[j]; d[j] = temp;
                }
            }
        }
        //예산 나눠주기
        for(int i=0; i<size;i++) {
            if(budget - d[i] >= 0) {
                budget = budget - d[i];
                answer++;
            }
            if(budget < 0) break;
        }

        return answer;
    }
}
