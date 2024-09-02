import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0, sum;

        for (int i = 1; i <= n / 2; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    j = n;
                }
                if (sum > n) j = n;
            }
        }

        return answer + 1;
    }
}