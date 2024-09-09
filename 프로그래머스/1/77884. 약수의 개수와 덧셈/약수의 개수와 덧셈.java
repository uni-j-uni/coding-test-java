class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int cnt = 1;
            
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            
            answer += cnt % 2 == 0 ? i : -i;
        }
        
        return answer;
    }
}