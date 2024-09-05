import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] strings = s.split("");

        Arrays.sort(strings, Collections.reverseOrder());

        return Long.parseLong(String.join("", strings));
    }
}