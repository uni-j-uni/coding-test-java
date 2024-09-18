class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0, rest = 0;
        
        while (n >= a) {
            answer += n / a * b;
            rest = n % a;
            n = n / a * b + rest;
        }
        
        return answer;
    }
}