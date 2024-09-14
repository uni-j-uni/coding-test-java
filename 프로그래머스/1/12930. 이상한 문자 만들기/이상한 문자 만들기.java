class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                sb.append(' ');
            }
            else {
                if (index % 2 == 0) sb.append((char)(s.charAt(i) - 32));
                else sb.append(s.charAt(i));
                index++;
            }
        }

        return sb.toString();
    }
}