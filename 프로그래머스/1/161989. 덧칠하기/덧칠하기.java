import java.util.Stack;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int num : section) {
            stack.push(num);
        }
        
        while(!stack.isEmpty()) {
            for (int i = stack.peek(); stack.peek() > i - m; ) {
                stack.pop();
                if (stack.isEmpty()) break;
            }
            answer++;
        }
        
        return answer;
    }
}