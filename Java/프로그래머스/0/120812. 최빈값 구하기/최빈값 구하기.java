import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[][] countArr = new int[1001][2];
        
        for (int i = 0; i < 1001; i++) {
            countArr[i][1] = i;
        }
        
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]][0]++;
        }
        
        Arrays.sort(countArr, (b, a) -> a[0] - b[0]);
        
        if (countArr[0][0] == countArr[1][0]) return -1;
        return countArr[0][1];
    }
}