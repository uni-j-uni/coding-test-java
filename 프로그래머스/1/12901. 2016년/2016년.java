class Solution {
    public String solution(int a, int b) {
        return new String[] {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}
        [(new int[] {0, 4, 0, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3}[a] + b) % 7];
    }
}