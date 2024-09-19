import java.util.Stack;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for (int i = cards1.length - 1; i >= 0; i--) {
            stack1.push(cards1[i]);
        }
        for (int i = cards2.length - 1; i >= 0; i--) {
            stack2.push(cards2[i]);
        }

        for (String word : goal) {
            if (!stack1.isEmpty() && stack1.peek().equals(word)) stack1.pop();
            else if (!stack2.isEmpty() && stack2.peek().equals(word)) stack2.pop();
            else return "No";
        }
        return "Yes";
    }
}