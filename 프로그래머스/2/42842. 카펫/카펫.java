class Solution {
    public int[] solution(int brown, int yellow) {
        int row = 3;

        while(true) {
            int col = (brown / 2) - row + 2;
            if (row * col - brown == yellow) {
                return new int[] { col, row };
            }
            row++;
        }
    }
}