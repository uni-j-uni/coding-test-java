import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        if (ingredient.length < 4) return 0;
        
        stack.push(ingredient[0]);
        stack.push(ingredient[1]);
        stack.push(ingredient[2]);

        for (int i = 3; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            if (stack.size() > 3 && stack.get(stack.size() - 1) == 1 && stack.get(stack.size() - 2) == 3 && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 4) == 1) {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }
        }

        return answer;
    }
}