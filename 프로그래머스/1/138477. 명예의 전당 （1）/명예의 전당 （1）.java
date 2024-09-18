import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hof = new int[k];
        
        for (int i = 0; i < (Math.min(k, score.length)); i++) {
            hof[0] = score[i];
            Arrays.sort(hof);
            answer[i] = hof[k - i - 1];
        }
        
        for (int i = k; i < score.length; i++) {
            if (hof[0] < score[i]) {
                hof[0] = score[i];
                Arrays.sort(hof);
            }
            answer[i] = hof[0];
        }
                
        return answer;
    }
}