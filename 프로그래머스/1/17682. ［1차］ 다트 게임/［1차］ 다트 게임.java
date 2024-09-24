import java.util.stream.IntStream;

class Solution {
    public int solution(String dartResult) {
        int[] point = new int[4];

        for (int i = 0, index = 1; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);

            if (point[index - 1] == 1 && ch - '0' == 0){
                point[index - 1] *= 10;
                continue;
            } else if (0 <= ch - '0' && ch - '0' <= 9){
                point[index++] = ch - '0';
                continue;
            }

            if (ch == 'D') {
                point[index - 1] = (int) Math.pow(point[index - 1], 2);
            } else if (ch == 'T') {
                point[index - 1] = (int) Math.pow(point[index - 1], 3);
            } else if (ch == '*'){
                point[index - 1] *= 2;
                point[index - 2] *= 2;
            } else if (ch == '#') point[index - 1] *= -1;
        }

        return IntStream.of(point).sum();
    }
}