import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        
        for (int need : d) {
            if (budget - need < 0) break;
            count++;
            budget -= need;
        }
        return count;
    }
}