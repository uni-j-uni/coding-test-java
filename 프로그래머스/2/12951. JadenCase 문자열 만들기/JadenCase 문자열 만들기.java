class Solution {
    public String solution(String s) {
        String answer = "";
        char[] array = s.toLowerCase().toCharArray();
        
        answer += Character.toUpperCase(array[0]);
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == ' ') array[i + 1] = Character.toUpperCase(array[i + 1]);
                answer += array[i + 1];
        }
        
        return answer;
    }
}