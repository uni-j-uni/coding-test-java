import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {

        int answer = 1;
        int totalRow = (n - 1) / w + 1;
        int numRow = (num - 1) / w + 1;
        int numCol = (num - 1) % w;
        int lastCount = (n % w == 0) ? w : n % w;

        if (numRow % 2 == 0) {
            numCol = w - 1 - numCol;
        }

        for (int r = numRow + 1; r <= totalRow; r++) {
            int col = numCol;

            if (r % 2 == 0) {
                col = w - 1 - col;
            }

            if (r == totalRow) {
                if (col >= lastCount) break;
            }

            answer++;
        }
        return answer;
    }
}