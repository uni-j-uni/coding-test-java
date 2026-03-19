import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for (String key : keyinput) {
            if (key.equals("left") && Math.abs(answer[0] - 1) < board[0] / 2 + 1) {
                answer[0] -= 1;
            } else if (key.equals("right") && answer[0] + 1 < board[0] / 2 + 1) {
                answer[0] += 1;
            } else if (key.equals("down") && Math.abs(answer[1] - 1) < board[1] / 2 + 1) {
                answer[1] -= 1;
            } else if (key.equals("up") && answer[1] + 1 < board[1] / 2 + 1) {
                answer[1] += 1;
            }
        }
        
        return answer;
    }
}