import java.util.Arrays;

class Solution {
    int remove = 0, trans = 0;
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            for (char word : s.toCharArray()) {
                if (word == '0') remove++;
            }
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());

            trans++;
        }

        answer[0] = trans;
        answer[1] = remove;

        return answer;
    }
}