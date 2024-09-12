class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            answer += (int) (Math.pow(3, i) * (sb.charAt(i) - 48));
        }

        return answer;
    }
}