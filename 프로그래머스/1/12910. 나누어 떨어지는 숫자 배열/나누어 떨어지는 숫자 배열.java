import java.util.Arrays;

class Solution {
        public int[] solution(int[] arr, int divisor) {
            int length = 0, i = 0;

            for (int num : arr) {
                if (num % divisor == 0) length++;
            }
            if (length == 0) {
                int[] answer = new int[] { -1 };
                return answer;
            }

            int[] answer = new int[length];

            for (int num : arr) {
                if (num % divisor == 0) {
                    answer[i] = num;
                    i++;
                }
            }
            Arrays.sort(answer);

            return answer;
        }
}