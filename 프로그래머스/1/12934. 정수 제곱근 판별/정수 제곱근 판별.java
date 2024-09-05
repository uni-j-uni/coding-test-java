class Solution {
    public long solution(long n) {
        for (double i = 1; i <= Math.sqrt(n); i++) {
            if (i == Math.sqrt(n)) {
                return (long)Math.pow(i + 1, 2);
            }
        }
        
        return -1;
    }
}