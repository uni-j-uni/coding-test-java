import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(array[0]);

        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(array[i])) {
                stack.pop();
            }
            else stack.push(array[i]);
        }

        if (stack.isEmpty()) return 1;
        else return 0;
    }
}