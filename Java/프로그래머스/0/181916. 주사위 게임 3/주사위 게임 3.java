import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Set<Integer> set = new HashSet<>();
        int[] arr = { a, b, c, d };
        
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        Arrays.sort(arr);
        
        if (set.size() == 1) {
            return 1111 * a;
        } else if (set.size() == 2) {
            int triple, num;
            if (arr[0] == arr[1] && arr[2] == arr[3]) {
                return (arr[0] + arr[3]) * Math.abs(arr[0] - arr[3]);
            } else {
                if (arr[0] == arr[1]) {
                    triple = arr[0];
                    num = arr[3];
                } else {
                    triple = arr[3];
                    num = arr[0];
                }
                return (int) Math.pow(10 * triple + num, 2);
            }
        } else if (set.size() == 3) {
            int[] differ = new int[2];
            int doub = 0, index = 0;
            
            for (int i = 0; i < 3; i++) {
                if (arr[i] == arr[i + 1]) {
                    doub = arr[i];
                }
            }
            
            for (int i = 0; i < 4; i++) {
                if (arr[i] != doub) {
                    differ[index] = arr[i];
                    index++;
                }
            }
            
            return differ[0] * differ[1];
        }
        
        return arr[0];
    }
}