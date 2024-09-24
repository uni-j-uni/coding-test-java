class Solution {
    public int solution(String dartResult) {
        int answer = 0, score = 0, before = 0;
        char[] array = dartResult.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 48 && array[i] <= 57) {
                score = array[i] - 48;
                if (array[i] == 49 && array[i + 1] == 48) {
                    score = 10;
                    i++;
                }
                i++;
            }

            switch (array[i]) {
                case 'S':
                    answer += score;
                    break;
                case 'D':
                    score = (int)Math.pow(score, 2);
                    answer += score;
                    break;
                case 'T':
                    score = (int)Math.pow(score, 3);
                    answer += score;
                    break;
            }

            if (i + 1 == array.length) break;
            if (array[i + 1] == '*') {
                answer += before + score;
                i++;
                if (i - 3 > 0 && array[i - 3] == '*') answer += before;
            }
            else if (array[i + 1] == '#') {
                score *= -1;
                answer += score * 2;
                i++;
            }
            if (i + 3 < array.length && array[i + 3] == '*') before = score;
        }

        return answer;
    }
}