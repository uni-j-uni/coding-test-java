class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = new String[] { "aya", "ye", "woo", "ma" };
        
        for (String word : babbling) {
            for (int i = 0; i < 4; i++) {
                if (word.contains(words[i]) && !word.contains(words[i] + words[i])) {
                    word = word.replaceAll(words[i], ",");
                }
            }
            if (word.split(",").length == 0) answer++;
        }
        
        return answer;
    }
}