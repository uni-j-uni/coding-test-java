import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] answer = new Integer[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i] - n;
        }
        
        Arrays.sort(answer, (a, b) -> {
            if (Math.abs(a) == Math.abs(b)) {
                return Integer.compare(b, a);
            } return Integer.compare(Math.abs(a), Math.abs(b));
        });
        
        for (int i = 0; i < numlist.length; i++) {
            answer[i] += n;
        }
        
        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}