class Solution {
    public int solution(int[][] sizes) {
        int width = 0, height = 0;

        for (int[] card : sizes) {
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }

        return width * height;
    }
}