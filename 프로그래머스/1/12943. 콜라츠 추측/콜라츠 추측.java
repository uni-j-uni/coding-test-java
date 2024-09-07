class Solution {
    public int solution(long num) {
        int cnt = 0;
        
        while (cnt != 500) {
            if (num == 1) return cnt;
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;

            cnt++;
        }
        
        return -1;
    }
}