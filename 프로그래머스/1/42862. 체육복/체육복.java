import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        int lostCount = 0;
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] != -1) {
                lostCount++;
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] != -1) {
                for (int j = 0; j < lost.length; j++) {
                    if (lost[j] != -1 && (reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1)) {
                        lost[j] = -1;
                        lostCount--;
                        break;
                    }
                }
            }
        }

        return n - lostCount;
    }
}