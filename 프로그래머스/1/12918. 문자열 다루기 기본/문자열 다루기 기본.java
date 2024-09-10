class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        
        for (char ch : s.toCharArray()) {
            if (ch > 57 || ch < 48) return false;
        }
        
        return true;
    }
}