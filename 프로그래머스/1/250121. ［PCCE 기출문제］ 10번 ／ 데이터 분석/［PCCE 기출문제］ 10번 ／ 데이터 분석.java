import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int cnt = 0, index = condition(ext);

        for (int i = 0; i < data.length; i++) {
            if (data[i][index] < val_ext) cnt++;
        }

        int[][] answer = new int[cnt][data[0].length];
        Arrays.sort(data, Comparator.comparingInt((int[] o) -> o[condition(ext)]));

        for (int i = 0; i < cnt; i++) {
            if (data[i][index] < val_ext) answer[i] = data[i];
        }

        Arrays.sort(answer, Comparator.comparingInt((int[] o) -> o[condition(sort_by)]));

        return answer;
    }

    private int condition(String compose) {
        return switch (compose) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };
    }
}