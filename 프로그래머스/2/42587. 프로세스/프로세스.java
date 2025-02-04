import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int cnt = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            priorityQueue.add(priority);
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[1] == priorityQueue.peek()) {
                priorityQueue.poll();
                cnt++;
                
                if (current[0] == location) {
                    return cnt;
                }
            } else {
                queue.add(current);
            }
        }
        
        return cnt;
    }
}
// 소요 시간: 20M 40S