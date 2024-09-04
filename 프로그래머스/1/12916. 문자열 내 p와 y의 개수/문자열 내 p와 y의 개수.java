class Solution {
    boolean solution(String s) {
        int cnt = 0;
        s = s.toLowerCase();
        
        for (char ch : s.toCharArray()) {
            if (ch == 'p') cnt++;
            else if (ch == 'y') cnt--;
        }
        
        return cnt == 0;
    }
}