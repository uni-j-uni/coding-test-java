class Solution {
    public int[] solution(int N, int[] stages) {
        int[] st2 = new int[N + 1];

        for (int stage : stages) {
            st2[stage - 1]++;
        }

        for (int i = N; i >= 1; i--) {
            st2[i-1] += st2[i];
        }

        int[] answer = new int[N];

        for (int i = 1; i <= N; i++) {
            answer[i - 1] = i;
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                int l = answer[j];
                int r = answer[j + 1];
                double rr = st2[r - 1] != 0 ? (double) st2[r] / st2[r - 1] : 1;
                double lr = st2[l - 1] != 0 ? (double) st2[l] / st2[l - 1] : 1;
                if (rr < lr) {
                    int tmp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tmp;
                }
            }
        }
        return answer;
    }
}