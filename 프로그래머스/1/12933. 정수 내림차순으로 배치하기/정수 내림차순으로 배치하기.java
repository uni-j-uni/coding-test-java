import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] strings = Long.toString(n).split("");

        Arrays.sort(strings, Collections.reverseOrder());

        return Long.parseLong(String.join("", strings));
    }
}