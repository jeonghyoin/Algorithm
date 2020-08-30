package algorithm.Programmers.Lv2;

import java.util.PriorityQueue;

class Printer implements Comparable<Printer> {
    int priority;

    public Printer(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(Printer p) {
        if(this.priority > p.getPriority())
            return -1;
        else if(this.priority < p.getPriority())
            return 1;
        else
            return 0;
    }
}

public class 프린터 {
    public static void main(String[] args) {
        // 문서의 중요도
        int priorities[] = {1, 1, 9, 1, 1, 1};
        // 문서 대기목록 위치
        int location = 0;
        // 인쇄를 요청한 문서가 몇 번째로 인쇄되는지
        solution(priorities, location);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Printer> pq = new PriorityQueue<>();
        for(int i=0; i<priorities.length; i++) {
            pq.offer(new Printer(priorities[i]));
        }

        while(!pq.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                Printer p = pq.peek();
                if(priorities[i] == p.getPriority()) {
                    if(i == location) {
                        System.out.println(answer);
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}
