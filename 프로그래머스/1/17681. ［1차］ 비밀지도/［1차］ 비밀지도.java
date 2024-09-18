class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        long[] result = new long[n];

        for (int i = 0; i < n; i++) {
            result[i] = Long.parseLong(Integer.toBinaryString(arr1[i])) + Long.parseLong(Integer.toBinaryString(arr2[i]));
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (result[i] % 10 == 0) sb.append(' ');
                else sb.append('#');
                result[i] /= 10;
            }
            answer[i] = sb.reverse().toString();
        }

        return answer;
    }
}