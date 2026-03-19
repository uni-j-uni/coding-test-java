class Solution {
    public int[] solution(int[][] score) {
        int[] sum = new int[score.length];
        int[] answer = new int[score.length];
        int rank = 1;
        
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < score.length; i++) {
            answer[i] = 1;

            for (int j = 0; j < score.length; j++) {
                if (sum[j] > sum[i]) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}