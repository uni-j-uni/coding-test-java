class Solution {
    public int[] solution(String[] wallpaper) {
        int rows = wallpaper.length;
        int cols = wallpaper[0].length();
        int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    x1 = i;
                    break;
                }
            }
            if (x1 != -1) {
                break;
            }
        }
        
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (wallpaper[i].charAt(j) == '#') {
                    x2 = i + 1;
                    break;
                }
            }
            if (x2 != -1) {
                break;
            }
        }
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    y1 = i;
                    break;
                }
            }
            if (y1 != -1) {
                break;
            }
        }
        
        for (int i = cols - 1; i >= 0; i--) {
            for (int j = rows - 1; j >= 0; j--) {
                if (wallpaper[j].charAt(i) == '#') {
                    y2 = i + 1;
                    break;
                }
            }
            if (y2 != -1) {
                break;
            }
        }
        
        return new int[] { x1, y1, x2, y2 };
    }
}