import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int line = move - 1, cnt = 0;

            while (cnt != board.length) {
                if (!stack.isEmpty() && stack.peek().equals(board[cnt][line])) {
                    stack.pop();
                    answer++;
                    board[cnt][line] = 0;
                    break;
                } else if (board[cnt][line] != 0) {
                    stack.push(board[cnt][line]);
                    board[cnt][line] = 0;
                    break;
                }
                cnt++;
            }
        }

        return answer * 2;
    }
}