class Solution {
    public int solution(int[][] sizes) {
        int[][] reset = new int[sizes.length][sizes[0].length];
        int width = Integer.MIN_VALUE, height = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            reset[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            reset[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }

        for (int[] resets : reset) {
            width = Math.max(width, resets[0]);
            height = Math.max(height, resets[1]);
        }

        return width * height;
    }
}