import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sec = 0, truck = 0, move = 0;

        for (int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }

        while (truck != truck_weights.length) {
            move -= queue.poll();

            if (truck != truck_weights.length && move + truck_weights[truck] <= weight) {
                queue.add(truck_weights[truck]);
                move += truck_weights[truck];
                truck++;
            } else {
                queue.add(0);
            }
            sec++;
        }

        return sec + bridge_length;
    }
}
// 소요 시간: 1H 45M 52S