class Solution {
    public int solution(String s) {
        int answer = 1, cnt1 = 1, cnt2 = 0;
        char word = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == word) cnt1++;
            else cnt2++;
            if (i + 1 < s.length() && cnt1 == cnt2) {
                answer++;
                word = s.charAt(i + 1);
                cnt1 = 1;
                cnt2 = 0;
                i++;
            }
        }
        
        return answer;
    }
}