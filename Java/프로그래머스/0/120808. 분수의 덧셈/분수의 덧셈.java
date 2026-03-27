class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int a = numer, b = denom;
        
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        answer[0] = numer / a;
        answer[1] = denom / a;
        
        return answer;
    }
}