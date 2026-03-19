import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        int x1, x2, y1, y2;
        
        x1 = Math.min(Math.min(Math.min(dots[0][0], dots[1][0]), dots[2][0]), dots[3][0]);
        x2 = Math.max(Math.max(Math.max(dots[0][0], dots[1][0]), dots[2][0]), dots[3][0]);
        y1 = Math.min(Math.min(Math.min(dots[0][1], dots[1][1]), dots[2][1]), dots[3][1]);
        y2 = Math.max(Math.max(Math.max(dots[0][1], dots[1][1]), dots[2][1]), dots[3][1]);
        
        return (x2 - x1) * (y2 - y1);
    }
}