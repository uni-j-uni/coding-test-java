class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int large = Math.max(n, m), small = Math.min(n, m);
        
        for (int i = small; i > 0; i--) {
            if (large % i == 0 && small % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        for (int i = 1; i <= small; i++) {
            if (large * i % small == 0) {
                answer[1] = large * i;
                break;
            }
        }
        
        return answer;
    }
}