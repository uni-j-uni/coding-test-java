class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length - 1; i++) {
            int sec = 1;
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (prices[i] <= prices[j]) {
                    sec++;
                } else {
                    break;
                }
            }
            answer[i] = sec;
        }
        
        return answer;
    }
}
// 소요 시간: 9M 36S