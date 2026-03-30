import java.util.HashSet;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0, idx = 0;
        float[] gradient = new float[6];
        
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                gradient[idx] = (float)(dots[j][1] - dots[i][1]) / (float)(dots[j][0] - dots[i][0]);
                idx++;
            }
        }
        
        if (gradient[0] == gradient[5]) return 1;
        if (gradient[1] == gradient[4]) return 1;
        if (gradient[2] == gradient[3]) return 1;
        
        return 0;
    }
}