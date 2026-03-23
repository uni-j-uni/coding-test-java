class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        for (int i = 0; i < code.length(); i++) {
            if (code.substring(i, i + 1).equals("1")) {
                mode = !mode;
                continue;
            }
            
            if (i % 2 == 0 && !mode) {
                answer += code.charAt(i);
            } else if (i % 2 == 1 && mode) {
                answer += code.charAt(i);
            }
        }
        if (answer.isEmpty()) return "EMPTY";
        
        return answer;
    }
}