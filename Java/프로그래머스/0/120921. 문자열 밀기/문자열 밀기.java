class Solution {
    public int solution(String A, String B) {
        int cnt = 0;
        
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) return cnt;
            cnt++;
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
        }
        
        return -1;
    }
}