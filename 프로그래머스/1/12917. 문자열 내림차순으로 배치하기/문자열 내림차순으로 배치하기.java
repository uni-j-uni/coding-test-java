class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 122; i >= 65; i--) {
            for (char ch : s.toCharArray()) {
                if (ch == i) sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}