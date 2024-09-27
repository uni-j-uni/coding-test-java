class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            for (char word : targets[i].toCharArray()) {
                int min = Integer.MAX_VALUE;

                for (String s : keymap) {
                    if (s.indexOf(word) != -1) {
                        min = Math.min(min, s.indexOf(word) + 1);
                    }
                }

                if (min == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += min;
                }
            }
        }

        return answer;
    }
}