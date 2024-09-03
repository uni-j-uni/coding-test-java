class Solution {
    public int solution(int n) {
        int total = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == total) return n;
        }
    }
}