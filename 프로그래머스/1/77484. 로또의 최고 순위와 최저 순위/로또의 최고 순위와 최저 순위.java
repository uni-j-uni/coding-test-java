class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0, correct = 7;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) correct--;
            }
        }
        
        correct = correct == 7 ? 6 : correct;
        zero = zero == 6 ? 5 : zero;
        answer[0] = correct - zero;
        answer[1] = correct;
        
        return answer;
    }
}